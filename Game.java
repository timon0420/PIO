import java.util.Random;
import java.util.List;
import java.util.ArrayList;
public class Game {
    private final Random dice = new Random();
    private final int number = dice.nextInt(6) + 1;
    private final List<Player> players = new ArrayList<Player>();
    
    public void addPlayer(Player player) {
        if (players.contains(player)) {
            throw new IllegalArgumentException("Taki gracz już istnieje");
        } 
        players.add(player);
    }

    public void removePlayer(String name) {
        for (int i = players.size() - 1; i >= 0; i--) {
            if (players.get(i).getName().equals(name)) {
                players.remove(i);
                return;
            } 
        }
        System.out.println("Nie znaleziono gracza");
    }
    public void printPlayers() {
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }

    public void play() {

        boolean repeat = true;
        int guess;
        
        do {
            for (Player player : players) { 

                try {
                    System.out.println("Gracz: " + player.getName());
                } catch (Exception e) {
                    System.out.println("Imie jest nieprawidłowe");
                }

                guess = player.guess();
                System.out.println("Wylosowana liczba: " + guess);
                if (number != guess) {
                    System.out.println("Źle");
                    repeat = false;
                }
            }
        } while (repeat);
        System.out.println("Brawo! Liczba: " + number);
    }

}
