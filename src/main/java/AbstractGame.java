public abstract class AbstractGame implements Game{
    private Player player1;
    private Player player2;
    private ScoreBoard scoreBoard;

    //Constructor
    public AbstractGame(Player player1, Player player2, ScoreBoard scoreBoard) {
        this.player1 = player1;
        this.player2 = player2;
        this.scoreBoard = scoreBoard;
    }



}
