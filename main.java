/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Sección 31
 * Hoja de Trabajo 2
 * Integrantes:
 * Biancka Raxón 24960
 * Diana Sosa 241040
 * Ivana Figueroa 24785
 * 
 * Clase: {@code Main}
 * 
 * Clase principal del programa. Esta clase lee un archivo de texto llamado {@code datos.txt}, 
 * procesa una expresión en notación postfix usando una pila, y luego realiza la operación correspondiente.
 * La expresión se evalúa utilizando la clase {@code Calculadora} y se imprime el resultado.
 */
import java.io.*;

public class Main {
    
    /**
     * Método principal del programa. 
     * Este método lee una expresión en notación postfix desde un archivo de texto, 
     * la procesa utilizando una pila para evaluar la expresión, y muestra el resultado.
     * 
     * @param args Argumentos de la línea de comandos (no se utilizan en esta aplicación).
     */
    public static void main(String[] args) {
        // Nombre del archivo que contiene la expresión
        String archivo = "datos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            // Leer la expresión desde el archivo
            String expresion = br.readLine().trim(); 

            // Crear una instancia de la calculadora con una pila de tipo PilaVector
            Calculadora calc = new Calculadora(new PilaVector<>());
            
            // Evaluar la expresión usando el método recorrerPila
            int resultado = calc.recorrerPila(expresion); 

            // Mostrar el resultado
            System.out.println("Resultado: " + resultado);
        } catch (IOException e) {
            // Manejo de errores al leer el archivo
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (RuntimeException e) {
            // Manejo de errores en la ejecución de la calculadora
            System.out.println(e.getMessage());
        }
    }
}
