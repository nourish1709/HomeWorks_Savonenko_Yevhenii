package homeworks.homework11;

import java.util.concurrent.RecursiveTask;

public class CalculateFibonacci extends RecursiveTask<Long> {
    private final long fibonacci;

    public CalculateFibonacci(long fibonacci) {
        this.fibonacci = fibonacci;
    }

    @Override
    protected Long compute() {
        if (fibonacci <= 0) {
            return fibonacci;
        } else {
            CalculateFibonacci fibonacci1 = new CalculateFibonacci(fibonacci - 1);
            fibonacci1.fork();
            CalculateFibonacci fibonacci2 = new CalculateFibonacci(fibonacci - 2);
            return fibonacci2.compute() + fibonacci1.join();
        }
    }
}
