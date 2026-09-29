import java.util.Scanner;

public class ejem8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] arreglo = {1, 2, 3, 4, 5};
        int[] arreglo1 = new int[]{6, 7, 8, 9, 10};
        int[] arreglo2 = new int[5];
        int valor;

        for (int i = 0; i < arreglo2.length; i++) {
            System.out.println("Ingrese 5 numeros para llenar el arreglo");
            valor = teclado.nextInt();
            arreglo2[i] = valor;
        }

        int i=0;
        while (true) {
         System.out.println("Ingrese 5 numeros para llenar el arreglo");
            valor = teclado.nextInt();
            arreglo2[i] = valor;
            i++;
            if (i >= arreglo2.length) {
                break;
            }
        }

        i=0;
        while (i < arreglo.length) {
         System.out.println("Ingrese 5 numeros para llenar el arreglo");
            valor = teclado.nextInt();
            arreglo2[i] = valor;
            i++;
        }

        for (int j = 0; j < arreglo2.length; j++) {
            System.out.println("El valor del arreglo en la posicion " + j + 
            " es: " + arreglo2[j]);
        }

        for(int j: arreglo2){
            System.out.println("El valor del arreglo2 es: " + j);
        }

    }
}
