package guessnumber;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class GuessGameTest {
    @Test
    void should_try_at_most_6_times() {

        // always try wrong input, there should be at most 6 times
        Answer answer = mock(Answer.class);
        when(answer.guess("2 2 3 4")).thenReturn("3A1B");

        GameInputService gameInputService = mock(GameInputService.class);
        when(gameInputService.readLine()).thenReturn("2 2 3 4");

        GuessGame guessGame = new GuessGame();
        guessGame.setAnswer(answer);
        guessGame.setGameInputService(gameInputService);


        guessGame.play();
        verify(answer, atMost(6)).guess(anyString());
    }

    @Test
    void should_return_false_when_missed_max_trying_times() {

        // always try wrong input, there should be at most 6 times
        Answer answer = mock(Answer.class);
        when(answer.guess("2 2 3 4")).thenReturn("3A1B");

        GameInputService gameInputService = mock(GameInputService.class);
        when(gameInputService.readLine()).thenReturn("2 2 3 4");

        GuessGame guessGame = new GuessGame();
        guessGame.setAnswer(answer);
        guessGame.setGameInputService(gameInputService);


        assertFalse(guessGame.play());

    }

    @Test
    void should_try_once_given_right_input() {

        // try a right input
        Answer answer = mock(Answer.class);
        when(answer.guess("1 2 3 4")).thenReturn("4A0B");

        GameInputService gameInputService = mock(GameInputService.class);
        when(gameInputService.readLine()).thenReturn("1 2 3 4");

        GuessGame guessGame = new GuessGame();
        guessGame.setAnswer(answer);
        guessGame.setGameInputService(gameInputService);

        guessGame.play();
        verify(answer, atMost(1)).guess(anyString());
        verify(answer, atMost(1)).guess("1 2 3 4");
    }

    @Test
    void should_return_true_when_hit_the_right_answer() {

        // try a right input
        Answer answer = mock(Answer.class);
        when(answer.guess("1 2 3 4")).thenReturn("4A0B");

        GameInputService gameInputService = mock(GameInputService.class);
        when(gameInputService.readLine()).thenReturn("1 2 3 4");

        GuessGame guessGame = new GuessGame();
        guessGame.setAnswer(answer);
        guessGame.setGameInputService(gameInputService);

        assertTrue(guessGame.play());

    }
}