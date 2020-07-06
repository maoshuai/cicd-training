package unit.test.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void should_return_as_it_is_given_multiple_of_neither_5_nor_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.handleNumber(1));
    }

    @Test
    void should_return_Fizz_is_given_multiple_of_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Fizz", fizzBuzz.handleNumber(3));
    }

    @Test
    void should_return_Fizz_is_given_multiple_of_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.handleNumber(5));
    }

    @Test
    void should_return_FizzBuzz_is_given_multiple_of_both_5_and_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("FizzBuzz", fizzBuzz.handleNumber(15));
    }
}