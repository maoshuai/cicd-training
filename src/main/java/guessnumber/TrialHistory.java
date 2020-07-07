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
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<userInputHistory.size();i++){
            sb.append(i+1).append(". ")
                    .append(userInputHistory.get(i))
                    .append(":").
                    append(guessOutputHistory.get(i));
            gameOutputService.println(sb.toString());
        }


    }
}
