package almacen;

public class EjemploAlmacen {
    public static void main(String[] args) {
        Lacteo lacteo1 = new Lacteo("Leche 1 litro", 1500.5, 2, 150);
        Lacteo lacteo2 = new Lacteo("Queso", 3000.5, 1, 200);
        Fruta fruta1 = new Fruta("Manzana", 700.5, 50.5, "rojo");
        Fruta fruta2 = new Fruta("Pera", 850.5, 60.8, "verde");
        Limpieza limpieza1 = new Limpieza("Limpido", 1100.6, "Cloro", 1.5);
        Limpieza limpieza2 = new Limpieza("Aroma", 900.2, "Canela", 1.5);
        NoPerecible noPerecible1 = new NoPerecible("Atún", 1300.0, 1, 160);
        NoPerecible noPerecible2 = new NoPerecible("Frijoles", 400.6, 2, 80);

        Producto[] productos = {
            lacteo1,
            lacteo2,
            fruta1,
            fruta2,
            limpieza1,
            limpieza2,
            noPerecible1,
            noPerecible2
        };

        for (Producto producto: productos) {
            System.out.println(producto);
            System.out.println("===========----=========");
        }
    }
}
