package turtles;

public class GCD {
    public static Integer GCD(Integer a, Integer b) {
        if (b == 0) return a;
        return GCD(b, a%b);
    }
}
