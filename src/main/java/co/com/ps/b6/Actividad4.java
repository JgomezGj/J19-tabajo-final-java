package co.com.ps.b6;

import java.util.Scanner;

//Addivina el número
//Deben preguntar al usuario números del 1 al 100 con 10 intentos y adicionar pistas de el
// número si esta por encima o por debajo.
public class Actividad4 {
    public static void main(String[] args) {
        int numAleatorio = (int) (Math.random() * 100) + 1;
        int numIntentos = 10;
        int numeroSolicitado;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al ejercicio de adivina el número del 1 al 100");

        for (int i = 1; i <= numIntentos; i++){
            System.out.println("Ingresa un número del 1 al 100 ");
            System.out.println("Intento No: " + i);
            numeroSolicitado = scanner.nextInt();
        if (numeroSolicitado == numAleatorio) {
            System.out.println("Felicitaciones, has adivinado el número en el intento " + i);
            break;
        } else if (i == 10) {
            System.out.println("Intentos superados, perdiste");
            break;

        } else if (numeroSolicitado < numAleatorio) {
            System.out.println("Estas por debajo del número");

        } else if (numeroSolicitado > numAleatorio) {
            System.out.println("Estas por encima del número");

        } else {
            System.out.println("Sigue intentando");
        }
        }
    }
}
