public class Calculadora {
    private Pila<Integer> pila;

    // Constructor
    public Calculadora(Pila<Integer> pila) {
        this.pila = pila;
    }

    public int recorrerPila(String expresion) {
        String[] caracteres = expresion.split(" ");

        for (String caracter : caracteres) {
            if (caracter.matches("\\d+")) {
                pila.push(Integer.parseInt(caracter));

            } else {
                if (pila.size() < 2) {
                    throw new RuntimeException("Error: Hay menos de dos operandos.");
                }

                int b = pila.pop();
                int a = pila.pop();
                int resultado = calcular(a, b, caracter);
                pila.push(resultado);
            }
        }

        if (pila.size() != 1) {
            throw new RuntimeException("Error: La expresion es inválida.");
        }

        return pila.pop();
    }

    private int calcular(int a, int b , String operador) {
        switch (operador) {
            case "+": 
                return a + b;
            case "-": 
                return a-b;
            case "*": 
                return a*b;
            case "/": 
                if (b==0) 
                    throw new ArithmeticException("Error: Divión entre cero. ");
                return a / b;

            case "%": 
                return a % b;
        
            default:
                throw new RuntimeException("Error: Operador no válido (" + operador + ").");
        }
    }
}