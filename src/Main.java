import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    //    Hard coded
    static ArrayList<Player> players = new ArrayList<>(Arrays.asList(
            new Player(95, "Alex Carter"),
            new Player(82, "Jamie Wilson"),
            new Player(74, "Morgan Taylor"),
            new Player(91, "Sam Mitchell"),
            new Player(63, "Charlie Brown"),
            new Player(87, "Jordan Lee"),
            new Player(55, "Riley Cooper"),
            new Player(78, "Casey Morgan")
    ));
    static int bestOf = 5;

    public static void main(String[] args) {
        Tournament tournament = new Tournament(players, bestOf);
        while (players.toArray().length > 1) {
            System.out.println("Players remaining: "+players.toArray().length);
            tournament.playTournament(players);
        }

        Player winner = players.get(0);
        System.out.println("The overall winner is: "+winner.name);
    }

}