package es.tiernoparla.daw.mercadaw.productos;

public interface Recargo {
   public double recargoPorPeso(double peso);
   public double recargoPorAltura(double altura);
   public double recargoPorAnchura(double anchura);
   public double recargoPorNumElemento(int numElemento);
}
