package guessnumber;

public class GameApp {
    public static void main(String[] args) {
        GuessGame game = new GuessGame();
        game.setAnswer(new AnswerGenerator().generate());
        game.setGameInputService(new GameInputService());
        GameOutputService gameOutputService = new GameOutputService();
        game.setGameOutputService(gameOutputService);
        game.setTrialHistory(new TrialHistory(gameOutputService));
        game.play();
    }
}
