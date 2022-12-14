import javax.swing.*;

/*
    Leer 7 números por teclado para llenar un arreglo y a continuación calcular el promedio de los números positivos,
    el promedio de los negativos y contar el número de ceros.
*/

public class ConteoEstadistico {
    public static void main(String[] args) {
        int[] numeros = new int[7];

        JOptionPane.showMessageDialog(null, "Ingresa 7 números");

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el número " + (i + 1)));
        }

        int cantidadPositivos = 0;
        int cantidadNegativos = 0;
        int cantidadCeros = 0;
        int sumatoriaPositivos = 0;
        int sumatoriaNegativos = 0;

        for (int i = 0; i < numeros.length; i++) {
            if( numeros[i] > 0 ){
                cantidadPositivos++;
                sumatoriaPositivos += numeros[i];
            } else if (  numeros[i] < 0 ) {
                cantidadNegativos++;
                sumatoriaNegativos += numeros[i];
            } else {
                cantidadCeros++;
            }
        }

        double promedioPositivos = cantidadPositivos > 0 ? (double) sumatoriaPositivos / cantidadPositivos : sumatoriaPositivos;
        double promedioNegativos = cantidadNegativos > 0 ? (double) sumatoriaNegativos / cantidadNegativos : cantidadNegativos;

        System.out.println("Promedio positivos: " + promedioPositivos);
        System.out.println("Promedio negativos: " + promedioNegativos);
        System.out.println("Cantidad de ceros: " + cantidadCeros);
    }
}
