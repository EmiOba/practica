package es.tiernoparla.daw;

import org.junit.jupiter.api.Test;

import es.tiernoparla.daw.mercadaw.productos.Alimentacion;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Unit test for simple App.
 */
public class AlimentacionTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void RecargoPorPesoMayor5KgTest() {
        double recargoEsperado = 0.15;
        Alimentacion producto = new Alimentacion("leche", "Nestle",
                "Alimentacion", 10, 0.20, 0.10, 6, 1, "de alimentacion");
        double recargoObtenido = producto.recargoPorPeso(producto.getPeso());
        assertEquals(recargoEsperado, recargoObtenido);
    }

    @Test
    public void RecargoPorPesoMayor1KgTest() {
        double recargoEsperado = 0.10;
        Alimentacion producto = new Alimentacion("leche", "Nestle",
                "Alimentacion", 10, 0.20, 0.10, 2, 1, "de alimentacion");
        double recargoObtenido = producto.recargoPorPeso(producto.getPeso());
        assertEquals(recargoEsperado, recargoObtenido);
    }

    @Test
    public void RecargoPorPesoMenor1KgTest() {
        double recargoEsperado = 0.05;
        Alimentacion producto = new Alimentacion("leche", "Nestle",
                "Alimentacion", 10, 0.20, 0.10, 0.5, 1, "de alimentacion");
        double recargoObtenido = producto.recargoPorPeso(producto.getPeso());
        assertEquals(recargoEsperado, recargoObtenido);
    }

    @Test
    public void RecargoPorAlturaMayor05MTest() {
        double recargoEsperado = 0.10;
        Alimentacion producto = new Alimentacion("leche", "Nestle",
                "Alimentacion", 10, 0.5, 0.10, 5, 1, "de alimentacion");
        double recargoObtenido = producto.recargoPorAltura(producto.getAltura());
        assertEquals(recargoEsperado, recargoObtenido);
    }

    @Test
    public void RecargoPorAlturaMenor05MTest() {
        double recargoEsperado = 0.05;
        Alimentacion producto = new Alimentacion("leche", "Nestle",
                "Alimentacion", 10, 0.02, 0.10, 5, 1, "de alimentacion");
        double recargoObtenido = producto.recargoPorAltura(producto.getAltura());
        assertEquals(recargoEsperado, recargoObtenido);
    }

    @Test
    public void RecargoPorAnchuraMayor05MTest() {
        double recargoEsperado = 0.10;
        Alimentacion producto = new Alimentacion("leche", "Nestle",
                "Alimentacion", 10, 0.5, 0.10, 5, 1, "de alimentacion");
        double recargoObtenido = producto.recargoPorAnchura(producto.getAnchura());
        assertEquals(recargoEsperado, recargoObtenido);
    }

    @Test
    public void RecargoPorAnchuraMenor05MTest() {
        double recargoEsperado = 0.05;
        Alimentacion producto = new Alimentacion("leche", "Nestle",
                "Alimentacion", 10, 0.02, 0.10, 5, 1, "de alimentacion");
        double recargoObtenido = producto.recargoPorAnchura(producto.getAnchura());
        assertEquals(recargoEsperado, recargoObtenido);
    }
}
