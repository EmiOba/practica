package es.tiernoparla.daw.mercadaw;

public class Cliente extends MercaDAW{
   private String codigoPostal="";
   private String nombre ="";
   private String correo ="";
   private String fecha  ="";

   public Cliente(String codigoPostal, String nombre, String correo, String fecha) {
      this.codigoPostal= codigoPostal;
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
}
