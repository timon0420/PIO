import java.util.Random;

public class Player {
    private Random rand = new Random(); 
    private String name;

    public void setName(String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
        } else {
            this.name = "Brak";
        }
    }

    public String getName() {
        return name;
    }

    public int guess() {
        return rand.nextInt(6) + 1;
    }
}
