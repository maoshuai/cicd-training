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


}