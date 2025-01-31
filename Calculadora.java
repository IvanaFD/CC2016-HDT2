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
 * Clase: Calculadora.java
 * Evalua expresiones en notacion postfix usando una pila. 
 */
public class Calculadora {

    /**
     * Pila que se utiliza para almacenar los operandos durante la evaluación de la expresión.
     */
    private Pila<Integer> pila;

    /**
     * Constructor de la clase {@code Calculadora}.
     * 
     * @param pila La pila que se utilizará para almacenar los operandos.
     */

    public Calculadora(Pila<Integer> pila) {
        this.pila = pila;
    }

     /**
     * Procesa una expresión matemática en notación postfix (notación polaca inversa).
     * La expresión debe estar separada por espacios y puede contener operandos y operadores.
     * La expresión es evaluada y el resultado se devuelve como un valor entero.
     * 
     * @param expresion La expresión matemática en notación postfix.
     * @return El resultado de la evaluación de la expresión.
     * @throws RuntimeException Si la expresión es inválida o contiene menos de dos operandos cuando se requiere.
     * @pre La expresión debe estar correctamente formada y contener al menos dos operandos cuando sea necesario.
    * @post El resultado de la expresión es calculado y devuelto como un entero.
     */
    
    public int recorrerPila(String expresion) {
        String[] caracteres = expresion.split(" ");

        for (String caracter : caracteres) {
            // Si el caracter es un número, se agrega a la pila.
            if (caracter.matches("\\d+")) {
                pila.push(Integer.parseInt(caracter));

            } else {
                // Si hay menos de dos operandos, lanza una excepción
                if (pila.isEmpty() || pila.size() < 2) {
                    throw new RuntimeException("Error: Hay menos de dos operandos.");
                }


                // Se extraen los dos últimos operandos de la pila
                int b = pila.pop();
                int a = pila.pop();


                // Se realiza el cálculo y se guarda el resultado en la pila.
                int resultado = calcular(a, b, caracter);
                pila.push(resultado);
            }
        }

            // Si la pila no contiene exactamente un resultado final, lanza una excepción
        if (pila.isEmpty() || pila.size() != 1) {
            throw new RuntimeException("Error: La expresión es inválida.");
        }

        // Se devuelve el resultado final de la pila.
        return pila.pop();
    }

    /**
     * Realiza una operación aritmética entre dos operandos según el operador proporcionado.
     * 
     * @param a El primer operando (número).
     * @param b El segundo operando (número).
     * @param operador El operador aritmético como {@code String}. Puede ser uno de los siguientes:
     *                 {@code "+", "-", "*", "/", "%"}.
     * @return El resultado de la operación entre {@code a} y {@code b}.
     * @throws RuntimeException Si el operador no es válido.
     * @throws ArithmeticException Si se intenta dividir entre cero.
    * @pre El operador debe ser uno de los valores válidos: "+", "-", "*", "/", "%".
    * @post Se realiza la operación aritmética y se devuelve el resultado.
     */
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