public class TennisGame extends AbstractGame{

    //Constructor
    public TennisGame(Player player1, Player player2, ScoreBoard scoreBoard) {
        super(player1, player2, scoreBoard);
    }

    @Override
    public void play() {

    }

    @Override
    public boolean isGameOver() {
        return false;
    }
}
