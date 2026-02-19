package patronsingletondemo;

public class ConexionBD {

    private ConexionBD() {
        System.out.println("Conexión creada.");
    }

    private static class Holder {
        private static final ConexionBD INSTANCIA = new ConexionBD();
    }

    public static ConexionBD getInstancia() {
        return Holder.INSTANCIA;
    }

    public void conectar() {
        System.out.println("Conectado correctamente.");
    }
}

