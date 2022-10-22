import java.util.Scanner;
/*
    Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros,
    usando la clase Scanner ingresar la cantidad de números a comparar, luego utilizando una sentencia for
    iterar el número de veces (ingresado) para pedir el número entero, entonces se requiere:
        Calcular el menor número e imprimir el valor.
        Si el menor número es menor que 10, imprimir "". Si no, imprimir "el número menor es igual o mayor que 10!".
 */


public class MenorDeDiezNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números a comparar");
        int cantidad = sc.nextInt();
        int menor = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el valor #" + (i+1));
            int valor = sc.nextInt();
            if(valor < menor || i == 0 ){
                menor = valor;
            }
        }
        if( menor < 10 ) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("el número menor es igual o mayor que 10!");
        }

        System.out.println("El valor menor de los números ingresados es: " + menor);
    }
}
