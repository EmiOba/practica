package es.tiernoparla.daw.mercadaw.productos;

import es.tiernoparla.daw.mercadaw.MercaDAW;

public abstract class Producto extends MercaDAW{
   private String nombre="";
   private String marca ="";
   private String categoria="";
   private double precio=0;
   private int altura   =0;
   private int anchura  =0;
   private int peso     =0;
   private int numElemento=0;
   private String descripcion="";

   public  abstract double recargoPorAltura(int altura);
   public  abstract double recargoPorAnchura(int anchura); 
   public  abstract double recargoPorPeso(int peso);
   public  abstract double recargoPorNumElento(int numElemento); 
   
}
