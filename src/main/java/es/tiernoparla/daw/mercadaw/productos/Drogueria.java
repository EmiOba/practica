package es.tiernoparla.daw.mercadaw.productos;

public class Drogueria extends Producto{
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
   public double recargoPorAltura(int altura) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'recargoPorAltura'");
   }
   @Override
   public double recargoPorAnchura(int anchura) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'recargoPorAnchura'");
   }
   @Override
   public double recargoPorPeso(int peso) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'recargoPorPeso'");
   }
   @Override
   public double recargoPorNumElento(int numElemento) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'recargoPorNumElento'");
   }

}
