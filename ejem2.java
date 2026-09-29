public class ejem2 {
    public void suma() {
        int a = 15;
        int b = 25;
        int c = a + b;
        System.out.println("La suma de a y b es: " + c);
        mensaje();
    }
    private void mensaje() {
        System.out.println("Hola, este es otro ejemplo de clase en Java.");
    }
    public static void main(String[] args) {
        ejem2 obj = new ejem2();
        obj.suma();
        obj.mensaje();
        
    }
} 
