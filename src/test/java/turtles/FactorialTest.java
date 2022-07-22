package turtles;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void factorialTest1() {
        Long expected = (long)24;
        Assert.assertEquals(expected, Factorial.factorial(4));
    }
    @Test
    public void factorialTest2() {
        Long expected = (long)720;
        Assert.assertEquals(expected, Factorial.factorial(6));
    }
    @Test
    public void factorialTest3() {
        Long expected = (long)1;
        Assert.assertEquals(expected, Factorial.factorial(1));
    }
}
