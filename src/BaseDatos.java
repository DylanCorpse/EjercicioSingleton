public class BaseDatos {

    private String nombreUsuario;
    private String password;
    private String host;

    public BaseDatos(String nombreUsuario, String password, String host) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.host = host;
    }

    // Este método verifica que la información de la conexión sea igual a la base de datos.
    public void ComprobarConexion(Conexion conexion ){
        if ( nombreUsuario.equals(conexion.getNombreUsuario()) && password.equals(conexion.getPassword())  && host.equals(conexion.getHost())){
            System.out.println("Conexion exitosa, ingresando a la base de datos... Por favor espere...");
            System.out.println("Conexion establecida.");
        } else System.out.println("Error en la conexion, por favor revise las credenciales.");

    }

}
