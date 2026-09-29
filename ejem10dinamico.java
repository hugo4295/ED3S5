import java.util.ArrayList;
import java.util.List;

public class ejem10dinamico {
    public static void main(String[] args) {
        List<ejem10Dato> lista = new ArrayList<>();
        lista.add(new ejem10Dato("Juan", 25, "juan@tesoem.edu.mx"));
        lista.add(new ejem10Dato("Maria", 30, "maria@tesoem.edu.mx"));
        lista.add(new ejem10Dato("Pedro", 28, "pedro@tesoem.edu.mx"));
        lista.add(new ejem10Dato("Ana", 22, "ana@tesoem.edu.mx"));

        for (ejem10Dato dato : lista) {
            System.out.println("Nombre: " + dato.getNombre());
            System.out.println("Edad: " + dato.getEdad());
            System.out.println("Correo: " + dato.getCorreo());
            System.out.println("-------------------------");
        }
    }
}
