import javax.swing.*;
/*
Pedir el radio de un círculo y calcular su área. Utilizar la formula:
    area = PI*r² (Constante PI multiplicado por el radio al cuadrado).
*/


public class AreaCirculo {
    public static void main(String[] args) {
        double radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio del círculo"));
        double area = Math.PI * ( Math.pow(radio, 2) );
        String message = "El área del círculo con radio " + radio + " es " + area;
        JOptionPane.showMessageDialog(null, message);
    }
}
