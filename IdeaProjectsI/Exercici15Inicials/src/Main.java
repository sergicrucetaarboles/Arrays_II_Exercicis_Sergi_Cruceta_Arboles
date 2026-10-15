import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("          DEVELOPER 01");
        System.out.println("             NUMEROS EN ORDEN");
        System.out.println("========================================");
        System.out.println("Introduce tres numeros y los mostraremos");
        System.out.println("de mayor a menor.");
        System.out.println();

        System.out.print("Primer numero:  ");
        int num1 = entrada.nextInt();
        System.out.print("Segundo numero: ");
        int num2 = entrada.nextInt();
        System.out.print("Tercer numero:  ");
        int num3 = entrada.nextInt();

        int mayor = num1;
        if (num2 > mayor) {
            mayor = num2;
        }
        if (num3 > mayor) {
            mayor = num3;
        }

        int menor = num1;
        if (num2 < menor) {
            menor = num2;
        }
        if (num3 < menor) {
            menor = num3;
        }

        int medio = num1 + num2 + num3 - mayor - menor;

        System.out.println();
        System.out.println("----------------------------------------");
        System.out.println("        RESULTADO - MAYOR A MENOR");
        System.out.println("----------------------------------------");
        System.out.println(mayor + "  >  " + medio + "  >  " + menor);
        System.out.println("========================================");

        entrada.close();
    }
}