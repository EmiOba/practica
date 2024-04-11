package es.tiernoparla.daw.mercadaw;
import java.util.List;

import es.tiernoparla.daw.mercadaw.empleados.Empleado;
import es.tiernoparla.daw.mercadaw.productos.Producto;

public interface Funcionalidad {
   
   public void darAltaProducto(Producto producto);

   public void darAltaEmpleado(Empleado empleado);

   public void mostrarDatosProducto();

   public List<Empleado> mostrarListaEmpleado();

   public double obtenerPrecioProducto(Producto producto);

   public void imprimirEtiqueta(Producto producto);
}
