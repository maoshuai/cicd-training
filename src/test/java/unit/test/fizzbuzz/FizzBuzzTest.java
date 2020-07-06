package unit.test.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FizzBuzzTest {
    @Test
    void should_return_as_it_is_given_multiple_of_neither_5_nor_3() {
        FizzBuzz fizzBuzz = new FizzBuzz(null);
        assertEquals("1", fizzBuzz.handleNumber(1));
    }

    @Test
    void should_return_Fizz_is_given_multiple_of_3() {
        FizzBuzz fizzBuzz = new FizzBuzz(null);
        assertEquals("Fizz", fizzBuzz.handleNumber(3));
    }

    @Test
    void should_return_Fizz_is_given_multiple_of_5() {
        FizzBuzz fizzBuzz = new FizzBuzz(null);
        assertEquals("Buzz", fizzBuzz.handleNumber(5));
    }

    @Test
    void should_return_FizzBuzz_is_given_multiple_of_both_5_and_3() {
        FizzBuzz fizzBuzz = new FizzBuzz(null);
        assertEquals("FizzBuzz", fizzBuzz.handleNumber(15));
    }

    @Test
    void should_print_27_Fizz_when_print_answer() {
        FizzBuzzPrintService printService = mock(FizzBuzzPrintService.class);
        FizzBuzz fizzBuzz = new FizzBuzz(printService);
        fizzBuzz.printAnswer();

        verify(printService, times(27)).print("Fizz");
    }

    @Test
    void should_print_14_Buzz_when_print_answer() {
        FizzBuzzPrintService printService = mock(FizzBuzzPrintService.class);
        FizzBuzz fizzBuzz = new FizzBuzz(printService);
        fizzBuzz.printAnswer();

        verify(printService, times(14)).print("Buzz");
    }

}