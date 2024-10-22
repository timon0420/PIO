import java.util.Random;

public class Player {
    private Random rand = new Random(); 
    private String name = "Anonim";

    public Player(){
        
    }

    public Player (String name) {
        setName(name);
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()){
            this.name = name;
        } else {
            System.err.println("Brak imienia");
        }
    }

    public String getName() {
        return name;
    }

    public int guess() {
        return rand.nextInt(6) + 1;
    }
}
//Zasada DRY