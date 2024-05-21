package com.example.leetcode;

import java.util.concurrent.Semaphore;

public class Easy1114 {
    private Semaphore firstJobDone = new Semaphore(1); // Semaphore for first job, initially available
    private Semaphore secondJobDone = new Semaphore(0); // Semaphore for second job, initially unavailable
    private Semaphore thirdJobDone = new Semaphore(0); // Semaphore for third job, initially unavailable

    public Easy1114() {
        // Constructor
    }

    // Method for the first job; prints "first"
    public void first(Runnable printFirst) throws InterruptedException {
        firstJobDone.acquire(); // Wait for the first job's semaphore to be available
        printFirst.run(); // Run the printFirst task; this should print "first"
        secondJobDone.release(); // Release the second job semaphore, allowing the second job to run
    }

    // Method for the second job; prints "second"
    public void second(Runnable printSecond) throws InterruptedException {
        secondJobDone.acquire(); // Wait for the second job's semaphore to be available
        printSecond.run(); // Run the printSecond task; this should print "second"
        thirdJobDone.release(); // Release the third job semaphore, allowing the third job to run
    }

    // Method for the third job; prints "third"
    public void third(Runnable printThird) throws InterruptedException {
        thirdJobDone.acquire(); // Wait for the third job's semaphore to be available
        printThird.run(); // Run the printThird task; this should print "third"
        firstJobDone.release(); // Release the first job semaphore, allowing the cycle of jobs to be restarted (if necessary)
    }
}

//class Foo {
//    private final CountDownLatch secondLatch;
//    private final CountDownLatch thirdLatch;
//
//    public Foo() {
//        secondLatch = new CountDownLatch(1);
//        thirdLatch = new CountDownLatch(1);
//    }
//
//    public void first(Runnable printFirst) throws InterruptedException {
//        printFirst.run();
//        secondLatch.countDown(); // 通知 second 已完成
//    }
//
//    public void second(Runnable printSecond) throws InterruptedException {
//        secondLatch.await(); // 等待 first 完成
//        printSecond.run();
//        thirdLatch.countDown(); // 通知 third 已完成
//    }
//
//    public void third(Runnable printThird) throws InterruptedException {
//        thirdLatch.await(); // 等待 second 完成
//        printThird.run();
//    }
//}

//class Foo {
//
//    private boolean firstFinished = false;
//    private boolean secondFinished = false;
//
//    public Foo() {
//    }
//
//    public void first(Runnable printFirst) throws InterruptedException {
//
//        // printFirst.run() outputs "first". Do not change or remove this line.
//        printFirst.run();
//        synchronized (this) {
//            firstFinished = true;
//            notifyAll();
//        }
//    }
//
//    public synchronized void second(Runnable printSecond) throws InterruptedException {
//        while (!firstFinished) {
//            wait();
//        }
//        // printSecond.run() outputs "second". Do not change or remove this line.
//        printSecond.run();
//        secondFinished = true;
//        notifyAll();
//    }
//
//    public synchronized void third(Runnable printThird) throws InterruptedException {
//        while (!secondFinished) {
//            wait();
//        }
//        // printThird.run() outputs "third". Do not change or remove this line.
//        printThird.run();
//    }
//}