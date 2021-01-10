package pl.orzechsoft.paluch.tasks.Task29.service;

import org.springframework.stereotype.Service;

@Service
public class FibonacciService {

    public int fib(int whichFibonacciNumber) {
        if (whichFibonacciNumber < 0) {
            throw new IllegalArgumentException("WhichFibonacciNumber can't be negative");
        }
        int a = 0, b = 1, c;
        if (whichFibonacciNumber == 0) {
            return a;
        }
        for (int i = 2; i <= whichFibonacciNumber; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
}
