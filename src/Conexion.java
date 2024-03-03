public class Conexion {

    // Inicializa las variables de la conexión.
    private String nombreUsuario;
    private String password;
    private String host;
    private String codCaracter;
    private String tiempoEspera;
    private String certificadoSSL;
    private String puerto;
    private String nombreBase;

    private static Conexion instance; // Crea una instancia de tipo "Conexion".

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public String getHost() {
        return host;
    }

    private Conexion(){} // Constructor vacío y privado para asegurarse de que solo pueda ser usado al crear una instancia.

    // Método que setea la información del usuario ingresada.
    public void setInfo(String nombreUsuario, String password, String host, String codCaracter, String tiempoEspera,
                    String certificadoSSL, String puerto, String nombreBase) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.host = host;
        this.codCaracter = codCaracter;
        this.tiempoEspera = tiempoEspera;
        this.certificadoSSL = certificadoSSL;
        this.puerto = puerto;
        this.nombreBase = nombreBase;
    }

    // Método singleton que crea una única conexión.
    public static Conexion getInstance() {
        if (instance == null) {
            instance = new Conexion();
        }
        return instance;
    }

    // Patrón builder de la conexión.
    public static class ConexionBuilder{
        private String nombreUsuario;
        private String password;
        private String host;
        private String codCaracter;
        private String tiempoEspera;
        private String certificadoSSL;
        private String puerto;
        private String nombreBase;

        // Este es el constructor de la clase "ConexionBuilder", en la cual se ingresan estos tres datos de caracter obligatorio.
        public ConexionBuilder(String nombreUsuario, String password, String host){
            this.nombreUsuario(nombreUsuario).password(password).host(host); // Setea los tres parámetros reutilizando el mismo patrón builder.
        }

        public ConexionBuilder nombreUsuario(String nombreUsuario){
            this.nombreUsuario = nombreUsuario;
            return this;
        }

        public ConexionBuilder password(String password){
            this.password = password;
            return this;
        }

        public ConexionBuilder host(String host){
            this.host = host;
            return this;
        }

        public ConexionBuilder codCaracter(String codCaracter){
            this.codCaracter = codCaracter;
            return this;
        }

        public ConexionBuilder tiempoEspera(String tiempoEspera){
            this.tiempoEspera = tiempoEspera;
            return this;
        }

        public ConexionBuilder certificadoSSL(String certificadoSSL){
            this.certificadoSSL = certificadoSSL;
            return this;
        }

        public ConexionBuilder puerto(String puerto){
            this.puerto = puerto;
            return this;
        }

        public ConexionBuilder nombreBase(String nombreBase){
            this.nombreBase = nombreBase;
            return this;
        }

        // Este es el builder de la clase "Conexion".
        public Conexion build(){
            /*
            A la conexion creada, se le setea la información del builder con el método "setInfo", pero no se modifica
            la conexion gracias al método singleton "getInstance".
             */
            Conexion.getInstance().setInfo(nombreUsuario, password, host, codCaracter, tiempoEspera, certificadoSSL, puerto, nombreBase);
            return Conexion.getInstance(); // Se retorna la información.
        }


    }

    @Override
    public String toString() {
        return "Conexion{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", password='" + password + '\'' +
                ", host='" + host + '\'' +
                ", codCaracter='" + codCaracter + '\'' +
                ", tiempoEspera='" + tiempoEspera + '\'' +
                ", certificadoSSL='" + certificadoSSL + '\'' +
                ", puerto='" + puerto + '\'' +
                ", nombreBase='" + nombreBase + '\'' +
                '}';
    }
}

