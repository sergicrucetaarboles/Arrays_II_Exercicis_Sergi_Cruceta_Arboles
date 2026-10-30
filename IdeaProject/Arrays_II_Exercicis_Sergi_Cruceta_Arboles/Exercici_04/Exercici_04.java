public class Exercici_04 {
    public static void main(String[] args) {
        char[][] matriz = new char[5][5]; // Creamos una matriz de 5x5
        // char --> char es un tipo de dato primitivo que representa un solo carácter Unicode.
        // Se utiliza para almacenar letras, dígitos, símbolos y otros caracteres.

        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                matriz[fila][columna] = ' ';

                if (fila == columna || fila + columna == 4) {
                    matriz[fila][columna] = 'X';
                }

                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
