package co.com.ps.b3;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class Actividad1 {
    public static void main(String[] args) {

        //Tipo de dato primitivo
        int val1 = 100;
        double val2 = 6.5;
        float val7 = 2.2f;
        long val3 = 994748364700000000L;
        char val4 = 'A';
        byte val5 = 120;
        short val6 = 1243;
        boolean val8 = true;

        //Wrapers

        Integer w1 = 1000;
        Double w2 = 2.54;
        Float w3 = 3.5f;
        Long w4 = 9147483647000000000L;
        Character w5 = 'B';
        Byte w6 = 127;
        Short w7 = 1005;
        Boolean w8 = false;
        String w9 = "Hola Mundo";

        //Objetos útiles

        Date fecha;
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 1991);
        cal.set(Calendar.MONTH, Calendar.AUGUST);
        cal.set(Calendar.DAY_OF_MONTH, 20);
        fecha = cal.getTime();

        System.out.println(fecha);




        BigDecimal moneda = new BigDecimal(10);
    }
}
