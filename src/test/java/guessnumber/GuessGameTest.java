package guessnumber;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

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

        GameOutputService gameOutputService = mock(GameOutputService.class);
        TrialHistory trialHistory = mock(TrialHistory.class);

        GuessGame.GuessGameBuilder guessGameBuilder = new GuessGame.GuessGameBuilder();
        guessGameBuilder.setAnswer(answer);
        guessGameBuilder.setGameInputService(gameInputService);
        guessGameBuilder.setGameOutputService(gameOutputService);
        guessGameBuilder.setTrialHistory(trialHistory);


        guessGameBuilder.build().play();
        verify(answer, atMost(6)).guess(anyString());
    }

    @Test
    void should_return_false_when_missed_max_trying_times() {

        // always try wrong input, there should be at most 6 times
        Answer answer = mock(Answer.class);
        when(answer.guess("2 2 3 4")).thenReturn("3A1B");

        GameInputService gameInputService = mock(GameInputService.class);
        when(gameInputService.readLine()).thenReturn("2 2 3 4");

        GameOutputService gameOutputService = mock(GameOutputService.class);
        TrialHistory trialHistory = mock(TrialHistory.class);

        GuessGame.GuessGameBuilder guessGameBuilder = new GuessGame.GuessGameBuilder();
        guessGameBuilder.setAnswer(answer);
        guessGameBuilder.setGameInputService(gameInputService);
        guessGameBuilder.setGameOutputService(gameOutputService);
        guessGameBuilder.setTrialHistory(trialHistory);
        GuessGame guessGame = guessGameBuilder.build();

        assertFalse(guessGame.play());

    }

    @Test
    void should_try_once_given_right_input() {

        // try a right input
        Answer answer = mock(Answer.class);
        when(answer.guess("1 2 3 4")).thenReturn("4A0B");

        GameInputService gameInputService = mock(GameInputService.class);
        when(gameInputService.readLine()).thenReturn("1 2 3 4");

        GameOutputService gameOutputService = mock(GameOutputService.class);
        TrialHistory trialHistory = mock(TrialHistory.class);

        GuessGame.GuessGameBuilder guessGameBuilder = new GuessGame.GuessGameBuilder();
        guessGameBuilder.setAnswer(answer);
        guessGameBuilder.setGameInputService(gameInputService);
        guessGameBuilder.setGameOutputService(gameOutputService);
        guessGameBuilder.setTrialHistory(trialHistory);
        GuessGame guessGame = guessGameBuilder.build();

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

        GameOutputService gameOutputService = mock(GameOutputService.class);
        TrialHistory trialHistory = mock(TrialHistory.class);

        GuessGame.GuessGameBuilder guessGameBuilder = new GuessGame.GuessGameBuilder();
        guessGameBuilder.setAnswer(answer);
        guessGameBuilder.setGameInputService(gameInputService);
        guessGameBuilder.setGameOutputService(gameOutputService);
        guessGameBuilder.setTrialHistory(trialHistory);
        GuessGame guessGame = guessGameBuilder.build();

        assertTrue(guessGame.play());

    }

    @Test
    void should_raise_exception_when_build_incomplete_game() {
        assertThrows(NullPointerException.class, ()->{
            new GuessGame.GuessGameBuilder().build();
        });

        assertThrows(NullPointerException.class, ()->{
            new GuessGame.GuessGameBuilder()
                    .setAnswer(new Answer(Arrays.asList("1", "2", "3", "4")))
                    .build();
        });

        assertThrows(NullPointerException.class, ()->{
            new GuessGame.GuessGameBuilder()
                    .setAnswer(new Answer(Arrays.asList("1", "2", "3", "4")))
                    .setGameInputService(new GameInputService())
                    .build();
        });
        assertThrows(NullPointerException.class, ()->{
            new GuessGame.GuessGameBuilder()
                    .setAnswer(new Answer(Arrays.asList("1", "2", "3", "4")))
                    .setGameInputService(new GameInputService())
                    .setGameOutputService(new GameOutputService())
                    .build();
        });

    }


    @Test
    void should_return_instance_when_build_complete_game() {

        GameOutputService gameOutputService = new GameOutputService();
        GuessGame game = new GuessGame.GuessGameBuilder()
                .setAnswer(new Answer(Arrays.asList("1", "2", "3", "4")))
                .setGameInputService(new GameInputService())
                .setGameOutputService(gameOutputService)
                .setTrialHistory(new TrialHistory(gameOutputService))
                .build();
        assertNotNull(game);

    }
}