package turtles;

import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

public class GCDTest {
    @Test
    public void GCDTest1() {
        Instant start = Instant.now();
        Integer expected = 6;
        Assert.assertEquals(expected, GCD.GCD(24, 6));
        Instant finish = Instant.now();
        System.out.println(Duration.between(start, finish).toMillis());
    }
    @Test
    public void GCDTest2() {
        Instant start = Instant.now();
        Integer expected = 1;
        Assert.assertEquals(expected, GCD.GCD(25, 6));
        Instant finish = Instant.now();
        System.out.println(Duration.between(start, finish).toMillis());
    }
    @Test
    public void GCDTest3() {
        Instant start = Instant.now();
        Integer expected = 4;
        Assert.assertEquals(expected, GCD.GCD(124, 32));
        Instant finish = Instant.now();
        System.out.println(Duration.between(start, finish).toMillis());
    }
    @Test
    public void GCDTest4() {
        Instant start = Instant.now();
        Integer expected = 4;
        Assert.assertEquals(expected, GCD.GCD(3266124, 345332));
        Instant finish = Instant.now();
        System.out.println(Duration.between(start, finish).toMillis());
    }
}
