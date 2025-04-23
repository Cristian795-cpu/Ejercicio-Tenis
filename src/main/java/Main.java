public class Main {
    public static void main(String[] args) {
        Player newPlayer1 = new Player("Pepe", 0);
        Player newPlayer2 = new Player("Juan", 0);
        ScoreBoard newScore = new ScoreBoard(newPlayer1, newPlayer2);
        newScore.showScoreBoard();
        playGame(new PinPongGame(newPlayer1, newPlayer2, newScore));

        /*TennisGame newTennisGame = new TennisGame(newPlayer1,newPlayer2, newScore);
        newTennisGame.isGameOver();*/
        Game newTennisGame = new TennisGame(newPlayer1,newPlayer2, newScore);
        newTennisGame.isGameOver();


    }

    public static void playGame(Game game){

        game.play();
    }
}
