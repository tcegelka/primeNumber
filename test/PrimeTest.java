import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

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
    void fiveIsPrime() {
        assertTrue(tester.isPrime(5));
    }

    @Test
    void twentyFiveIsNotPrime() {
        assertFalse(tester.isPrime(25));
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
    void largeEvenNotPrimeNumber() {
        assertFalse(tester.isPrime(7900));
    }

    @Test
    void largeNotPrimeNumber() {
        assertFalse(tester.isPrime(7909));
    }

    @Test
    void negativeRangeReturnsEmptyList() {
        ArrayList<Integer> expectedList = new ArrayList<>();

        assertEquals(tester.generate(-10, -1), expectedList);
    }

    @Test
    void zeroThroughTen() {
        ArrayList<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(3);
        expectedList.add(5);
        expectedList.add(7);

        assertEquals(tester.generate(0, 10), expectedList);
    }

    @Test
    void tenThroughZero() {
        ArrayList<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(3);
        expectedList.add(5);
        expectedList.add(7);

        assertEquals(tester.generate(10, 0), expectedList);
    }

    @Test
    void test7900Through7920() {
        ArrayList<Integer> expectedList = new ArrayList<>();
        expectedList.add(7901);
        expectedList.add(7907);
        expectedList.add(7919);

        assertEquals(tester.generate(7900, 7920), expectedList);
    }

    @Test
    void testInclusiveEndValues() {
        ArrayList<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(3);
        expectedList.add(5);
        expectedList.add(7);

        assertEquals(tester.generate(2, 7), expectedList);
    }

    @Test
    void testSingleValuePrime() {
        ArrayList<Integer> expectedList = new ArrayList<>();
        expectedList.add(11);

        assertEquals(tester.generate(11, 11), expectedList);
    }

    @Test
    void testSingleValueNotPrime() {
        ArrayList<Integer> expectedList = new ArrayList<>();

        assertEquals(tester.generate(12, 12), expectedList);
    }
}