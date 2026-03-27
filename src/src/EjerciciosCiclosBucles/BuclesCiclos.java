package EjerciciosCiclosBucles;

import javax.swing.JOptionPane;

// 1. Imprimir los números del 1 al 50 usando un ciclo for.
// 2. Mostrar los números del 50 al 1 usando un ciclo for.
// 3. Imprimir todos los números pares del 1 al 100 usando un ciclo for.
// 4. Imprimir todos los números impares del 1 al 100 usando un ciclo while.
// 5. Calcular la suma de los números del 1 al 100 usando un ciclo for.
// 6. Calcular la suma de los números impares del 1 al 50 usando un ciclo for.
// 7. Mostrar la tabla de multiplicar del número 7 usando un ciclo for.
// 8. Mostrar las tablas de multiplicar del 1 al 10 usando ciclos for anidados.
// 9. Contar cuántos números del 1 al 200 son múltiplos de 10 usando un ciclo for.
// 10. Mostrar los números del 1 al 100 que sean divisibles entre 3 y 5 usando un ciclo for.
// 11. Calcular el factorial de un número almacenado en una variable usando un ciclo for.
// 12. Recorrer un arreglo de 10 números e imprimir cada elemento usando un ciclo for.
// 13. Calcular la suma de los elementos de un arreglo usando un ciclo for.
// 14. Encontrar el número mayor dentro de un arreglo usando un ciclo for.
// 15. Encontrar el número menor dentro de un arreglo usando un ciclo for.
// 16. Contar cuántas veces aparece un número específico en un arreglo usando un ciclo for.
// 18. Imprimir un cuadrado de 6x6 asteriscos usando ciclos for anidados.
// 19. Mostrar los primeros 20 números y su cubo usando un ciclo for.
// 20. Recorrer una cadena de texto e imprimir cada carácter usando un ciclo for.
public class BuclesCiclos {
    public BuclesCiclos() {
        String menu = "Seleccione un ejercicio (1-20):\n" +
                "1. Números 1 al 50\n" +
                "2. Números 50 al 1\n" +
                "3. Pares 1 al 100\n" +
                "4. Impares 1 al 100 (while)\n" +
                "5. Suma 1 al 100\n" +
                "6. Suma impares 1 al 50\n" +
                "7. Tabla del 7\n" +
                "8. Tablas 1 al 10\n" +
                "9. Múltiplos de 10 (1-200)\n" +
                "10. Divisibles entre 3 y 5 (1-100)\n" +
                "11. Factorial\n" +
                "12. Recorrer arreglo 10 números\n" +
                "13. Sumar elementos arreglo\n" +
                "14. Número mayor en arreglo\n" +
                "15. Número menor en arreglo\n" +
                "16. Contar número específico\n" +
                "17. Triángulo de asteriscos\n" +
                "18. Cuadrado 6x6\n" +
                "19. Cubo de los primeros 20\n" +
                "20. Recorrer cadena de texto";
                String entrada = JOptionPane.showInputDialog(menu);
        if (entrada == null) return; // Por si el usuario cierra la ventana

        int Ejercicio = Integer.parseInt(entrada);

        if (Ejercicio == 1) {
            String resultado = "";
            for (int i = 1; i <= 50; i++) {
                resultado += i + " ";
                if (i % 10 == 0) resultado += "\n";
            }
            JOptionPane.showMessageDialog(null, "Números del 1 al 50:\n" + resultado);
        }

        if (Ejercicio == 2) {
            String resultado = "";
            for (int i = 50; i >= 1; i--) {
                resultado += i + " ";
                if (i % 10 == 0) resultado += "\n";
            }
            JOptionPane.showMessageDialog(null, "Números del 50 al 1:\n" + resultado);
        }

        if (Ejercicio == 3) {
            String resultado = "";
            for (int i = 2; i <= 100; i += 2) {
                resultado += i + " ";
                if (i % 10 == 0) resultado += "\n";
            }
            JOptionPane.showMessageDialog(null, "Números pares del 1 al 100:\n" + resultado);
        }

        if (Ejercicio == 4) {
            String resultado = "";
            int i = 1;
            while (i <= 100) {
                if (i % 2 != 0) resultado += i + " ";
                if (i % 20 == 19) resultado += "\n";
                i++;
            }
            JOptionPane.showMessageDialog(null, "Números impares del 1 al 100:\n" + resultado);
        }

        if (Ejercicio == 5) {
            int suma = 0;
            for (int i = 1; i <= 100; i++) {
                suma += i;
            }
            JOptionPane.showMessageDialog(null, "La suma de los números del 1 al 100 es: " + suma);
        }

        if (Ejercicio == 6) {
            int Suma = 0;
            for (int i = 0; i <= 50; i++) {
                if (i % 2 != 0) {
                    Suma = Suma + i;
                }
            }
            JOptionPane.showMessageDialog(null, "La suma de impares del 1 al 50 es: " + Suma);
        }

        if (Ejercicio == 7) {
            String tabla = "";
            for (int i = 1; i <= 10; i++) {
                tabla += "7 x " + i + " = " + (7 * i) + "\n";
            }
            JOptionPane.showMessageDialog(null, "Tabla del 7:\n" + tabla);
        }

        if (Ejercicio == 8) {
            String tablas = "";
            for (int i = 1; i <= 10; i++) {
                tablas += "Tabla del " + i + ": ";
                for (int j = 1; j <= 10; j++) {
                    tablas += (i * j) + " ";
                }
                tablas += "\n";
            }
            JOptionPane.showMessageDialog(null, "Tablas del 1 al 10:\n" + tablas);
        }

        if (Ejercicio == 9) {
            int contador = 0;
            for (int i = 1; i <= 200; i++) {
                if (i % 10 == 0) contador++;
            }
            JOptionPane.showMessageDialog(null, "Cantidad de múltiplos de 10 entre 1 y 200: " + contador);
        }

        if (Ejercicio == 10) {
            String resultado = "";
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) { // Corregido a && para que sea divisible por ambos
                    resultado += i + " ";
                }
            }
            JOptionPane.showMessageDialog(null, "Divisibles entre 3 y 5:\n" + resultado);
        }

        if (Ejercicio == 11) {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número para el factorial:"));
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            JOptionPane.showMessageDialog(null, "El factorial de " + n + " es: " + factorial);
        }

        if (Ejercicio == 12) {
            int[] arreglo = new int[10];
            String items = "Elementos:\n";
            for (int j = 0; j < arreglo.length; j++) {
                arreglo[j] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor pos " + j));
                items += "Pos " + j + ": " + arreglo[j] + "\n";
            }
            JOptionPane.showMessageDialog(null, items);
        }

        if (Ejercicio == 13) {
            int[] arreglo = {10, 20, 30, 40, 50};
            int suma = 0;
            for (int num : arreglo) suma += num;
            JOptionPane.showMessageDialog(null, "Suma del arreglo {10,20,30,40,50} es: " + suma);
        }

        if (Ejercicio == 14) {
            int[] Vector = { 1, 8, 3, 4, 15, 2 };
            int Mayor = Vector[0];
            for (int i = 0; i < Vector.length; i++) {
                if (Vector[i] > Mayor) {
                    Mayor = Vector[i];
                }
            }
            JOptionPane.showMessageDialog(null, "El mayor es: " + Mayor);
        }

        if (Ejercicio == 15) {
            int tamano = Integer.parseInt(JOptionPane.showInputDialog("Tamaño del vector:"));
            int[] vector = new int[tamano];
            for (int i = 0; i < vector.length; i++) {
                vector[i] = Integer.parseInt(JOptionPane.showInputDialog("Valor pos " + i));
            }
            int menor = vector[0];
            for (int j = 0; j < vector.length; j++) {
                if (menor > vector[j]) {
                    menor = vector[j];
                }
            }
            JOptionPane.showMessageDialog(null, "El número menor es: " + menor);
        }

        if (Ejercicio == 16) {
            int[] arreglo = {1, 2, 3, 2, 4, 2, 5};
            int buscar = Integer.parseInt(JOptionPane.showInputDialog("Número a buscar en {1,2,3,2,4,2,5}:"));
            int cont = 0;
            for (int n : arreglo) if (n == buscar) cont++;
            JOptionPane.showMessageDialog(null, "El número " + buscar + " aparece " + cont + " veces.");
        }

        if (Ejercicio == 17) {
            String triangulo = "";
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    triangulo += "*";
                }
                triangulo += "\n";
            }
            JOptionPane.showMessageDialog(null, "Triángulo:\n" + triangulo);
        }

        if (Ejercicio == 18) {
            String cuadrado = "";
            for (int i = 1; i <= 6; i++) {
                for (int j = 0; j < 6; j++) {
                    cuadrado += "* ";
                }
                cuadrado += "\n";
            }
            JOptionPane.showMessageDialog(null, "Cuadrado 6x6:\n" + cuadrado);
        }

        if (Ejercicio == 19) {
            String resultado = "";
            for (int i = 1; i <= 20; i++) {
                resultado += i + " al cubo = " + (i * i * i) + "\n";
            }
            JOptionPane.showMessageDialog(null, "Cubos:\n" + resultado);
        }

        if (Ejercicio == 20) {
            String Cadena = JOptionPane.showInputDialog("Ingrese texto:");
            String deletreo = "";
            for (int i = 0; i < Cadena.length(); i++) {
                deletreo += Cadena.charAt(i) + "\n";
            }
            JOptionPane.showMessageDialog(null, "Caracteres:\n" + deletreo);
        }

        if (Ejercicio > 20 || Ejercicio < 1) {
            JOptionPane.showMessageDialog(null, "Opción No Válida");
        }
    }
}
