package es.tiernoparla.daw.mercadaw.empleados;

public class Cajero extends Empleado{
   final double SUELDO = 300;
   
   public Cajero(String nombre, String apellido, String categoria) {
      super(nombre, apellido, categoria);
      //TODO Auto-generated constructor stub
   }
   
   public double getSUELDO() {
      return SUELDO;
   }
}
