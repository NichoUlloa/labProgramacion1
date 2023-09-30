public class Ejemplos {

    public static void main(String[] args) {
        ejemploSintaxis();
        ejemploLogica();
        double resultado = dividir(10, 0);
        System.out.println("Resultado de dividir: " + resultado);
    }

    public static void ejemploSintaxis() {
        int numero = 10;
        if (numero > 5) {  // Corrección del error sintáctico, se agrega un paréntesis
            System.out.println("El número es mayor que 5.");
        }
    }

    public static void ejemploLogica() {
        int numero = 5;
        if (numero > 10) {  // Error lógico, la condición es incorrecta
            System.out.println("El número es mayor que 10.");
        } else {
            System.out.println("El número es menor o igual a 10.");
        }
    }

    public static double dividir(int numerador, int divisor) {
        try {
            return numerador / divisor;
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Error: División por cero.");
        }
    }
}

