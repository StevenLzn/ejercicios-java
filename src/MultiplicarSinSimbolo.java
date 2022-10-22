import java.util.Scanner;
/*
    Mediante el teclado pedir dos números enteros positivos o negativos y multiplicarlos, pero sin usar el símbolo de multiplicación (*).
    Puede utilizar una sentencia for para realizar la multiplicación y tener en cuenta los unarios, donde menos por menos es positivo.
*/


public class MultiplicarSinSimbolo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número");
        int num2 = sc.nextInt();
        int result = 0;
        int cantidadIteraciones = (num2 > 0) ? num2 : -num2;
        for (int i = 0; i < cantidadIteraciones; i++) {
            result += num1;
        }
        result = (num2 < 0) ? -result : result;
        System.out.println("result = " + result);
    }
}
