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

    private GameOutputService gameOutputService;

    public void setGameOutputService(GameOutputService gameOutputService) {
        this.gameOutputService = gameOutputService;
    }

    /**
     *
     * @return true if hit the right answer
     */
    public boolean play(){
        for(int i=0;i<6;i++){
            String input = gameInputService.readLine();
            String guessOutput = answer.guess(input);
            if("4A0B".equals(guessOutput)){
                return true;
            }else{
                gameOutputService.println("Missed!");
                trialHistory.showHistory();
            }
            trialHistory.addTrial(input, guessOutput);
        }
        return false;
    }


}

