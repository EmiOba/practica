package es.tiernoparla.daw.mercadaw.empleados;

import es.tiernoparla.daw.mercadaw.MercaDAW;

public class Empleado extends MercaDAW{
   final double SUELDO_ESTANDAR= 1000;
   final String ID="";
   private String nombre = "";
   private String apellido = "";
   private String categoria = "";
   
   public double getSUELDO_ESTANDAR() {
      return SUELDO_ESTANDAR;
   }

   public String getID() {
      return ID;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getApellido() {
      return apellido;
   }

   public void setApellido(String apellido) {
      this.apellido = apellido;
   }

   public String getCategoria() {
      return categoria;
   }

   public void setCategoria(String categoria) {
      this.categoria = categoria;
   }

   public Empleado(String nombre, String apellido, String categoria) {
      this.nombre = nombre;
      this.apellido = apellido;
      this.categoria = categoria;
     
   }
}
