import javax.swing.*;

public class Usuario {

    public Conexion conectarse(){
        // Pide datos para la conexión.
        String user = Main.pedirDatosObligatorios("Ingrese el usuario:");
        String password = Main.pedirDatosObligatorios("Ingrese la contraseña:");
        String host = Main.pedirDatosObligatorios("Ingrese el host");
        String codCaracter = Main.pedirDatosOpcionales("Ingrese la codificación de caracter:");
        String tiempoEspera = Main.pedirDatosOpcionales("Ingrese el tiempo de espera:");
        String certificadoSSL = Main.pedirDatosOpcionales("Ingrese el certificado SSL:");
        String puerto = Main.pedirDatosOpcionales("Ingrese el puerto:");
        String nombreBase = Main.pedirDatosOpcionales("Ingrese el nombre de la base:");
        // Se conecta.
        Conexion conexion =  new Conexion.ConexionBuilder(user, password, host)
               .codCaracter(codCaracter)
                .tiempoEspera(tiempoEspera)
                .certificadoSSL(certificadoSSL)
                .puerto(puerto)
                .nombreBase(nombreBase)
                .build();
        return conexion;
    }

}
