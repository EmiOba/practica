package es.tiernoparla.daw.mercadaw.productos;

public class Drogueria extends Producto {
   final String SIMBOLO_PORCENTAJE="%";
   final double IVA = 0.10;
   

   public Drogueria(String nombre, String marca, String categoria, double precio, int altura, int anchura, int peso,
         int numElemento, String descripcion) {
      super(nombre, marca, categoria, precio, altura, anchura, peso, numElemento, descripcion);
   }
   public String getSIMBOLO_PORCENTAJE() {
      return SIMBOLO_PORCENTAJE;
   }
   public double getIVA() {
      return IVA;
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

}
