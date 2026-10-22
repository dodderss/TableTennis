public class Game {
    Player player1;
    Player player2;
    Player winner;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Game playGame() {
        if (player1.skill > player2.skill) {
            this.winner = player1;
        } else if (player1.skill == player2.skill) {
            this.winner = Math.random() < 0.5 ? player1 : player2;
        } else {
            this.winner = player2;
        }
        return this;
    }
}
