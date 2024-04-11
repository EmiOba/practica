package es.tiernoparla.daw.mercadaw.productos;

import es.tiernoparla.daw.mercadaw.MercaDAW;

public abstract class Producto extends MercaDAW {
   final static double PRECIO_VENTA = 1.25;

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
   public static double getPrecioVenta() {
      return PRECIO_VENTA;
   }

   public double aplicarRecargoPorPeso(double peso) {
      final double PESO_MAX = 5;
      final double PESO_MIN = 1;
      final double RECARGO_PESO_MAYOR_5_KG = 0.15;
      final double RECARGO_PESO_MAYOR_1_KG = 0.10;
      final double RECARGO_PESO_MENOR_1_KG = 0.05;
      double recargoPeso = 0;
    
      if (peso > PESO_MAX) {// > 5 OSEA UN 6
         recargoPeso = PRECIO_VENTA * RECARGO_PESO_MAYOR_5_KG; //1.4
      } else if (peso > PESO_MIN) {// > 1 OSEA UN 4
         recargoPeso = PRECIO_VENTA * RECARGO_PESO_MAYOR_1_KG;//0.12
      } else {// < 1 osea un 0.5, =5, =1;
         recargoPeso = PRECIO_VENTA * RECARGO_PESO_MENOR_1_KG;//0.06
      }
      return recargoPeso;
   }

   public double aplicarRecargoAltura(double altura) {

      final double METRO_LIMITE = 0.5;
      final double RECARGO_ALTURA_MAYOR = 0.10;
      final double RECARGO_ALTURA_MENOR = 0.05;
      double recargoAltura = 0;

      if (altura > METRO_LIMITE) {
         recargoAltura = PRECIO_VENTA * RECARGO_ALTURA_MAYOR;//0.12
      } else {
         recargoAltura = PRECIO_VENTA * RECARGO_ALTURA_MENOR;//0.06
      }

      return recargoAltura;
   }
  
   public double aplicarRecargoPorAnchura(double anchura) {

      final double METRO_LIMITE = 0.5;
      final double RECARGO_ANCHURA_MAYOR= 0.10;
      final double RECARGO_ANCHURA_MENOR = 0.05;
      double recargoAnchura = 0;
      
      if (anchura > METRO_LIMITE) {
         recargoAnchura = PRECIO_VENTA * RECARGO_ANCHURA_MAYOR;//0.12
      } else {
         recargoAnchura = PRECIO_VENTA * RECARGO_ANCHURA_MENOR;//0.06
      }
      return recargoAnchura;
   }
  
   public double aplicarRecargoPorNumElemento(int numElemento) {
      final double ELEM_LIMITE = 2;
      final double RECARGO_ELEMENTOS_MAYOR = 0.10;
      double recargoElementos = 0;

      if (numElemento > ELEM_LIMITE) {
         recargoElementos = PRECIO_VENTA * RECARGO_ELEMENTOS_MAYOR;//0.12
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

      String cadena = String.format(PLANTILLA, nombre, marca, precio
          +  altura, anchura, peso, numElemento, descripcion);

      return cadena;
   }
}