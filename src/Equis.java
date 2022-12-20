import java.util.Scanner;
/*
    Escribir un programa que imprima una X construida a base de la letra X en las diagonales de la
    matriz y utilizar el carácter guion bajo como relleno. El tamaño de la x se basa en una variable n
    que indicará el tamaño de la letra para imprimir en una matriz de n x n.

    El carácter "X" en mayúscula y el guion bajo "_" para los espacios.

    Por ejemplo para n=5 se obtiene:

    X___X
    _X_X_
    __X__
    _X_X_
    X___X
    Por ejemplo para n=6 se obtiene:

    X____X
    _X__X_
    __XX__
    __XX__
    _X__X_
    X____X
    Si n es igual a cero imprimir "ERROR" y finalizar la ejecución del programa.
*/


public class Equis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la x");
        int n = sc.nextInt();
        if (n == 0) System.out.println("ERROR, ingrese un número mayor a 0");
        String[][] matrizX = new String[n][n];
        int tamano = matrizX.length;
        int ultimoElemento = tamano - 1;
        for (int i = 0; i < tamano; i++) {
            for (int j = 0; j < tamano; j++) {
                if( j == i ){
                    matrizX[i][i] = "X";
                } else if (ultimoElemento-i == j) {
                    matrizX[i][ultimoElemento-i] = "X";
                } else {
                    matrizX[i][j] = "_";
                }

            }
        }

        for (int i = 0; i < matrizX.length; i++) {
            for (int j = 0; j < matrizX[i].length; j++) {
                System.out.print(matrizX[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
