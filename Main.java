import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Random dice = new Random();
        Player player = new Player();  
        player.setName("");
        System.out.println("Gracz: " + player.getName());
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
