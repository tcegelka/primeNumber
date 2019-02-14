import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PrimeTest {
    private Prime tester = new Prime();

    @Test
    void zeroIsNotPrime() {
        assertFalse(tester.isPrime(0));
    }

    @Test
    void oneIsNotPrime() {
        assertFalse(tester.isPrime(1));
    }

    @Test
    void twoIsPrime() {
        assertTrue(tester.isPrime(2));
    }

    @Test
    void threeIsPrime() {
        assertTrue(tester.isPrime(3));
    }

    @Test
    void negativeIsNotPrime() {
        assertFalse(tester.isPrime(-2));
    }

    @Test
    void largePrimeNumber() {
        assertTrue(tester.isPrime(7901));
    }

    @Test
    void largeNotPrimeNumber() {
        assertTrue(tester.isPrime(7900));
    }
}