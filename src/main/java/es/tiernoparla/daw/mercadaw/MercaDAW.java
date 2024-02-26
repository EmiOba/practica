package es.tiernoparla.daw.mercadaw;

import java.util.ArrayList;
import java.util.List;

import es.tiernoparla.daw.mercadaw.empleados.Empleado;
import es.tiernoparla.daw.mercadaw.productos.Alimentacion;
import es.tiernoparla.daw.mercadaw.productos.Cosmetica;
import es.tiernoparla.daw.mercadaw.productos.Drogueria;
import es.tiernoparla.daw.mercadaw.productos.Producto;

public class MercaDAW implements Visualizable{

   List<Alimentacion> listaAlimentacion =new ArrayList<Alimentacion>(); 
   List<Drogueria> listaDrogueria =new ArrayList<Drogueria>();
   List<Cosmetica> listaCosmetica =new ArrayList<Cosmetica>();


   @Override
   public void darAltaProducto() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'darAltaProducto'");
   }

   @Override
   public void darAltaEmpleado() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'darAltaEmpleado'");
   }

   @Override
   public void visualizarDatosProducto() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'visualizarDatosProducto'");
   }

   @Override
   public List<Empleado> visualizarDatosEmpleado() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'visualizarDatosEmpleado'");
   }

   @Override
   public double obtenerPrecioProducto(Producto p) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'obtenerPrecioProducto'");
   }

   @Override
   public void imprimirEtiqueta() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'imprimirEtiqueta'");
   }
   
}
