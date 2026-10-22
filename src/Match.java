public class Match {
    Game[] games;
    Player player1;
    Player player2;
    Player winner;

    public Match(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public Match playMatch(int bestOf) {
        games = new Game[bestOf];

        for (int i = 0; i < bestOf; i++) {
            Game game = new Game(player1, player2);
            games[i] = game.playGame();
        }
        this.winner = getWinner();
        return this;
    }

    private Player getWinner() {
        int player1Wins = 0;
        int player2Wins = 0;

        for (Game game : games) {
            if (game.winner == player1) {
                player1Wins++;
            } else {
                player2Wins++;
            }
        }

        Player winner = player1Wins > player2Wins ? player1 : player2;
        System.out.println(winner.name+" wins in the match "+player1.name+" vs "+player2.name);
        return winner;
    }
}
