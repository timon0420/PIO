import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SposobyIteracji {
    public static void main(String[] args){
        List<String> lista = new ArrayList<>();

        lista.add("a");
        lista.add("b");
        lista.add("c");
        
        System.out.println(lista);

        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

        for (String s : lista){
            System.out.println(s);
        }

        lista.forEach(System.out::println);

        lista.forEach( (String s) -> {
            System.out.println(s);
        } );

    {
        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

        for (Iterator<String> it = lista.iterator(); 
            it.hasNext(); 
            System.out.println(it.next()));
    }
}
