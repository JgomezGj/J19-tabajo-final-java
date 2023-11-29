package co.com.ps.b7;

public class Main {
    public static void main(String[] args) {
        //Control y creacion de errores
        try {
            throw new ArrayStoreException("Esto es un error creado por mi");


        }catch (ArithmeticException e) {
            System.err.println("Error aritmético: " + e.getMessage() + "" + e);
        }catch (Exception e) {
            System.err.println("Se ha  producido un error: " + e);
        }
    }
}
