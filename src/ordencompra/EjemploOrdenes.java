package ordencompra;

import java.util.Calendar;

public class EjemploOrdenes {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        OrdenCompra orden1 = new OrdenCompra("Primera compra");
        OrdenCompra orden2 = new OrdenCompra("Segunda compra");
        OrdenCompra orden3 = new OrdenCompra("Tercera compra");

        Producto[] productosList = {
            new Producto("Intel", "Intel i3 9990", 120),
            new Producto("Intel", "Intel i3 10090", 150),
            new Producto("Intel", "Intel i5 9990", 170),
            new Producto("Intel", "Intel i5 10090", 190),
            new Producto("Intel", "Intel i7 9990", 210),
            new Producto("Intel", "Intel i7 10090", 230),
            new Producto("Intel", "Intel i9 9990", 250),
            new Producto("Intel", "Intel i9 9990", 270),
            new Producto("Gigabyte", "GTX 1080", 210),
            new Producto("Asus", "GTX 1080", 205),
            new Producto("Asus", "RTX 3080", 375),
            new Producto("Gigabyte", "RTX 3080", 370)
        };

        calendario.set(2023, Calendar.JANUARY, 2);
        orden1.setCliente(new Cliente("Juan", "Perez"));
        orden1.setFecha(calendario.getTime());
        for (int i = 0; i < 4; i++) {
            orden1.addProducto(productosList[i]);
        }

        calendario.set(2023, Calendar.JANUARY, 3);
        orden2.setCliente(new Cliente("Cristiano", "Ronaldo"));
        orden2.setFecha(calendario.getTime());
        for (int i = 4; i < 8; i++) {
            orden2.addProducto(productosList[i]);
        }

        calendario.set(2023, Calendar.JANUARY, 5);
        orden3.setCliente(new Cliente("James", "Rodriguez"));
        orden3.setFecha(calendario.getTime());
        for (int i = 8; i < 12; i++) {
            orden3.addProducto(productosList[i]);
        }

        System.out.println("Consolidado orden " + orden1.getId());
        System.out.println("\tFecha compra: " + orden1.getFecha());
        System.out.println("\tDescripción: " + orden1.getDescripcion());
        System.out.println("\tCliente: " + orden1.getCliente().getNombre() + " " + orden1.getCliente().getApellido());
        System.out.println("\tProductos: ");
        for (Producto producto: orden1.getProductos()) {
            System.out.println("\t\tFabricante: " + producto.getFabricante() + ", nombre: " + producto.getNombre() + ", precio: " + producto.getPrecio());
        }
        System.out.println("\tTotal: " + orden1.getTotal());

        System.out.println();

        System.out.println("Consolidado orden " + orden2.getId());
        System.out.println("\tFecha compra: " + orden2.getFecha());
        System.out.println("\tDescripción: " + orden2.getDescripcion());
        System.out.println("\tCliente: " + orden2.getCliente().getNombre() + " " + orden2.getCliente().getApellido());
        System.out.println("\tProductos: ");
        for (Producto producto: orden2.getProductos()) {
            System.out.println("\t\tFabricante: " + producto.getFabricante() + ", nombre: " + producto.getNombre() + ", precio: " + producto.getPrecio());
        }

        System.out.println("\tTotal: " + orden2.getTotal());

        System.out.println();

        System.out.println("Consolidado orden " + orden3.getId());
        System.out.println("\tFecha compra: " + orden3.getFecha());
        System.out.println("\tDescripción: " + orden3.getDescripcion());
        System.out.println("\tCliente: " + orden3.getCliente().getNombre() + " " + orden3.getCliente().getApellido());
        System.out.println("\tProductos: ");
        for (Producto producto: orden3.getProductos()) {
            System.out.println("\t\tFabricante: " + producto.getFabricante() + ", nombre: " + producto.getNombre() + ", precio: " + producto.getPrecio());
        }

        System.out.println("\tTotal: " + orden3.getTotal());
    }
}
