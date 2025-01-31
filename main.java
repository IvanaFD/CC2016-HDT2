/**
 * Universidad del Valle de Guatemala
 * Algoritmos y Estructuras de Datos - Seccion 31
 * Hoja de Trabajo 2
 * Integrantes:
 * Biancka Raxón 24960
 * Diana Sosa 241040
 * Ivana Figueroa 24785
 * 
 * 
 * Clase: Main
 * Clase principal del programa
 * lee el archivo (datos.txt), lo procesa usando una 
 * pila y realiza la correspondiente operación. 
 */
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String archivo = "datos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String expresion = br.readLine().trim(); 

            Calculadora calc = new Calculadora(new PilaVector<>());
            int resultado = calc.recorrerPila(expresion); 

            System.out.println("Resultado: " + resultado);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }
}
