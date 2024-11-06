/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadoraejemplo;

/**
 * La clase CalculadoraEjemplo realiza operaciones aritméticas básicas.
 * 
 * Esta clase permite realizar operaciones de suma, resta, multiplicación 
 * y división entre dos operandos.
 * 
 * @author TuNombre
 * @version 1.0
 * @since 1.0
 * @see <a href="https://docs.oracle.com/en/java/">Java Documentation</a>
 */
public class CalculadoraEjemplo {
    private double operando1;
    private double operando2;
    private double resultado;

    /**
     * Constructor que inicializa los operandos con valores específicos.
     * 
     * @param operando1 El primer operando.
     * @param operando2 El segundo operando.
     */
    public CalculadoraEjemplo(double operando1, double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    /**
     * Realiza la suma de los operandos.
     * 
     * @return El resultado de la suma de operando1 y operando2.
     */
    public double sumar() {
        resultado = operando1 + operando2;
        return resultado;
    }

    /**
     * Realiza la resta de los operandos.
     * 
     * @return El resultado de la resta de operando1 menos operando2.
     */
    public double restar() {
        resultado = operando1 - operando2;
        return resultado;
    }

    /**
     * Realiza la multiplicación de los operandos.
     * 
     * @return El resultado de la multiplicación de operando1 por operando2.
     */
    public double multiplicar() {
        resultado = operando1 * operando2;
        return resultado;
    }

    /**
     * Realiza la división de los operandos.
     * 
     * @return El resultado de la división de operando1 entre operando2.
     * @throws ArithmeticException Si operando2 es cero.
     */
    public double dividir() throws ArithmeticException {
        if (operando2 == 0) {
            throw new ArithmeticException("División por cero no permitida.");
        }
        resultado = operando1 / operando2;
        return resultado;
    }

    /**
     * Calcula la potencia de operando1 elevado a operando2.
     * 
     * @return El resultado de elevar operando1 a la potencia de operando2.
     */
    public double potencia() {
        resultado = Math.pow(operando1, operando2);
        return resultado;
    }

    /**
     * Calcula la raíz cuadrada de operando1.
     * 
     * @return La raíz cuadrada de operando1.
     * @throws ArithmeticException Si operando1 es negativo.
     */
    public double raizCuadrada() throws ArithmeticException {
        if (operando1 < 0) {
            throw new ArithmeticException("Raíz cuadrada de un número negativo no permitida.");
        }
        resultado = Math.sqrt(operando1);
        return resultado;
    }

    /**
     * Método principal que crea objetos de CalculadoraEjemplo y prueba cada método.
     * 
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        CalculadoraEjemplo calc = new CalculadoraEjemplo(10, 5);

        System.out.println("Suma: " + calc.sumar());
        System.out.println("Resta: " + calc.restar());
        System.out.println("Multiplicación: " + calc.multiplicar());
        System.out.println("División: " + calc.dividir());
        System.out.println("Potencia: " + calc.potencia());
        
        // Cambiar operando1 para probar la raíz cuadrada
        calc.operando1 = 16;
        System.out.println("Raíz cuadrada de " + calc.operando1 + ": " + calc.raizCuadrada());
    }
}