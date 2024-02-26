package es.tiernoparla.daw.mercadaw.empleados;

public class Encargado extends Empleado {
   final double SUELDO = 500;

   public Encargado(String nombre, String apellido, String categoria) {
      super(nombre, apellido, categoria);
   }
   
   public double getSUELDO() {
      return SUELDO;
   }


}
