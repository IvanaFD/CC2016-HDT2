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
