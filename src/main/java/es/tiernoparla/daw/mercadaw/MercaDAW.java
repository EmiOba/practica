package es.tiernoparla.daw.mercadaw;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import es.tiernoparla.daw.mercadaw.empleados.Cajero;
import es.tiernoparla.daw.mercadaw.empleados.Empleado;
import es.tiernoparla.daw.mercadaw.empleados.Encargado;
import es.tiernoparla.daw.mercadaw.empleados.Reponedor;
import es.tiernoparla.daw.mercadaw.productos.Alimentacion;
import es.tiernoparla.daw.mercadaw.productos.Cosmetica;
import es.tiernoparla.daw.mercadaw.productos.Drogueria;
import es.tiernoparla.daw.mercadaw.productos.Producto;

public class MercaDAW implements Funcionalidad {
   private static final double CONVERSION_EURO_DOLAR = 1.90;
     
   List<Producto> productos = new ArrayList<>();
   Alimentacion productoAlimentacion = new Alimentacion(null, null,
         null, 0, 0, 0, 0, 0, null);
   Drogueria productoDrogeria = new Drogueria(null, null,
         null, 0, 0, 0, 0, 0, null);
   Cosmetica productoCosmetica = new Cosmetica(null, null,
         null, 0, 0, 0, 0, 0, null);
         
   Set<Empleado> empleados = new LinkedHashSet<>();
   Empleado empleadoEstandar = new Empleado(null, null, null);
   Reponedor empleadoReponedor = new Reponedor(null, null, null);
   Cajero empleadoCajero = new Cajero(null, null, null);
   Encargado empleadoEncargado = new Encargado(null, null, null);

   
   
   @Override
   public void darAltaProducto() {
      productos.add(productoAlimentacion);
      productos.add(productoDrogeria);
      productos.add(productoCosmetica);

   }

   @Override
   public void darAltaEmpleado() {
      empleados.add(empleadoEstandar);
      empleados.add(empleadoReponedor);
      empleados.add(empleadoCajero);
      empleados.add(empleadoEncargado);
   }

   @Override
   public void visualizarDatosProducto() {
      for (int i = 0; i < productos.size(); i++) {
         productos.toString();
      }
   }

   @Override
   public void visualizarDatosEmpleado() {
      for (int i = 0; i < empleados.size(); i++) {
         empleados.toString();
      }
   }

   @Override
   public double obtenerPrecioProducto() {
      final String MSG_DOLAR = "Precio total en dólares: ";
       double precioTotal =0.0;
       for (Producto producto : productos) {
         double recargo = 0.0;
    
         // Calcular recargo por peso
         recargo += producto.recargoPorPeso(producto.getPeso());
         
         // Calcular recargo por altura
         recargo += producto.recargoPorAltura(producto.getAltura());
         
         // Calcular recargo por anchura
         recargo += producto.recargoPorAnchura(producto.getAnchura());
         
         // Calcular recargo por número de elementos
         recargo += producto.recargoPorNumElemento(producto.getNumElemento());
         
         // Sumar el recargo al precio total
         precioTotal += recargo;
      }
       double precioDolar = precioTotal / CONVERSION_EURO_DOLAR;
       String cadena = productos.toString()+ MSG_DOLAR + precioDolar;
       System.out.println(cadena);
       return precioTotal;
   }
   
   @Override
   public void imprimirEtiqueta() {
       for (Producto producto : productos) {
           producto.toString();
       }
   }
}