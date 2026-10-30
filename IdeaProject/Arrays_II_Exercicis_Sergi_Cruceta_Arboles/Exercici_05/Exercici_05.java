import java.util.Scanner;

public class Exercici_05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int alumnos = 20;
        int notas = 3;
        // Columnas: 3 notas, promedio, mayor y menor.
        double[][] matriz = new double[alumnos][6];

        // 1. Pedimos las tres notas de cada alumno.
        for (int alumno = 0; alumno < alumnos; alumno++) {
            System.out.println("Alumno " + (alumno + 1));

            for (int nota = 0; nota < notas; nota++) {
                System.out.print("Nota " + (nota + 1) + ": ");
                matriz[alumno][nota] = entrada.nextDouble();
            }
        }

        // 2. Calculamos los resultados de cada alumno.
        double mejorNota = matriz[0][0];
        double peorNota = matriz[0][0];

        for (int alumno = 0; alumno < alumnos; alumno++) {
            double suma = 0;
            double notaMayor = matriz[alumno][0];
            double notaMenor = matriz[alumno][0];

            for (int nota = 0; nota < notas; nota++) {
                double valor = matriz[alumno][nota];
                suma += valor;

                if (valor > notaMayor) {
                    notaMayor = valor;
                }
                if (valor < notaMenor) {
                    notaMenor = valor;
                }
            }

            matriz[alumno][3] = suma / notas;
            matriz[alumno][4] = notaMayor;
            matriz[alumno][5] = notaMenor;

            if (notaMayor > mejorNota) {
                mejorNota = notaMayor;
            }
            if (notaMenor < peorNota) {
                peorNota = notaMenor;
            }
        }

        // 3. Mostramos los resultados.
        System.out.println();
        System.out.println("Alumno | Nota 1 | Nota 2 | Nota 3 | Promedio | Mayor | Menor");

        for (int alumno = 0; alumno < alumnos; alumno++) {
            System.out.print((alumno + 1) + " | ");

            for (int columna = 0; columna < 6; columna++) {
                System.out.print(matriz[alumno][columna] + " | ");
            }

            System.out.println();
        }

        System.out.println();
        System.out.println("Mejor nota del curso: " + mejorNota);
        System.out.println("Peor nota del curso: " + peorNota);

        entrada.close();
    }
}
