import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // 1. Pedimos el tamaño de la matriz
        System.out.print("Numero de filas: ");
        int filas = entrada.nextInt();

        System.out.print("Numero de columnas: ");
        int columnas = entrada.nextInt();

        int[] sumaColumnas = new int[columnas];

        // 2. Introducimos los numeros y sumamos cada columna
        for (int fila = 0; fila < filas; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                System.out.print("Numero: ");
                int numero = entrada.nextInt();
                sumaColumnas[columna] += numero;
            }
        }

        // 3. Mostramos las sumas
        for (int columna = 0; columna < columnas; columna++) {
            System.out.println("Suma columna " + (columna + 1) + ": " + sumaColumnas[columna]);
        }

        entrada.close();
    }
}
