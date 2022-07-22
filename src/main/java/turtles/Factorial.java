package turtles;

public class Factorial {
    public static Long factorial(Integer n) {
        if (n == 1) return (long)1;
        return n * factorial(n-1);
    }
}
