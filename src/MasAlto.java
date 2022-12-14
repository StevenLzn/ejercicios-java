import javax.swing.*;

/*
    Escriba un programa que imprima el número más alto de un arreglo de 7 elementos (de rango 11 a 99),
    por ejemplo {14, 33, 15, 36, 78, 21, 43}, si se repite un valor considerar uno solo.
*/
public class MasAlto {
    public static void main(String[] args) {
        int[] numeros = new int[7];

        int ingresados = 0;
        while (ingresados < numeros.length) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa un número del 11 al 99"));
            if( numero >= 11 && numero <= 99 ) {
                numeros[ingresados] = numero;
                ingresados++;
            } else {
                JOptionPane.showMessageDialog(null, "Por favor ingrese un número entre el 11 y el 99");
            }
        }

        for (int i = 0; i < numeros.length - 1; i++) {
            if(numeros[i] > numeros[i+1]){
                numeros[i+1] = numeros[i];
            }
        }

        String message = "El número mayor de los ingresados es: " + numeros[numeros.length - 1];
        JOptionPane.showMessageDialog(null, message);

    }
}
