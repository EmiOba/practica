package es.tiernoparla.daw.mercadaw.empleados;

import es.tiernoparla.daw.mercadaw.MercaDAW;

public class Empleado extends MercaDAW{
   final double SUELDO_ESTANDAR= 1000;
   final String ID="";
   private String nombre = "";
   private String apellido = "";
   private String categoria = "";
   
   public Empleado(String nombre, String apellido, String categoria) {
      this.nombre = nombre;
      this.apellido = apellido;
      this.categoria = categoria;
   }
}
