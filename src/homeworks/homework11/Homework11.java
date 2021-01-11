package homeworks.homework11;

import java.util.concurrent.ForkJoinPool;

public class Homework11 {
    public static final int FIBONACCI_NUM = 50;
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        CalculateFibonacci calculateFibonacci = new CalculateFibonacci(FIBONACCI_NUM);

        long result = -forkJoinPool.invoke(calculateFibonacci);
        System.out.println("The " + FIBONACCI_NUM + "-th Fibonacci number is " + result);
    }
}