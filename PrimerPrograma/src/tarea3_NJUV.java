import java.util.Scanner;
public class tarea3_NJUV {
    public static void main(String[] args) {
        System.out.println("El numero de Fibonacci calculado es: " + calcularNumeroFibonacci(conocerNumeroMayorQueCero("Ingrese el numero de Fibonacci que desea calcular: ")));
    }
    public static int calcularNumeroFibonacci(int numero) {
        if (numero <= 1) {
            return numero;
        }
        else {
            return calcularNumeroFibonacci(numero - 1) + calcularNumeroFibonacci(numero - 2);
        }
    }
    public static int conocerNumeroMayorQueCero(String txt) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(txt);
        int n = teclado.nextInt();
        while(n < 0 ) {
            System.out.println("El valor ingresado es invalido. Ingrese un valor mayor a cero ");
            n = teclado.nextInt();
        }
        return n;
    }
}