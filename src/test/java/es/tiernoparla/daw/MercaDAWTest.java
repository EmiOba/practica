package es.tiernoparla.daw;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import es.tiernoparla.daw.mercadaw.MercaDAW;
import es.tiernoparla.daw.mercadaw.productos.Alimentacion;
import es.tiernoparla.daw.mercadaw.productos.Cosmetica;
import es.tiernoparla.daw.mercadaw.productos.Drogueria;
import es.tiernoparla.daw.mercadaw.productos.Producto;

public class MercaDAWTest {
    @Test
    public void obtenerPrecioProductoTest() {
        // Crear una lista de productos para la prueba
        List<Producto> productos = new ArrayList<>();
        productos.add(new Alimentacion("Producto 1", "Proveedor 1", "Alimentacion", 5, 1, 1, 1, 1, "Categoria"));
        productos.add(new Drogueria("Producto 2", "Proveedor 2", "Drogueria", 4, 1, 1, 1, 1, "Categoria"));
        productos.add(new Cosmetica("Producto 3", "Proveedor 3", "Cosmetica", 3, 1, 1, 1, 1, "Categoria"));

        // Crear una instancia de la clase que contiene el método obtenerPrecioProducto()
        // Suponiendo que la clase se llama Mercado o similar
        MercaDAW mercado = new MercaDAW();

        // Calcular el precio total esperado
        double precioTotalEsperado = 0;
        for (Producto producto : productos) {
            precioTotalEsperado += producto.getPrecio();
        }

        // Obtener el precio total real utilizando el método obtenerPrecioProducto()
        double precioTotalReal = mercado.obtenerPrecioProducto();

        // Verificar que el precio total calculado coincida con el precio total esperado
        assertEquals(precioTotalEsperado, precioTotalReal);
    }
}
