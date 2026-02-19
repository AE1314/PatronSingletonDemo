

/*
 * Implementación del patrón Singleton
 * Garantiza una única instancia de la clase ConexionBD
 */

package patronsingletondemo;

public class PatronSingletonDemo {

    public static void main(String[] args) {

        ConexionBD conexion1 = ConexionBD.getInstancia();
        ConexionBD conexion2 = ConexionBD.getInstancia();

        conexion1.conectar();

        if (conexion1 == conexion2) {
            System.out.println("Singleton funcionando: es la misma instancia.");
        }
    }
}
