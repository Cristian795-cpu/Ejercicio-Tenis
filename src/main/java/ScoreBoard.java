public class ScoreBoard {
    //Atributos
    private Player player1;
    private Player player2;

    //Constructor

    public ScoreBoard(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    //Metodos
    public void showScoreBoard(){
        System.out.println("Name" + this.player1.getNombre());
        System.out.println("Score" + this.player1.getPuntaje());
        System.out.println("Name" + this.player2.getNombre());
        System.out.println("Score" + this.player2.getPuntaje());

    }
}
