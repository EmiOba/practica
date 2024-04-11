package es.tiernoparla.daw.mercadaw.Cliente;

import es.tiernoparla.daw.mercadaw.MercaDAW;

public class Cliente extends MercaDAW {
   private String codigoPostal = "";
   private String nombre = "";
   private String correo = "";
   private String fecha = "";

   public Cliente(String codigoPostal, String nombre, String correo, String fecha) {
      this.codigoPostal = codigoPostal;
      this.nombre = nombre;
      this.correo = correo;
      this.fecha = fecha;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getCorreo() {
      return correo;
   }

   public void setCorreo(String correo) {
      this.correo = correo;
   }

   public String getFecha() {
      return fecha;
   }

   public void setFecha(String fecha) {
      this.fecha = fecha;
   }

   public String getCodigoPostal() {
      return codigoPostal;
   }

   public void setCodigoPostal(String codigoPostal) {
      this.codigoPostal = codigoPostal;
   }

   @Override
   public String toString() {
      final String PLANTILLA = "Codigo Postal:%s\n Nombre:%s\n"+
      "Correo:%s\n Fecha compra:%s\n";

      String cadena = String.format(PLANTILLA, getCodigoPostal(),
       getNombre(), getCorreo(), getFecha());

      return cadena;
   }


}
