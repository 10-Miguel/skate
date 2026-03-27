import EjerciciosCiclosBucles.BuclesCiclos;
import EjerciciosCondicionales.EjerciciosCondicionales;
import TiendaSkate.InventarioSkate;
import databaseConexion.ConexionDb;
import databaseConexion.InicializarDb;
import javax.swing.JOptionPane;



public class Main {
    public static void main(String[] args) {
InicializarDb.crearTablas();
ConexionDb.getConexion();


        String selecion = (JOptionPane.showInputDialog(
                "Bienvenido A Programando Ando\n" +
                        "Aquí Aprenderemos a Programar Con Java\n\n" +
                        "Lista De Ejercicios\n" +
                        "1. Condicionales\n" +
                        "2. Ciclos y Bucles\n" +
                        "3. POO con Conexión a Base De Datos\n\n" +
                        "Ingrese una opción:"));

        int opcion = Integer.parseInt(selecion);

        if (opcion == 1) {
            JOptionPane.showMessageDialog(null, "1.Ingresando a Ejercicios Con Condicionales");
            EjerciciosCondicionales ejerciciosCondicionales = new EjerciciosCondicionales();
        }
        if (opcion == 2) {
            JOptionPane.showMessageDialog(null, "2.Ingresando a Ejercicios Con Ciclos y Bucles");
            BuclesCiclos Ciclos = new BuclesCiclos();
        }
        if (opcion == 3) {
            JOptionPane.showMessageDialog(null, "3.Ingresando a Ejercicios Con POO con Conexion a Base De Datos");
            InventarioSkate inventarioSkate = new InventarioSkate();
            inventarioSkate.iniciar();
        }

        if (opcion < 0 || opcion >3) {
            JOptionPane.showMessageDialog(null, "Opción no válida. Por favor, ingrese una opción entre 1 y 3.");

        }

    }
}
