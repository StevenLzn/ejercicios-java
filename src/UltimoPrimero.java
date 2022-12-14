import javax.swing.*;

/*
    Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
    Luego debemos mostrarlos en el siguiente orden:
    el último, el primero, el penúltimo, el segundo, el antepenúltimo, el tercero, y así sucesivamente.
*/
public class UltimoPrimero {
    public static void main(String[] args) {
        int[] numeros = new int[10];

        JOptionPane.showMessageDialog(null, "Ingresa 10 números");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número " + (i + 1)));
        }

        String message = "";
        for (int i = 0; i < numeros.length; i++) {
            message = message + " " + numeros[i];
        }

        JOptionPane.showMessageDialog(null, message);

        message = "";
        int lastItem = numeros.length - 1;
        for (int i = lastItem; i >= numeros.length - i; i--) {
            message = message + " " + numeros[i];
            message = message + " " + numeros[(lastItem) - i];
        }

        JOptionPane.showMessageDialog(null, message);

    }
}
