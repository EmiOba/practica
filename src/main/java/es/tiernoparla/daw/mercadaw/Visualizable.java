package es.tiernoparla.daw.mercadaw;
import java.util.List;

import es.tiernoparla.daw.mercadaw.empleados.Empleado;
import es.tiernoparla.daw.mercadaw.productos.Producto;

public interface Visualizable {
   public void darAltaProducto();
   public void darAltaEmpleado();
   public void visualizarDatosProducto();
   public List <Empleado> visualizarDatosEmpleado();
   public double obtenerPrecioProducto(Producto p);
   public void imprimirEtiqueta();
   
}
