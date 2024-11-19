// import java.util.regex.Pattern;
abstract public class Player {
    // private Pattern pattern = Pattern.compile("^[\\w.\\-]{3,}$"); 
    private String name = "Anonim";

    public Player(){}

    public Player (String name) {
        setName(name);
    }

    public final void setName(String name) {
        // if (pattern.matcher(name).matches()) 
        if (name != null && name.matches("^[\\w.\\-]{3,}$")){
            this.name = name;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final String getName() {
        return name;
    }

    abstract public int guess();
}
