public class PinPongGame extends AbstractGame{

    //Constructor
    public PinPongGame(Player player1, Player player2, ScoreBoard scoreBoard) {
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
