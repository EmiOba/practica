package es.tiernoparla.daw.mercadaw;

public class Cliente extends MercaDAW implements Comprable{
   final String CODIGO_POSTAL="";
   private String nombre ="";
   private String correo ="";
   private String fecha  ="";

   public Cliente(String nombre, String correo, String fecha) {
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

@Override
public String fechaCompra() {
   // TODO Auto-generated method stub
   throw new UnsupportedOperationException("Unimplemented method 'fechaCompra'");
}
}
