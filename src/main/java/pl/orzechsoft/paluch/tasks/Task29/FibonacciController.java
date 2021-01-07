package pl.orzechsoft.paluch.tasks.Task29;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.orzechsoft.paluch.tasks.Task29.service.FibonacciService;

@RestController
public class FibonacciController {

    private final FibonacciService fibonacciService;

    public FibonacciController(FibonacciService fibonacciService) {
        this.fibonacciService = fibonacciService;
    }
    public int fib(@RequestParam int a){
        int fib = fibonacciService.fib(a);
        return fib;
    }
}