public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        String archivo = "datos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                try {
                    int resultado = calc.evaluarExpresion(linea);
                    System.out.println("Expresión: " + linea + " = " + resultado);
                } catch (RuntimeException e) {
                    System.out.println("Error en la expresión: " + e.getMessage());
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

        
