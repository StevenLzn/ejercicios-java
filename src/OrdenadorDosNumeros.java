import java.util.Scanner;

// El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
// Podría ser utilizando operador ternario.

public class OrdenadorDosNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        int num1 = sc.nextInt();

        System.out.println("Ingrese el segundo número");
        int num2 = sc.nextInt();

        String message = "Los números ingresados de mayor a menor: ";
        message += num1 > num2 ? num1 + ", " + num2 : num2 + ", " + num1;
        System.out.println(message);
    }
}
