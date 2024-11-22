import java.util.Random;
public class Game {
    private Player player;
    private final Random dice = new Random();
    
    public void addPlayer(Player player) {
        this.player = player;
    }

    public void play() {
        if (player == null) {
            return;
        }
        
        try {
            System.out.println("Gracz: " + player.getName());
        } catch (Exception e) {
            System.out.println("Imie jest nieprawidłowe");
        }

        int number = dice.nextInt(6) + 1;
        int guess;
        do {
            guess = player.guess();
            System.out.println("Wylosowana liczba: " + guess);
            if (number != guess) {
                System.out.println("Źle");
            }
        } while (number != guess);
        System.out.println("Brawo! Liczba: " + number);
    }
}
