package compania;

public class EjemploCompania {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Juan", "Perez", "123456", "Calle 13", 1500.5, 11);
        gerente.setPresupuesto(100000.5);
        Empleado empleado = new Empleado("Francisco", "Rojas", "112233", "Calle 14", 1400.6, 12);
        System.out.println(gerente);
        System.out.println("=========================");
        gerente.aumentarRemuneracion(10);
        System.out.println(gerente);
        System.out.println("=========================");
        System.out.println(empleado);
    }
}
