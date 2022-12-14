import javax.swing.*;

/*
    Escribir un programa que recorra un arreglo y genere un histograma con base en los valores de este.

    El arreglo debe contener 12 elementos que corresponden a números enteros de rango 1 al 6.

    Un histograma es una representación gráfica (de puntos o barra) de que tanto un elemento aparece en un
    conjunto de datos, es decir debe mostrar la frecuencia para todos los números del 1 al 6,
    incluso si no están presente en el arreglo.

    Por ejemplo para el arreglo {4, 3, 4, 6, 6, 4, 1, 4, 5, 4, 1, 1} el histograma debería ser:

    1: ***
    2:
    3: *
    4: *****
    5: *
    6: **
    Para la tarea usaremos el asterisco(*) como representación gráfica para el histograma.
*/
public class Histograma {
    public static void main(String[] args) {
        int[] numeros = new int[12];
        int[] ocurrencias = new int[6];

        int ingresados = 0;
        while (ingresados < numeros.length) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un número del 1 al 6"));
            if( numero >= 1 && numero <= 6 ) {
                numeros[ingresados] = numero;
                ingresados++;
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un número entre el 1 y el 6");
            }
        }

        for (int i = 0; i < numeros.length; i++) {
            ocurrencias[numeros[i] - 1]++;
        }

        String result = "";
        for (int i = 0; i < ocurrencias.length; i++) {
            result += (i + 1) + ": ";
            for (int j = 0; j < ocurrencias[i]; j++) {
                result += "*";
            }
            result += "\n";
        }

        System.out.println(result);
    }
}
