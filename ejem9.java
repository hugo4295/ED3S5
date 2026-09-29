import java.util.ArrayList;
import java.util.List;
public class ejem9 {
    public static void main(String[] args) {
        List<Integer> obj1 = new ArrayList<>();

        obj1.add(10);
        obj1.add(20);
        obj1.add(30);
        obj1.add(40);
        obj1.add(50);

        System.out.println("Elementos de la lista: " + obj1);

        for (int i = 0; i < obj1.size(); i++) {
            System.out.println("Elemento en el índice " + i + ": " + obj1.get(i));
        }

        System.out.println("Valor en la posicion 2: " + obj1.get(2));

        for (Integer elemento : obj1) {
            System.out.println("valor del Elemento: " + elemento);
        }
    }

}
