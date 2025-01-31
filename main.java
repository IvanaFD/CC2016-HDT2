import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        String archivo = "datos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                try {
                    // Código sin el método evaluarExpresion
                    System.out.println("Expresión: " + linea);
                } catch (RuntimeException e) {
                    System.out.println("Error en la expresión: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
