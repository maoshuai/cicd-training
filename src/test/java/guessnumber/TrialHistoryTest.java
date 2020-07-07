package guessnumber;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class TrialHistoryTest {
    @Test
    void should_show_3_lines_of_history_given_3_trials() {
        GameOutputService gameOutputService = mock(GameOutputService.class);
        TrialHistory trialHistory = new TrialHistory(gameOutputService);
        trialHistory.addTrial("xxx", "yyy");
        trialHistory.addTrial("xxx", "yyy");
        trialHistory.addTrial("xxx", "yyy");
        trialHistory.showHistory();

        verify(gameOutputService, times(3)).println(anyString());

    }

    @Test
    void should_show_expected_history_format_given_a_trial() {
        GameOutputService gameOutputService = mock(GameOutputService.class);
        TrialHistory trialHistory = new TrialHistory(gameOutputService);
        trialHistory.addTrial("xxx", "yyy");
        trialHistory.showHistory();

        verify(gameOutputService, times(1)).println("1. xxx:yyy");

    }

    @Test
    void should_show_right_history_sequence_given_2_trials() {
        GameOutputService gameOutputService = mock(GameOutputService.class);
        TrialHistory trialHistory = new TrialHistory(gameOutputService);
        trialHistory.addTrial("1 2 3 4", "4A4B");
        trialHistory.addTrial("4 3 2 1", "0A4B");
        trialHistory.showHistory();

        verify(gameOutputService, times(1)).println("1. 1 2 3 4:4A4B");
        verify(gameOutputService, times(1)).println("2. 4 3 2 1:0A4B");

    }
}