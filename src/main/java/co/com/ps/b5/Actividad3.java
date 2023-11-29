package co.com.ps.b5;

import java.util.Scanner;

public class Actividad3 {
    public static void main(String[] args) {
        String nombre = "Jesús";
        String apellido = "Gómez";
        if (nombre == null || apellido == null){
            System.out.println("El nombre esta vacio");
        }
        if (nombre.equals("") && apellido.equals("")) {
            System.out.println("El nombre y apellido estan vacios");
        }else {
            System.out.println("Nombre ingresado correctamente");
        }

        //Bucle for

        for (int i = 1; i <= 5; i++) {
            System.out.println("Número " + i);
        }

        // ACTIVIDAD 3

        //Ingresar un número y que el programa identifique si es negativo, positivo o 0.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número: ");
        int numero = scanner.nextInt();
        System.out.println("Número " + numero);

        if (numero > 0) {
            System.out.println("El número ingresado es positivo");
        } else if (numero < 0) {
            System.out.println("El número ingresado es negativo");
        }else {
            System.out.println("El número ingresado es 0");
        }

        //For que imprima numeros pares

        for (int j = 1; j <= 10; j++) {
            if (j % 2 == 0) {
                System.out.println("Número par: " + j);
            }
        }
        //For que imprima números primos en un rango de números ingresado

        System.out.println("Ingresa el número inicial del rango: ");
        int numero2 = scanner.nextInt();
        System.out.println("Número " + numero2);
        System.out.println("Ingresa el número final del rango: ");
        int numero3 = scanner.nextInt();
        System.out.println("Número " + numero3);

        for (int num = numero2; num <= numero3; num++) {

            boolean esPrimo = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo && num > 1) {
                System.out.println(num + " :Es primo");
            }
        }
    }
}
