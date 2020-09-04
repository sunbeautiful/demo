package com.example.projectdata.queue;

import lombok.SneakyThrows;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author 59326
 * @description
 * @date 2020/8/28 14:02
 */
public class BlockingQueueTest {
    public static class Basket {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(3);

        public void put() throws InterruptedException {
            queue.put("an apple");
        }

        public String get() throws InterruptedException {
            return queue.take();
        }

        public int getAppleNumber() {
            return queue.size();
        }
    }

    public static void test() throws InterruptedException {
        final Basket basket = new Basket();
        class product implements Runnable {
            @SneakyThrows
            @Override
            public void run() {
                while (true) {
                    System.out.println("生产apple start");
                    basket.put();
                    System.out.println("生产apple end");
                    Thread.sleep(100);
                }
            }
        }
        class Consumer implements Runnable {

            @SneakyThrows
            @Override
            public void run() {
                while (true) {
                    System.out.println("消费apple start");
                    basket.get();
                    System.out.println("消费apple end");
                    Thread.sleep(500);
                }
            }
        }
        ExecutorService service = Executors.newCachedThreadPool();
        service.submit(new product());
        service.submit(new Consumer());
        Thread.sleep(2000);
        service.shutdownNow();
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueueTest test = new BlockingQueueTest();
        test.test();
    }
}
