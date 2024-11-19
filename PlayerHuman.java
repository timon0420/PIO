import java.util.Scanner;
public class PlayerHuman extends Player{
    private final Scanner scan = new Scanner(System.in);

    public PlayerHuman() {}

    public PlayerHuman(String name) {
        super(name);
    }

    public int guess() {
        System.out.print("Podaj liczbe: ");
        return scan.nextInt();
    }
}
