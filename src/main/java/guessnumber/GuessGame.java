package guessnumber;

public class GuessGame {
    private Answer answer;

    private TrialHistory trialHistory;

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public void setTrialHistory(TrialHistory trialHistory) {
        this.trialHistory = trialHistory;
    }

    private GameInputService gameInputService;

    public void setGameInputService(GameInputService gameInputService) {
        this.gameInputService = gameInputService;
    }

    public void play(){
        for(int i=0;i<6;i++){
            String input = gameInputService.readLine();
            String guessOutput = answer.guess(input);
            if("4A0B".equals(guessOutput)){
                break;
            }
        }
    }


}

