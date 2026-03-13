import EjerciciosCiclosBucles.BuclesCiclos;
import EjerciciosCondicionales.EjerciciosCondicionales;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String selecion = (JOptionPane.showInputDialog(
                "Bienvenido A Programando Ando\n" +
                        "Aquí Aprenderemos a Programar Con Java\n\n" +
                        "Lista De Ejercicios\n" +
                        "1. Condicionales\n" +
                        "2. Ciclos y Bucles\n" +
                        "3. Switch\n" +
                        "4. Do-While\n" +
                        "5. Ejercicios Básicos POO\n" +
                        "6. POO con Conexión a Base De Datos\n\n" +
                        "Ingrese una opción:"));

        int opcion = Integer.parseInt(selecion);

        if (opcion == 1) {
            System.out.println("1.Ingresando a Ejercicios Con Condicionales");
            EjerciciosCondicionales ejerciciosCondicionales = new EjerciciosCondicionales();
        }
        if (opcion == 2) {
            System.out.println("2.Ingresando a Ejercicios Con Ciclos y Bucles");
            BuclesCiclos Ciclos = new BuclesCiclos();
        }

        if (opcion == 3) {
            System.out.println("3.Ingresando a Ejercicios Con Switch");
        }

        if (opcion == 4) {
            System.out.println("4.Ingresando a Ejercicios Con Do-While");
        }

        if (opcion == 5) {
            System.out.println("5.Ingresando a Ejercicios Basicos POO");
        }

        if (opcion == 6) {
            System.out.println("6.Ingresando a Ejercicios Con POO con Conexion a Base De Datos");
        }

        if (opcion < 0 || opcion > 6) {
            System.out.println("Ingreso una Opcion Invalidad");
        }

    }
}
