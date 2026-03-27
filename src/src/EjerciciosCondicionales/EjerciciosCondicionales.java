package EjerciciosCondicionales;

import javax.swing.JOptionPane;

public class EjerciciosCondicionales {

    public EjerciciosCondicionales() {

        String Selecion = JOptionPane.showInputDialog(
                "EJERCICIO 1 - Número positivo, negativo o cero\n" +
                        "EJERCICIO 2 - Número par o impar\n" +
                        "EJERCICIO 3 - Mayor de edad\n" +
                        "EJERCICIO 4 - Calculadora básica\n" +
                        "EJERCICIO 5 - Año bisiesto\n" +
                        "EJERCICIO 6 - Clasificación de nota\n" +
                        "EJERCICIO 7 - Número mayor entre tres\n" +
                        "EJERCICIO 8 - Descuento en tienda\n" +
                        "EJERCICIO 9 - Sistema de login\n" +
                        "EJERCICIO 10 - Cálculo de IMC\n\n" +
                        "Ingrese un ejercicio:");

        if (Selecion == null) return;
        int Ejercicios = Integer.parseInt(Selecion);

        // EJERCICIO 1
        if (Ejercicios == 1) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número:"));
            if (numero > 0) {
                JOptionPane.showMessageDialog(null, "Resultado: Positivo");
            } else if (numero < 0) {
                JOptionPane.showMessageDialog(null, "Resultado: Negativo");
            } else {
                JOptionPane.showMessageDialog(null, "Resultado: Cero");
            }
        }

        // EJERCICIO 2
        if (Ejercicios == 2) {
            int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero:"));
            String res = (num % 2 == 0) ? "Par" : "Impar";
            JOptionPane.showMessageDialog(null, "El número " + num + " es " + res);
        }

        // EJERCICIO 3
        if (Ejercicios == 3) {
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));
            if (edad < 0) {
                JOptionPane.showMessageDialog(null, "Edad inválida");
            } else if (edad >= 18) {
                JOptionPane.showMessageDialog(null, "Puede ingresar");
            } else {
                JOptionPane.showMessageDialog(null, "Acceso denegado");
            }
        }

        // EJERCICIO 4
        if (Ejercicios == 4) {
            double n1 = Double.parseDouble(JOptionPane.showInputDialog("Número 1:"));
            double n2 = Double.parseDouble(JOptionPane.showInputDialog("Número 2:"));
            String op = JOptionPane.showInputDialog("Operador (+, -, *, /):");
            double resultado = 0;
            boolean valido = true;

            switch (op) {
                case "+": resultado = n1 + n2; break;
                case "-": resultado = n1 - n2; break;
                case "*": resultado = n1 * n2; break;
                case "/": 
                    if (n2 != 0) resultado = n1 / n2; 
                    else { JOptionPane.showMessageDialog(null, "Error: No se puede dividir entre cero"); valido = false; }
                    break;
                default: JOptionPane.showMessageDialog(null, "Operador no válido"); valido = false;
            }
            if (valido) JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
        }

        // EJERCICIO 5
        if (Ejercicios == 5) {
            int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año:"));
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                JOptionPane.showMessageDialog(null, anio + " es bisiesto.");
            } else {
                JOptionPane.showMessageDialog(null, anio + " no es bisiesto.");
            }
        }

        // EJERCICIO 6
        if (Ejercicios == 6) {
            int nota = Integer.parseInt(JOptionPane.showInputDialog("Nota (0-100):"));
            if (nota < 0 || nota > 100) {
                JOptionPane.showMessageDialog(null, "Rango incorrecto.");
            } else if (nota >= 90) {
                JOptionPane.showMessageDialog(null, "Excelente");
            } else if (nota >= 80) {
                JOptionPane.showMessageDialog(null, "Bueno");
            } else if (nota >= 70) {
                JOptionPane.showMessageDialog(null, "Aceptable");
            } else if (nota >= 60) {
                JOptionPane.showMessageDialog(null, "Insuficiente");
            } else {
                JOptionPane.showMessageDialog(null, "Reprobado");
            }
        }

        // EJERCICIO 7
        if (Ejercicios == 7) {
            int a = Integer.parseInt(JOptionPane.showInputDialog("Número 1:"));
            int b = Integer.parseInt(JOptionPane.showInputDialog("Número 2:"));
            int c = Integer.parseInt(JOptionPane.showInputDialog("Número 3:"));
            
            if (a == b && b == c) {
                JOptionPane.showMessageDialog(null, "Empate triple: " + a);
            } else {
                int mayor = Math.max(a, Math.max(b, c));
                JOptionPane.showMessageDialog(null, "El mayor es: " + mayor);
            }
        }

        // EJERCICIO 8
        if (Ejercicios == 8) {
            double compra = Double.parseDouble(JOptionPane.showInputDialog("Valor de compra:"));
            double desc = 0;
            if (compra > 500000) desc = 0.20;
            else if (compra > 200000) desc = 0.15;
            else if (compra > 100000) desc = 0.10;

            double total = compra - (compra * desc);
            JOptionPane.showMessageDialog(null, "Original: $" + compra + 
                "\nDescuento: " + (desc * 100) + "%\nTotal: $" + total);
        }

        // EJERCICIO 9
        if (Ejercicios == 9) {
            String user = JOptionPane.showInputDialog("Usuario:");
            String pass = JOptionPane.showInputDialog("Contraseña:");
            if ("admin".equals(user) && "1234".equals(pass)) {
                JOptionPane.showMessageDialog(null, "Bienvenido");
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
            }
        }

        // EJERCICIO 10
        if (Ejercicios == 10) {
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso (kg):"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura (m):"));
            double imc = peso / (altura * altura);
            String rango = "";

            if (imc < 18.5) rango = "Bajo peso";
            else if (imc < 25) rango = "Normal";
            else if (imc < 30) rango = "Sobrepeso";
            else rango = "Obesidad";

            JOptionPane.showMessageDialog(null, "Tu IMC es: " + String.format("%.2f", imc) + "\nClasificación: " + rango);
        }

        // Validación de rango
        if (Ejercicios > 10 || Ejercicios <= 0) {
            JOptionPane.showMessageDialog(null, "Ingresó un valor inválido");
        }
    }
}