/*
    Autores: Diane Ortega Soto (1125618065),
             Juan Esteban Soto perez (1090272522),
             Oscar Leandro Agudelo Franco (1115182039).
 */

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        BaseDatos base = new BaseDatos("Admin","123","localhost"); // Se crea una base de datos.
        Usuario usuario1 = new Usuario(); // Se crea un primer usuario.
        Conexion con1 = usuario1.conectarse(); // El primer usuario intenta conectarse.
        System.out.println("Hashcode De la conexion 1: " + con1.hashCode()); // Imprime el hashcode de la conexion creada.
        System.out.println("Conexion1: " + con1); // Imprime la información de la conexión.
        base.ComprobarConexion(con1); // Valida los datos en la base de datos.

        // Repite el proceso anterior con un segundo usuario.
        Usuario usuario2 = new Usuario();
        Conexion con2 = usuario2.conectarse();
        System.out.println("Hashcode De la conexion 2: "+ con2.hashCode());
        System.out.println("Hashcode De la conexion 2: " + con2);
        base.ComprobarConexion(con2);

    }

    // Función que valida los datos obligatorios; si este dato es nulo, lo pedirá de nuevo.
    public static String pedirDatosObligatorios(String mensaje){
        boolean flag = true;
        String dato = null;
        while (flag){
            dato = JOptionPane.showInputDialog(null, mensaje);
            if(dato != null){
                flag = false;
            }
        }
        return dato;
    }

    // Función que ingresa los datos opcionales.
    public static String pedirDatosOpcionales(String mensaje){
        String dato = JOptionPane.showInputDialog(null, mensaje);
        return dato;
    }

}
