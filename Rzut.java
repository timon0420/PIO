//import java.util.Scanner;
import java.util.Random;
public class Rzut {
    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int liczbaOczek = rand.nextInt(6) + 1;
        int liczba;
        do {
            liczba = rand.nextInt(6) + 1;
            System.out.println("Liczba: " + liczba);
        } while (liczba != liczbaOczek);
        System.out.println("Liczba oczek na kostce jest rown: " + liczba);
    }
}
