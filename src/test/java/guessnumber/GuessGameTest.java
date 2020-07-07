package guessnumber;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class GuessGameTest {
    @Test
    void should_try_at_most_6_times() {
        Answer answer = mock(Answer.class);
        GuessGame guessGame = new GuessGame();
        guessGame.setAnswer(answer);
        guessGame.play();
        verify(answer, atMost(6)).guess(anyString());
    }
}