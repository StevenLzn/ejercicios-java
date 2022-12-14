import javax.swing.*;

/*
    Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9).
    Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y también imprimir la cantidad de veces que aparece en el arreglo.

    Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}

    Como resultado debería imprimir lo siguiente:

    La mayor ocurrencias es: 3
    El elemento que mas se repite es: 5
    En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.
*/

public class MayorOcurrencia {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] ocurrencias = new int[9];

        int ingresados = 0;
        while (ingresados < numeros.length) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un número del 1 al 9"));
            if( numero >= 1 && numero <= 9 ) {
                numeros[ingresados] = numero;
                ingresados++;
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un número entre el 1 y el 9");
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            ocurrencias[numeros[i] - 1]++;
        }

        int posicionMayor = 0;
        int mayor = 0;

        for (int i = 0; i < ocurrencias.length; i++) {
            if( mayor < ocurrencias[i] ) {
                mayor = ocurrencias[i];
                posicionMayor = i;
            }
        }

        System.out.println("La mayor ocurrencia es: " + mayor);
        System.out.println("El elemento que más se repite es: " + (posicionMayor + 1));
    }
}
