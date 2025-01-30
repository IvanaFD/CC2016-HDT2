public class Calculadora {

    //* */ */ Constructor
    //public Calculadora() {
    //    this.pila = pila}

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