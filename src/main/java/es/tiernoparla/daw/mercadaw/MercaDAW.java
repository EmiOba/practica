package es.tiernoparla.daw.mercadaw;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import es.tiernoparla.daw.mercadaw.empleados.Cajero;
import es.tiernoparla.daw.mercadaw.empleados.Empleado;
import es.tiernoparla.daw.mercadaw.empleados.Encargado;
import es.tiernoparla.daw.mercadaw.empleados.Reponedor;
import es.tiernoparla.daw.mercadaw.productos.Alimentacion;
import es.tiernoparla.daw.mercadaw.productos.Cosmetica;
import es.tiernoparla.daw.mercadaw.productos.Drogueria;

public class MercaDAW implements Visualizable{

   List<Alimentacion> listaAlimentacion = new ArrayList<Alimentacion>(); 
   List<Drogueria> listaDrogueria = new ArrayList<Drogueria>();
   List<Cosmetica> listaCosmetica = new ArrayList<Cosmetica>();

   Alimentacion productoAlimentacion = new Alimentacion(null, null, null, 0, 0, 0, 0, 0, null);
   Drogueria productoDrogeria = new Drogueria(null, null, null, 0, 0, 0, 0, 0, null);
   Cosmetica productoCosmetica = new Cosmetica(null, null, null, 0, 0, 0, 0, 0, null);

   HashSet<Empleado> listaEmEstandar = new HashSet<>();
   HashSet<Reponedor> listaEmReponedor = new HashSet<>();
   HashSet<Cajero> listaEmCajeros = new HashSet<>();
   HashSet<Encargado> listaEmEncargado = new HashSet<>();

   Empleado empleadoEstandar = new Empleado(null, null, null);
   Reponedor empleadoReponedor = new Reponedor(null, null, null);
   Cajero empleadoCajero = new Cajero(null, null, null);
   Encargado empleadoEncargado = new Encargado(null, null, null);

   HashSet<Cliente> listaClientes = new HashSet<>();
   Cliente cliente = new Cliente(null, null, null);

   @Override
   public void darAltaProducto() {
     listaAlimentacion.add(productoAlimentacion);
     listaDrogueria.add(productoDrogeria);
     listaCosmetica.add(productoCosmetica);
     
   }

   @Override
   public void darAltaEmpleado() {
      listaEmEstandar.add(empleadoEstandar);
      listaEmReponedor.add(empleadoReponedor);
      listaEmCajeros.add(empleadoCajero);
      listaEmEncargado.add(empleadoEncargado);
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
   public double obtenerPrecioProducto() {
          double precioTotal = productoAlimentacion.recargoPorPeso(productoAlimentacion.getPeso())
               + productoAlimentacion.recargoPorAltura(productoAlimentacion.getAltura())
               + productoAlimentacion.recargoPorAnchura(productoAlimentacion.getAnchura())
               + productoAlimentacion.recargoPorNumElemento(productoAlimentacion.getNumElemento());

          return precioTotal;

   }

   @Override
   public void imprimirEtiqueta() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'imprimirEtiqueta'");
   }
}
