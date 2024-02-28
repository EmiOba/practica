package es.tiernoparla.daw.mercadaw.productos;

import es.tiernoparla.daw.mercadaw.MercaDAW;

public abstract class Producto extends MercaDAW {
   final static double PRECIO_VENTA = 0.25;
   private String nombre = "";
   private String marca = "";
   private String categoria = "";
   private double precio = 0;
   private double altura = 0;
   private double anchura = 0;
   private double peso = 0;
   private int numElemento = 0;
   private String descripcion = "";  

   public Producto(String nombre, String marca, String categoria,
    double precio, double altura, double anchura,
      double peso,int numElemento, String descripcion) {
      this.nombre = nombre;
      this.marca = marca;
      this.categoria = categoria;
      this.precio = precio;
      this.altura = altura;
      this.anchura = anchura;
      this.peso = peso;
      this.numElemento = numElemento;
      this.descripcion = descripcion;
   }

   public String getNombre() {
      return nombre;
   }

   public String getMarca() {
      return marca;
   }

   public String getCategoria() {
      return categoria;
   }

   public double getPrecio() {
      return precio;
   }

   public double getAltura() {
      return altura;
   }

   public double getAnchura() {
      return anchura;
   }

   public double getPeso() {
      return peso;
   }

   public int getNumElemento() {
      return numElemento;
   }

   public String getDescripcion() {
      return descripcion;
   }

   public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
   }
      
   public double recargoPorPeso(double peso) {
      final double PESO_MAX = 5;
      final double PESO_MIN = 1;
      final double RECARGO_PESO_MAYOR_5_KG = 0.15;
      final double RECARGO_PESO_MAYOR_1_KG = 0.10;
      final double RECARGO_PESO_MENOR_1_KG = 0.05;
      double recargoPeso;
    
      if (peso > PESO_MAX) {
         recargoPeso = getPrecio() * RECARGO_PESO_MAYOR_5_KG;
      } else if (peso > PESO_MIN) {
         recargoPeso = getPrecio() * RECARGO_PESO_MAYOR_1_KG;
      } else {
         recargoPeso = getPrecio() * RECARGO_PESO_MENOR_1_KG;
      }
      return recargoPeso;
   }
  
   public double recargoPorAltura(double altura) {

      final double METRO_LIMITE = 0.5;
      final double RECARGO_ALTURA_MAYOR = 0.10;
      final double RECARGO_ALTURA_MENOR = 0.05;
      double recargoAltura;

      if (altura > METRO_LIMITE) {
         recargoAltura = getPrecio() * RECARGO_ALTURA_MAYOR;
      } else {
         recargoAltura = getPrecio() * RECARGO_ALTURA_MENOR;
      }

      return recargoAltura;
   }
  
   public double recargoPorAnchura(double anchura) {

      final double METRO_LIMITE = 0.5;
      final double RECARGO_ANCHURA_MAYOR= 0.10;
      final double RECARGO_ANCHURA_MENOR = 0.05;
      double recargoAnchura;
      
      if (anchura > METRO_LIMITE) {
         recargoAnchura = getPrecio() * RECARGO_ANCHURA_MAYOR;
      } else {
         recargoAnchura = getPrecio() * RECARGO_ANCHURA_MENOR;
      }
      return recargoAnchura;
   }
  
   public double recargoPorNumElemento(int numElemento) {
      final double ELEM_LIMITE = 2;
      final double RECARGO_ELEMENTOS_MAYOR = 0.10;
      double recargoElementos;

      if (numElemento > ELEM_LIMITE) {
         recargoElementos = getPrecio() * RECARGO_ELEMENTOS_MAYOR;
      } else {
         recargoElementos = 0.0;
      }
      return recargoElementos;
   }
         
   @Override
   public String toString() {
      final String PLANTILLA = "* Nombre:%s\n"+
         "* Marca:%s\n"+ "* Categoría:%s\n"+ "* Precio en Euros:%s\n"+"* IVA:%s\n"+
         "* Altura en metros:%s\n"+ "* Anchura en metros:%s\n"+"* Peso en kg:%s\n"+
         "* Número de elementos:%s\n"+"* Descripción:%s";

      String cadena = String.format(PLANTILLA, getNombre(), getMarca(), getPrecio()
          +  getAltura(), getAnchura(), getPeso(), getNumElemento(), getDescripcion());

      return cadena;
   }
}