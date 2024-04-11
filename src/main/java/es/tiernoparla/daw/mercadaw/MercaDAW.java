package es.tiernoparla.daw.mercadaw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import es.tiernoparla.daw.mercadaw.empleados.Empleado;
import es.tiernoparla.daw.mercadaw.productos.Alimentacion;
import es.tiernoparla.daw.mercadaw.productos.Producto;

public class MercaDAW implements Funcionalidad, Menu {
   private static final double CONVERSION_EURO_DOLAR = 1.90;

   List<Producto> productos = new ArrayList<>();

   List<Empleado> empleados = new ArrayList<>();

   public static void main(String[] args) {

      MercaDAW mercado = new MercaDAW();

      Alimentacion al = new Alimentacion("Cafe", "Mecella",
      "Alimentacion", 0.1, 0.2,
      0.3, 0.4, 1, "Echo en colombia");
      
      Empleado em = new Empleado("berni",
       "lopez", "Cajero");

      int opcion = 0;

      do {
         mercado.menu();

         Scanner sc = new Scanner(System.in);
         System.out.println(MSG_INTRODUCIR_OPC);
         opcion = sc.nextInt();

         switch (opcion) {
            case OPC_DAR_ALTA_PRODUCTO:
                  mercado.darAltaProducto(al);
               break;
            case OPC_DAR_ALTA_EMPLEADO:
                  mercado.darAltaEmpleado(em);
               break;
            case OPC_MOSTRAR_DATOS_PRODUCTO:
                  mercado.mostrarDatosProducto();
               break;
            case OPC_MOSTRAR_LISTA_EMPLEADO:
                  mercado.mostrarListaEmpleado();
               break;
            case OPC_OBTENER_PRECIO_PRODUCTO:
                  mercado.obtenerPrecioProducto(al);
               break;
            case OPC_IMPRIMIR_ETIQUETA:
                  mercado.imprimirEtiqueta(al);
               break;
            default:
                  System.out.println(MSG_FIN_DEL_PROGRAM);
               break;     
         }
         
      } while (opcion != OPC_SALIR);
      
   }

   @Override
   public void menu() {
       final String SALTO_DE_LINEA = "\n";
      System.out.println(MSG_OPC_1 + SALTO_DE_LINEA +
                         MSG_OPC_2 + SALTO_DE_LINEA +
                         MSG_OPC_3 + SALTO_DE_LINEA +
                         MSG_OPC_4 + SALTO_DE_LINEA + 
                         MSG_OPC_5 + SALTO_DE_LINEA +
                         MSG_OPC_6 + SALTO_DE_LINEA +
                         MSG_OPC_7 + SALTO_DE_LINEA);
   }

   @Override
   public void darAltaProducto(Producto producto) {
      productos.add(producto);
   }

   @Override
   public void darAltaEmpleado(Empleado empleado) {
      empleados.add(empleado);
   }

   @Override
   public void mostrarDatosProducto() {
      productos.toString();
   }

   @Override
   public List<Empleado> mostrarListaEmpleado() {
      return empleados;
   }

   @Override
   public double obtenerPrecioProducto(Producto producto) {
      double precioTotal= 0.0;
      producto.toString();

      precioTotal =producto.aplicarRecargoPorPeso(producto.getPeso()) + 
      producto.aplicarRecargoAltura(producto.getAltura()) + 
      producto.aplicarRecargoPorAnchura(producto.getAnchura()) +
      producto.aplicarRecargoPorNumElemento(producto.getNumElemento());

      double combersion = precioTotal * CONVERSION_EURO_DOLAR;
      System.out.println(combersion);

      return precioTotal;
   }

   @Override
   public void imprimirEtiqueta(Producto producto) {
      producto.toString();
   }
   public List<Producto> getProductos() {
      return productos;
   }

   public void setProductos(List<Producto> productos) {
      this.productos = productos;
   }

   public List<Empleado> getEmpleados() {
      return empleados;
   }

   public void setEmpleados(List<Empleado> empleados) {
      this.empleados = empleados;
   }


}