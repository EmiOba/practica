package es.tiernoparla.daw.mercadaw.empleados;

public class Reponedor extends Empleado {
   final double SUELDO = 200;

   public Reponedor(String nombre, String apellido, String categoria) {
      super(nombre, apellido, categoria);

   }

   public double getSUELDO() {
      return SUELDO;
   }

}
