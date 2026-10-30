public class  Exercici_03 {
    public static void main(String[] args) {
        char[][] matriz = new char[5][5];

        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 5; columna++) {
                if (fila == 0 || fila == 4 || fila == columna) {
                    matriz[fila][columna] = 'X';
                } else {
                    matriz[fila][columna] = ' ';
                }
                System.out.print(matriz[fila][columna] + " ");
            }
            System.out.println();
        }
    }
}
