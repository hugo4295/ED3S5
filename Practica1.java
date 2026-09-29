import java.util.Scanner;

public class Practica1<T,U> {
    T valor1;
    U valor2;

    public Practica1(T valor1, U valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        Verifica();
    }    
    
    private void Verifica(){
        if (valor1 instanceof String && valor2 instanceof String) {
            concatenar();
        } else if (valor1 instanceof Integer && valor2 instanceof Integer) {
            operaciones();
        } else if (valor1 instanceof Double && valor2 instanceof Double) {
            operaciones();
        } else if (valor1 instanceof Boolean && valor2 instanceof Boolean) {
            System.out.println("Ambos valores son de tipo Boolean");
        } else if (valor1 instanceof Character && valor2 instanceof Character) {
            concatenar();
        } else if (valor1 instanceof Float && valor2 instanceof Float) {
            operaciones();
        } 
        else {
            System.out.println("Los valores son de tipos diferentes");
        }
    }

    private void concatenar() {
        System.out.println("La concatenacion es: " + valor1.toString() + 
        valor2.toString());
    }

    private void operaciones() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.println("Menu de opciones");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("Que opcion desea realizar");
        opcion = scanner.nextInt();
        switch (opcion) {            
            case 1:
                if (valor1 instanceof Integer && valor2 instanceof Integer){
                    int val1 = Integer.parseInt(valor1.toString());
                    int val2 = Integer.parseInt(valor2.toString());
                    System.out.println("La suma es: " + (val1 + val2));
                }else if (valor1 instanceof Double && valor2 instanceof Double){
                    double val1 = Double.parseDouble(valor1.toString());
                    double val2 = Double.parseDouble(valor2.toString());
                    System.out.println("La suma es: " + (val1 + val2));
                }else if (valor1 instanceof Float && valor2 instanceof Float){
                    float val1 = Float.parseFloat(valor1.toString());
                    float val2 = Float.parseFloat(valor2.toString());
                    System.out.println("La suma es: " + (val1 + val2));
                }
                break;
            case 2:

                System.out.println("La resta es: " + (Integer.parseInt(valor1.toString()) 
                - Integer.parseInt(valor2.toString())));
                break;
            case 3:
                System.out.println("La multiplicacion es: " + 
                (Integer.parseInt(valor1.toString()) * 
                Integer.parseInt(valor2.toString())));
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}
