public class Ejem4<T> {
    T valor;
    public Ejem4(T valor) {
        this.valor = valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void mostrarValor() {
        System.out.println("El valor es: " + valor.getClass().getName());
        System.out.println("El valor es: " + valor);
    }

    public static void main(String[] args) {
        Ejem4<Integer> obj1 = new Ejem4<>(10);
        obj1.mostrarValor();

        Ejem4<String> obj2 = new Ejem4<>("Hola");
        obj2.mostrarValor();

        Ejem4<Double> obj3 = new Ejem4<>(10.5);
        obj3.mostrarValor();
    }
}
