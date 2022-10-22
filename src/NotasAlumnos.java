import java.util.Scanner;

/*
    Pedir 20 notas finales de alumnos en una escala de 1 a 7, manejar decimales en las notas (double).
    Mostrar el promedio de las notas mayores a 5, promedio de notas inferiores a 4 y la cantidad de notas 1, además mostrar el promedio total.
    Ayuda: usar un bucle for que itere hasta 20 (notas) y dentro del ciclo pedir las notas una a una para realizar los cálculos (contadores, sumas).
    Opcional: si una de las notas ingresadas es 0 debe salirse del ciclo for y mostrar un mensaje de error finalizando el programa.
 */
public class NotasAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadEstudiantes = 20;
        int cantidadNotasAltas = 0;
        double sumaNotasAltas = 0.0;
        int cantidadNotasMedias = 0;
        double sumaNotasMedias = 0.0;
        int cantidadNotasBajas = 0;
        double sumaNotasBajas = 0.0;

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("Ingrese la nota #" + (i+1));
            double nota = sc.nextDouble();
            if( nota > 5 ){
                sumaNotasAltas += nota;
                cantidadNotasAltas++;
            } else if ( nota < 4 && nota > 1 ) {
                sumaNotasMedias += nota;
                cantidadNotasMedias++;
            } else if ( nota == 1) {
                sumaNotasBajas += nota;
                cantidadNotasBajas++;
            } else if ( nota == 0 ){
                System.exit(0);
            }
        }

        System.out.println("El promedio de notas mayores a 5 es: " + (sumaNotasAltas / cantidadNotasAltas));
        System.out.println("El promedio de notas inferiores a 4 es: " + (sumaNotasMedias / cantidadNotasMedias));
        System.out.println("La cantidad de notas iguales a 1 es: " + cantidadNotasBajas);
        System.out.println("El promedio de notas total es: " + ( (sumaNotasBajas + sumaNotasAltas + sumaNotasMedias) / (cantidadNotasBajas + cantidadNotasMedias + cantidadNotasAltas)));
    }
}
