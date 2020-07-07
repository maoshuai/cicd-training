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

    public void play(){
        for(int i=0;i<6;i++){
            answer.guess("");
        }
    }


}

