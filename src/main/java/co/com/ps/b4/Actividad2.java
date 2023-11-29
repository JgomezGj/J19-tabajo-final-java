package co.com.ps.b4;

public class Actividad2 {
    public static class Mascota1 {

    //Atributos Mascota1
    String nombre;
    String raza;
    String color;
    String genero;
    Integer edad;
    Double peso;

    //Constructor por defecto

    public Mascota1 () {
        this.nombre = "Manchas";
        this.raza = "Border Collie";
        this.color = "Blanco";
        this.genero = "Hembra";
        this.edad = 2;
        this.peso = 6.8;
    }

    public String getColor() {
        return color;
    }
    public String getRaza(){
        return raza;
    }

        public static void main(String[] args) {
            Mascota1 mascota1 = new Mascota1();

            String colorMascota = mascota1.getColor();
            String razaMascota = mascota1.getRaza();

            System.out.println("El color de Mascota1 es: " + colorMascota);
            System.out.println("La raza de Mascota1 es: " + razaMascota);
        }


    //Crear 6 atributos de una mascota
    //Crear contructores
    //Get o Set
    //Crear para Mascota1 y Mascota2
}
    public static class Mascota2 {
        //Atributos Mascota2

        String nombre;
        String raza;
        String color;
        String genero;
        Integer edad;
        Double peso;

        //Constructor asignando valores

        public Mascota2 () {
            this.nombre = "Ossie";
            this.raza = "Buldog Frances";
            this.color = "Negro";
            this.genero = "Macho";
            this.edad = 5;
            this.peso = 6.1;
        }
        public Integer getEdad(){
            return edad;
        }
        public Double getPeso(){
            return peso;
        }
        public void setColor(String nuevoColor) {
            this.color = nuevoColor;
        }
        public String getColor(){
            return color;
        }
    }
}






