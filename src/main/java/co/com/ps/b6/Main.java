package co.com.ps.b6;

public class Main {
    public static void main(String[] args) {
        int diaSemana = 3;

        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Número no válido");
                break;
        }

        //Haciendo más eficiente el código (Con Arrow Function).

        String DayName = switch (diaSemana) {
            case 2 -> "Lunes";
            case 3 -> "Lunes";
            case 4 -> "Lunes";
            case 5 -> "Lunes";
            case 6 -> "Lunes";
            case 7 -> "Lunes";
            default -> "Número de día no valido";

        };
        //Ciclo while

        int cont = 0;

        while (cont < 5) {
            System.out.println("Contador: " + cont);
            cont ++;
        }

        //Ciclo do while

        cont = 0;

        do {
            System.out.println("Contador: " + cont);
            cont ++;
        }while (cont < 5);
    }
}




