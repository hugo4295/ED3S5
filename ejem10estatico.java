public class ejem10estatico {
    public static void main(String[] args) {
        ejem10Dato obj1 = new ejem10Dato("Juan", 25, "juan@example.com");
        System.out.println("Nombre: " + obj1.getNombre());
        System.out.println("Edad: " + obj1.getEdad());
        System.out.println("Correo: " + obj1.getCorreo());

        ejem10Dato obj2 = new ejem10Dato();
        obj2.setNombre("Maria");
        obj2.setEdad(30);
        obj2.setCorreo("maria@tesoem.edu.mx");
        System.out.println("Nombre: " + obj2.getNombre());
        System.out.println("Edad: " + obj2.getEdad());
        System.out.println("Correo: " + obj2.getCorreo());
    }
}