import java.util.Scanner;
public class TareaFibonacci {
    public static void main(String [] args) {
        System.out.print("El numero de Fibonacci calculado es: " + calcularFibonacci(conocerNumeroMayorQueCero("Ingrese el numero de Fibonacci que desea calcular: ")));
    }
    public static int calcularFibonacci(int numero) {
        if (numero == 0 || numero == 1) {
            return numero;
        }
        else {
        return calcularFibonacci(numero - 1) + calcularFibonacci(numero - 2);
        }
    }
    public static int conocerNumeroMayorQueCero(String txt) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(txt);
        int n = teclado.nextInt();
        while(n < 0 ) {
            System.out.println("El valor ingresado es invalido. Ingrese un valor mayor o igual a cero ");
            n = teclado.nextInt();
        }
        return n;
    }
}