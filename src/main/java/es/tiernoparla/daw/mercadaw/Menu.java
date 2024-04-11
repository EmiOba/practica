package es.tiernoparla.daw.mercadaw;

public interface Menu {
   public final int OPC_DAR_ALTA_PRODUCTO = 1;
   public final int OPC_DAR_ALTA_EMPLEADO = 2;
   public final int OPC_MOSTRAR_DATOS_PRODUCTO = 3;
   public final int OPC_MOSTRAR_LISTA_EMPLEADO = 4;
   public final int OPC_OBTENER_PRECIO_PRODUCTO = 5;
   public final int OPC_IMPRIMIR_ETIQUETA = 6;
   public final int OPC_SALIR = 7;

   public final String MSG_OPC_1 = "pulsa 1 para dar de alta un Producto";
   public final String MSG_OPC_2 = "pulsa 2 para dar de alta un Empleado";
   public final String MSG_OPC_3 = "pulsa 3 para mostrar datos del Producto";
   public final String MSG_OPC_4 = "pulsa 4 para mostrar lista de Empleados";
   public final String MSG_OPC_5 = "pulsa 5 para obtener el precio del Producto";
   public final String MSG_OPC_6 = "pulsa 6 para imprimir etiqueta";
   public final String MSG_OPC_7 = "pulsa 7 para salir del Menu";

   public final String MSG_INTRODUCIR_OPC = "Por favor introducir una opcion correcta";
   public final String MSG_ERROR = "la opcion introducida es incorrecta porfavor vuelve a intentaro";
   public final String MSG_FIN_DEL_PROGRAM = "Fin del programa. GRACIAS POR SU TIEMPO";


   public void menu();
}
