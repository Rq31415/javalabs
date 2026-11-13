package edu.course.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }
    @Test
    void returnsTrueForNegativeEvenNumber() {
        boolean result = CourseToolkit.isEven(-8);
        assertTrue(result);
    }
    @Test
    void returnsTrueForPrimeNumber() {
        assertTrue(CourseToolkit.isPrime(7));
    }

    @Test
    void returnsFalseForCompositeNumber() {
        assertFalse(CourseToolkit.isPrime(4));
    }

    @Test
    void returnsFalseForNumberLessThanTwo() {
        assertFalse(CourseToolkit.isPrime(1));
        assertFalse(CourseToolkit.isPrime(0));
        assertFalse(CourseToolkit.isPrime(-5));
    }

    @Test
    void returnsTrueForTwoAndPrimeSquares() {
        assertTrue(CourseToolkit.isPrime(2));
        assertTrue(CourseToolkit.isPrime(3));
    }

    @Test
    void returnsTrueForPalindromeString() {
        assertTrue(CourseToolkit.isPalindrome("level"));
        assertTrue(CourseToolkit.isPalindrome("aba"));
    }

    @Test
    void returnsFalseForNonPalindromeString() {
        assertFalse(CourseToolkit.isPalindrome("hello"));
    }

    @Test
    void throwsExceptionForNullPalindrome() {
        org.junit.jupiter.api.Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> CourseToolkit.isPalindrome(null)
        );
    }

    @Test
    void returnsCorrectAverageForArray() {
        int[] numbers = {2, 4, 6};
        org.junit.jupiter.api.Assertions.assertEquals(4.0, CourseToolkit.average(numbers), 0.0001);
    }

    @Test
    void throwsExceptionForNullOrEmptyAverageArray() {
        org.junit.jupiter.api.Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> CourseToolkit.average(null)
        );
        org.junit.jupiter.api.Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> CourseToolkit.average(new int[]{})
        );
    }
}
