package es.tiernoparla.daw;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import es.tiernoparla.daw.mercadaw.MercaDAW;
import es.tiernoparla.daw.mercadaw.productos.Alimentacion;



public class MercaDAWTest {

  private MercaDAW mercado = new MercaDAW();

   @Test

   public void obtenerPrecioProductoTest(){
    double precioEsperado = 1.44;
  
    Alimentacion alimentacion = new Alimentacion("Cafe", "Marcella",
     "Alimentacion", 1, 0.20, 0.20, 0.4, 1, "Hecho en Colombia");


     assertEquals(precioEsperado,mercado.obtenerPrecioProducto(alimentacion));
   
   }
}
