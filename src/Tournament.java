import java.util.ArrayList;

public class Tournament {
    ArrayList<Match> matches = new ArrayList<>();
    ArrayList<Player> players;
    int bestOf;

    public Tournament(ArrayList<Player> players, int bestOf) {
        this.players = players;
        this.bestOf = bestOf;
    }

    public void playTournament(ArrayList<Player> players) {
        for (int i = 0; i < (players.size() / 2); i++) {
            Player player1 = players.get(i * 2);
            Player player2 = players.get(i * 2 + 1);
            Match match = new Match(player1, player2);

            this.matches.add(match.playMatch(bestOf));
        }

        for ( Match match : matches) {
            if (match.winner == match.player1) {
                players.remove(match.player2);
            } else {
                players.remove(match.player1);
            }
        }
    }
}
