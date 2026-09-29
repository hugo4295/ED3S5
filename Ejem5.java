public class Ejem5<T,U> {
    public T valor1;
    public U valor2;
    public Ejem5(T valor1, U valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    public void mostrarValores() {
        System.out.println("El valor 1 es: " + valor1.getClass().getName() + " y su valor es: " + valor1);
        System.out.println("El valor 2 es: " + valor2.getClass().getName() + " y su valor es: " + valor2);
    }

    public static void main(String[] args) {
        Ejem5<Integer, String> obj1 = new Ejem5<>(10, "Hola");
        obj1.mostrarValores();

        Ejem5<Double, Boolean> obj2 = new Ejem5<>(10.5, true);
        obj2.mostrarValores();

        Ejem5<Character, Float> obj3 = new Ejem5<>('A', 10.5f);
        obj3.mostrarValores();

        Ejem5<String, String> obj4 = new Ejem5<>("Hola", "Mundo");
        obj4.mostrarValores();


    }
}
