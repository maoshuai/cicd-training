package guessnumber;

public class GuessGame {
    private GuessGame(){
    }
    private Answer answer;

    private TrialHistory trialHistory;



    private GameInputService gameInputService;



    private GameOutputService gameOutputService;



    /**
     *
     * @return true if hit the right answer
     */
    public boolean play(){
        gameOutputService.println("Please input your answer: ");
        for(int i=0;i<6;i++){
            String input = gameInputService.readLine();
            String guessOutput = answer.guess(input);
            if("4A0B".equals(guessOutput)){
                gameOutputService.println("Bingo! You hit the answer: " + guessOutput);
                return true;
            }else{
                gameOutputService.println("Sorry! " + guessOutput);
                trialHistory.showHistory();
            }
            trialHistory.addTrial(input, guessOutput);
        }
        gameOutputService.println("Sorry! You've run out of your chances");
        return false;
    }


    public static class GuessGameBuilder{
        private GuessGame guessGame = new GuessGame();
        public GuessGameBuilder setAnswer(Answer answer) {
            guessGame.answer = answer;
            return this;
        }

        public GuessGameBuilder setTrialHistory(TrialHistory trialHistory) {
            guessGame.trialHistory = trialHistory;
            return this;
        }

        public GuessGameBuilder setGameInputService(GameInputService gameInputService) {
            guessGame.gameInputService = gameInputService;
            return this;
        }

        public GuessGameBuilder setGameOutputService(GameOutputService gameOutputService) {
            guessGame.gameOutputService = gameOutputService;
            return this;
        }
        public GuessGame build(){
            if(guessGame.gameOutputService == null){
                throw new NullPointerException("gameOutputService");
            }
            if(guessGame.gameInputService == null){
                throw new NullPointerException("gameInputService");
            }
            if(guessGame.trialHistory == null){
                throw new NullPointerException("trialHistory");
            }
            if(guessGame.answer == null){
                throw new NullPointerException("answer");
            }
            return guessGame;
        }


    }
}

