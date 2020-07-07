package guessnumber;

import java.util.ArrayList;
import java.util.List;

/**
 * save and show play history
 */
public class TrialHistory {
    private List<String> userInputHistory = new ArrayList<>();
    private List<String> guessOutputHistory = new ArrayList<>();

    private GameOutputService gameOutputService;

    public TrialHistory(GameOutputService gameOutputService) {
        this.gameOutputService = gameOutputService;
    }

    public void addTrial(String userInput, String guessOutput){
        userInputHistory.add(userInput);
        guessOutputHistory.add(guessOutput);
    }

    public void showHistory(){

        for(int i=0;i<userInputHistory.size();i++){
            String historyItem = (i + 1) + ". " +
                    userInputHistory.get(i) +
                    ":" +
                    guessOutputHistory.get(i);
            gameOutputService.println(historyItem);
        }


    }
}
