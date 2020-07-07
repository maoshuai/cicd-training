package guessnumber;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class AnswerGeneratorTest {

    @Test
    void should_generate_four_digits_with_spaces() {
        String answer = new AnswerGenerator().generate();
        Pattern compile = Pattern.compile("[0-9] [0-9] [0-9] [0-9]");
        assertTrue(compile.matcher(answer).matches());
    }

    @Test
    void should_generate_digits_not_repeated() {
        String answer = new AnswerGenerator().generate();
        String [] digits = answer.split(" ");
        Set<String> digitsSet = new HashSet<>(Arrays.asList(digits));
        assertEquals(digitsSet.size(), digits.length);
    }

    @Test
    void should_generate_different_answers_when_execute_100_times() {
        boolean isDifferent = false;
        String lastAnswer = null;
        for (int i = 0; i < 100; i++) {
            String answer = new AnswerGenerator().generate();
            if(lastAnswer!=null && !lastAnswer.equals(answer)){
                isDifferent = true;
                break;
            }
            lastAnswer = answer;
        }
        assertTrue(isDifferent);
    }
}