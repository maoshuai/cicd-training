package guessnumber;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertTrue;

class AnswerGeneratorTest {

    @Test
    void should_generate_four_digits_with_space() {
        AnswerGenerator generator = new AnswerGenerator();
        String answer = generator.generate();
        Pattern compile = Pattern.compile("[0-9] [0-9] [0-9] [0-9]");
        assertTrue(compile.matcher(answer).matches());
    }
}