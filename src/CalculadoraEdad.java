import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
    Para esta tarea se pide ingresar una fecha de nacimiento en formato string,
    convertirla a una fecha del tipo java.util.Date y calcular la edad de la persona de acuerdo a la fecha actual.
 */
public class CalculadoraEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Calendar fechaNacimiento = Calendar.getInstance();
        Calendar fechaActual = Calendar.getInstance();

        System.out.println("Ingrese su fecha de nacimiento");
        try {

            Date fechaIngresada = format.parse(sc.next());
            fechaNacimiento.setTime(fechaIngresada);
            int edad = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
            int diferenciaMeses = fechaActual.get(Calendar.MONTH) - fechaNacimiento.get(Calendar.MONTH);
            int diferenciaDias = fechaActual.get(Calendar.DAY_OF_MONTH) - fechaNacimiento.get(Calendar.DAY_OF_MONTH);

            if(diferenciaMeses < 0 || ( diferenciaMeses == 0 && diferenciaDias < 0)){
                edad--;
            }

            System.out.println("Su edad es " + edad + " años");

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
