package guessnumber;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AnswerTest {
    @Test
    void should_return_four_digits_with_space_given_an_answer() {
        Answer answer = new Answer(Arrays.asList("1", "2", "3", "4"));
        assertEquals("1 2 3 4", answer.toPrintFormat());
    }


    @Test
    void should_output_1A0B_given_input_1567_when_answer_is_1234(){
        Answer answer = new Answer(Arrays.asList("1", "2", "3", "4"));
        assertEquals("1A0B", answer.guess("1 5 6 7"));
    }

    @Test
    void should_output_0A2B_given_input_2478_when_answer_is_1234(){
        Answer answer = new Answer(Arrays.asList("1", "2", "3", "4"));
        assertEquals("0A2B", answer.guess("2 4 7 8"));
    }

    @Test
    void should_output_1A2B_given_input_0324_when_answer_is_1234(){
        Answer answer = new Answer(Arrays.asList("1", "2", "3", "4"));
        assertEquals("1A2B", answer.guess("0 3 2 4"));
    }

    @Test
    void should_output_0A0B_given_input_5678_when_answer_is_1234(){
        Answer answer = new Answer(Arrays.asList("1", "2", "3", "4"));
        assertEquals("0A0B", answer.guess("5 6 7 8"));
    }
}