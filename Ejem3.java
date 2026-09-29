public class Ejem3 {
    public void suma(int a, int b) {
        int c = a + b;
        System.out.println("La suma de a y b es: " + c);
    }
    public void suma(float a, float b) {
        float c = a + b;
        System.out.println("La suma de a y b es: " + c);
    }
    public void suma(double a, double b) {
        double c = a + b;
        System.out.println("La suma de a y b es: " + c);
    }

    public static void main(String[] args) {
        Ejem3 obj = new Ejem3();
        obj.suma(10, 20);
        obj.suma(10.5f, 20.5f);
        obj.suma(10.5, 20.5);
    }
}
