import java.util.Scanner;

/*
    Escribir un programa para una matriz de n x n e imprima en ella una silla (o letra h minúscula)
    construida a base del número 1 y utilizar el número 0 como espacio. El tamaño de la silla se basa en una
    variable n que indicará el tamaño de la figura a imprimir en una matriz de n x n.

    Por ejemplo para n=5 se obtiene:

    10000
    10000
    11111
    10001
    10001
    Por ejemplo para n=6 se obtiene:

    100000
    100000
    100000
    111111
    100001
    100001
    Por ejemplo para n=10 se obtiene:

    1000000000
    1000000000
    1000000000
    1000000000
    1000000000
    1111111111
    1000000001
    1000000001
    1000000001
    1000000001
    Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.
*/
public class Silla {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el alto de la silla");
        int n = sc.nextInt();
        if (n == 0) System.out.println("ERROR, ingrese un número mayor a 0");

        int[][] matriz = new int[n][n];
        int tamano = matriz.length;
        int lastElement = tamano - 1;

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if( ((lastElement - i) == i) || (tamano - i) == i) {
                    matriz[i][j] = 1;
                } else if ( ((lastElement - i) < i && j == lastElement) || j == 0) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
