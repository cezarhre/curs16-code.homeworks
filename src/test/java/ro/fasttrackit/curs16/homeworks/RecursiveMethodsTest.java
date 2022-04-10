package ro.fasttrackit.curs16.homeworks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static  org.assertj.core.api.Assertions.*;

class RecursiveMethodsTest {

    @Test
    void testSumIntNumbers(){
        RecursiveMethods recursiveMethods = new RecursiveMethods();
        assertThat(recursiveMethods.sumN(0)).isZero();
        IllegalArgumentException exc = assertThrows(IllegalArgumentException.class,
                ()->recursiveMethods.sumN(-1));
        org.assertj.core.api.Assertions.assertThat(exc.getMessage()).isEqualTo("Illegal argument");
        assertThat(recursiveMethods.sumN(3)).isEqualTo(6);
        assertThat(recursiveMethods.sumN(10)).isEqualTo(55);
    }

    @Test
    void testSumEvenIntNumbers(){
        RecursiveMethods recursiveMethods = new RecursiveMethods();
        assertThat(recursiveMethods.sumEven(0)).isZero();
        IllegalArgumentException exc = assertThrows(IllegalArgumentException.class,
                ()->recursiveMethods.sumEven(-1));
        org.assertj.core.api.Assertions.assertThat(exc.getMessage()).isEqualTo("Illegal argument");
        assertThat(recursiveMethods.sumEven(4)).isEqualTo(6);
        assertThat(recursiveMethods.sumEven(5)).isEqualTo(6);
    }

    @Test
    void testAverseReverseString(){
        RecursiveMethods recursiveMethods = new RecursiveMethods();
        IllegalArgumentException exc = assertThrows(IllegalArgumentException.class,
                ()-> recursiveMethods.averseReverseString(null));
        org.assertj.core.api.Assertions.assertThat(exc.getMessage()).isEqualTo("Illegal argument");
        IllegalArgumentException except = assertThrows(IllegalArgumentException.class,
                ()-> recursiveMethods.averseReverseString(""));
        org.assertj.core.api.Assertions.assertThat(except.getMessage()).isEqualTo("Illegal argument");
        assertThat(recursiveMethods.averseReverseString("madam")).isEqualTo("madam");
        assertThat(recursiveMethods.averseReverseString("capac")).isEqualTo("capac");
    }

    @Test
    void testFirstLastLetterString(){
        RecursiveMethods recursiveMethods = new RecursiveMethods();
        assertThat(recursiveMethods.firstLastLetter("")).isTrue();
        assertThat(recursiveMethods.firstLastLetter("a")).isTrue();
        assertThat(recursiveMethods.firstLastLetter("madam")).isTrue();
        assertThat(recursiveMethods.firstLastLetter("capac")).isTrue();
        assertThat(recursiveMethods.firstLastLetter("capat")).isFalse();
    }

    @Test
    void testSumDigitsNumber(){
        RecursiveMethods recursiveMethods = new RecursiveMethods();
        assertThat(recursiveMethods.sumDigits(4)).isEqualTo(4);
        assertThat(recursiveMethods.sumDigits(0)).isEqualTo(0);
        assertThat(recursiveMethods.sumDigits(-1)).isEqualTo(-1);
        assertThat(recursiveMethods.sumDigits(25)).isEqualTo(7);
        assertThat(recursiveMethods.sumDigits(125)).isEqualTo(8);
        assertThat(recursiveMethods.sumDigits(34597)).isEqualTo(28);
    }

    @Test
    void testFibonacciArray(){
        RecursiveMethods recursiveMethods = new RecursiveMethods();
        assertThat(recursiveMethods.fibonacciArray(0)).isEqualTo(0);
        assertThat(recursiveMethods.fibonacciArray(1)).isEqualTo(1);
        assertThat(recursiveMethods.fibonacciArray(5)).isEqualTo(5);
        assertThat(recursiveMethods.fibonacciArray(10)).isEqualTo(55);
        assertThat(recursiveMethods.fibonacciArray(20)).isEqualTo(6765);

    }
}