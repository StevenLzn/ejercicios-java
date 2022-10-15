import javax.swing.*;

/*
    Obtener el nombre más largo de tres personas, según los siguientes requerimientos
        Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase JOptionPane y método showInputDialog().
        Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres) (Imprimir solo uno de los tres, el de más caracteres en el nombre.)
        Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el índice cero accedemos al nombre de la persona.
        Restricción: No utilizar loops en el desarrollo de la tarea.
    Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
*/
public class NombreMasLargo {

    public static void main(String[] args) {

        String completeName1 = JOptionPane.showInputDialog("Ingrese el nombre y apellido de la primera persona");
        String completeName2 = JOptionPane.showInputDialog("Ingrese el nombre y apellido de la segunda persona");
        String completeName3 = JOptionPane.showInputDialog("Ingrese el nombre y apellido de la tercera persona");

        String name1 = completeName1.split(" ")[0];
        String name2 = completeName2.split(" ")[0];
        String name3 = completeName3.split(" ")[0];

        String message = "tiene el nombre más largo";

        if( name1.length() > name2.length() ) {
            message = completeName1 + " " + message;
        } else if ( name2.length() < name3.length() ) {
            message = completeName3 + " " + message;
        } else {
            message = completeName2 + " " + message;
        }

        JOptionPane.showMessageDialog(null, message);
    }
}
