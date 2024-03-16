
package tarea1java;

import java.util.Scanner;

public class Tarea1java {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] edades = new int[5];
        int mayores = 0, menores = 0;
        int sumaMayores = 0, sumaMenores = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese la edad de la persona " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();

            if (edades[i] >= 18) {
                mayores++;
                sumaMayores += edades[i];
            } else {
                menores++;
                sumaMenores += edades[i];
            }
        }

        double promedioMayores = 0;
        double promedioMenores = 0;

        if (mayores != 0) {
            promedioMayores = sumaMayores / (double) mayores;
        }

        if (menores != 0) {
            promedioMenores = sumaMenores / (double) menores;
        }

        System.out.println("\nResultados:");
        System.out.println("Cantidad de mayores de edad: " + mayores);
        System.out.println("Cantidad de menores de edad: " + menores);
        System.out.println("Promedio de edades de mayores de edad: " + promedioMayores);
        System.out.println("Promedio de edades de menores de edad: " + promedioMenores);
    }
}
