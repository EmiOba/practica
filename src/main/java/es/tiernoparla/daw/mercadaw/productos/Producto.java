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

public Producto(String nombre, String marca, String categoria, double precio, int altura, int anchura, int peso,
   int numElemento, String descripcion) {
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
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }
   public String getMarca() {
      return marca;
   }
   public void setMarca(String marca) {
      this.marca = marca;
   }
   public String getCategoria() {
      return categoria;
   }
   public void setCategoria(String categoria) {
      this.categoria = categoria;
   }
   public double getPrecio() {
      return precio;
   }
   public void setPrecio(double precio) {
      this.precio = precio;
   }
   public int getAltura() {
      return altura;
   }
   public void setAltura(int altura) {
      this.altura = altura;
   }
   public int getAnchura() {
      return anchura;
   }
   public void setAnchura(int anchura) {
      this.anchura = anchura;
   }
   public int getPeso() {
      return peso;
   }
   public void setPeso(int peso) {
      this.peso = peso;
   }
   public int getNumElemento() {
      return numElemento;
   }
   public void setNumElemento(int numElemento) {
      this.numElemento = numElemento;
   }
   public String getDescripcion() {
      return descripcion;
   }
   public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
   }
   public  abstract double recargoPorAltura(int altura);
   public  abstract double recargoPorAnchura(int anchura); 
   public  abstract double recargoPorPeso(int peso);
   public  abstract double recargoPorNumElento(int numElemento); 
   
}
