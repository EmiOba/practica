package es.tiernoparla.daw.mercadaw.productos;

public class Alimentacion extends Producto {

   final String SIMBOLO_PORCENTAJE="%";
   final double IVA = 0.04;
   
   public Alimentacion(String nombre, String marca, String categoria, 
      double precio, double altura, double anchura, double peso,
      int numElemento, String descripcion) {
      super(nombre, marca, categoria, precio, altura, anchura, peso, numElemento, descripcion);
      
   }
   
   @Override
   public String toString() {
      final String PLANTILLA = "* Nombre:%s\n"+
         "* Marca:%s\n"+ "* Categoría:%s\n"+ "* Precio en Euros:%s\n"+"* IVA:%s\n"+
         "* Altura en metros:%s\n"+ "* Anchura en metros:%s\n"+"* Peso en kg:%s\n"+
         "* Número de elementos:%s\n"+"* Descripción:%s";
  
      String cadena = String.format(PLANTILLA, getNombre(), getMarca(), getPrecio(), getIVA(),
      getSIMBOLO_PORCENTAJE(), getAltura(), getAnchura(), getPeso(), getNumElemento(), getDescripcion());
     
      return cadena;
   }



   public String getSIMBOLO_PORCENTAJE() {
      return SIMBOLO_PORCENTAJE;
   }

   public double getIVA() {
      return IVA;
   }
}
