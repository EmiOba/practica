package es.tiernoparla.daw.mercadaw.productos;

public class Drogueria extends Producto implements Recargo{
   final String SIMBOLO_PORCENTAJE="%";
   final double IVA = 0.10;
   double precioVenta = getPrecio() * PRECIO_VENTA;

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
   public double recargoPorPeso(double peso) {
      final double PESO_MAX = 5;
      final double PESO_MIN = 1;
      final double RECARGO_PESO_MAYOR_5_KG = 0.15;// iva
      final double RECARGO_PESO_MAYOR_1_KG = 0.10;// iva
      final double RECARGO_PESO_MENOR_1_KG = 0.05;// iva
      double recargoPeso;
    
      if (getPeso() > PESO_MAX) {
         recargoPeso = precioVenta * RECARGO_PESO_MAYOR_5_KG;
      } else if (peso > PESO_MIN) {
         recargoPeso = precioVenta * RECARGO_PESO_MAYOR_1_KG;
      } else {
         recargoPeso = precioVenta * RECARGO_PESO_MENOR_1_KG;
      }
      return recargoPeso;
   }
   @Override
   public double recargoPorAltura(double altura) {

      double recargoAltura;
      final double METRO_LIMITE = 0.5;
      final double RECARGO_ALTURA_MAYOR_0_5_M = 0.10;// iva
      final double RECARGO_ALTURA_MENOR_0_5_M = 0.05;// iva

      if (getAltura() > METRO_LIMITE) {
         recargoAltura = precioVenta * RECARGO_ALTURA_MAYOR_0_5_M;
      } else {
         recargoAltura = precioVenta * RECARGO_ALTURA_MENOR_0_5_M;
      }

      return recargoAltura;
   }
   @Override
   public double recargoPorAnchura(double anchura) {

      double recargoAnchura;
      final double METRO_LIMITE = 0.5;
      final double RECARGO_ANCHURA_MAYOR_0_5_M = 0.10;// iva
      final double RECARGO_ANCHURA_MENOR_0_5_M = 0.05;// iva

      if (getAnchura() > METRO_LIMITE) {
         recargoAnchura = precioVenta * RECARGO_ANCHURA_MAYOR_0_5_M;
      } else {
         recargoAnchura = precioVenta * RECARGO_ANCHURA_MENOR_0_5_M;
      }
      return recargoAnchura;
   }
   @Override
   public double recargoPorNumElemento(int numElemento) {
      final double ELEM_LIMITE = 2;
      final double RECARGO_ELEMENTOS_MAYOR_2 = 0.10;// iva
      double recargoElementos;

      if (getNumElemento() > ELEM_LIMITE) {
         recargoElementos = numElemento * RECARGO_ELEMENTOS_MAYOR_2;
      } else {
         recargoElementos = 0.0;
      }
      return recargoElementos;

   }

}
