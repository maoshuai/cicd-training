package guessnumber;

public class GameApp {
    public static void main(String[] args) {
        GuessGame.GuessGameBuilder gameBuilder = new GuessGame.GuessGameBuilder();
        gameBuilder.setAnswer(new AnswerGenerator().generate());
        gameBuilder.setGameInputService(new GameInputService());
        GameOutputService gameOutputService = new GameOutputService();
        gameBuilder.setGameOutputService(gameOutputService);
        gameBuilder.setTrialHistory(new TrialHistory(gameOutputService));
        GuessGame game = gameBuilder.build();
        game.play();
    }
}
