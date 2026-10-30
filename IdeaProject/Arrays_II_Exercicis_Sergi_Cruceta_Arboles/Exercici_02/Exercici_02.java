import java.util.Scanner;

public class Exercici_02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Numero de columnas: ");
        int columnas = entrada.nextInt();

        int[][] matriz = new int[3][columnas];

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < columnas; columna++) {
                System.out.print("Introduce un numero: ");
                matriz[fila][columna] = entrada.nextInt();
            }
        }

        for (int columna = 0; columna < columnas; columna++) {
            int suma = 0;
            int mayor = matriz[0][columna];
            int menor = matriz[0][columna];

            for (int fila = 0; fila < 3; fila++) {
                int numero = matriz[fila][columna];
                suma += numero;

                if (numero > mayor) {
                    mayor = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            }

            System.out.println("Columna " + (columna + 1) + ":");
            System.out.println("Suma: " + suma);
            System.out.println("Mayor: " + mayor);
            System.out.println("Menor: " + menor);
        }

        entrada.close();
    }
}