import java.util.Scanner;
public class tarea1_NJUV
{
    public static void main(String[] args)
    {
        // Conocer entradas
        int credito = conocerNumeroEntero("Monto del credito que desea", 10000, 100000000);
        int cuotas = conocerNumeroEntero("Cantidad de cuotas", 1,120);
        calcularMontoTotalCredito(credito, cuotas);
    }
    public static void calcularMontoTotalCredito(int credito, int cuotas)
    {
        double interes;
        // Menores o iguales a 1.000.000
        if(credito <= 1000000)
        {
            // Interés en 1 a 12 cuotas
            if(cuotas >= 1 && cuotas <= 12)
            {
                interes= 0.25;
            }
            // Interés en 13 o 23 cuotas
            else if(cuotas >= 13 && cuotas <= 23)
            {
                interes = 0.3;
            }
            // Interés en 24 cuotas o más
            else interes = 0.35;
        }
        // Mayores a 1.000.000
        else
        {
            // Interés en 1 a 12 cuotas
            if(cuotas >= 1 && cuotas <= 12)
            {
                interes= 0.15;
            }
            // Interés en 13 o 23 cuotas
            else if(cuotas >= 13 && cuotas <= 23)
            {
                interes = 0.2;
            }
            // Interés en 24 cuotas o más
            else interes = 0.25;
        }
        double montoTotalCredito = credito + (credito * interes);
        double cuotaMensual = montoTotalCredito / cuotas;
        System.out.println("Monto total a pagar: " +(int)montoTotalCredito);
        System.out.println("Monto por cada cuota: " +(int)cuotaMensual);
    }
    public static int conocerNumeroEntero(String txt, int limInf, int limSup)
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println(txt+ " [" +limInf+ "-" +limSup+ "]: ");
        int numEntero = teclado.nextInt();
        while(numEntero < limInf || numEntero > limSup)
        {
            System.out.println("El valor ingresado en invalido. Ingrese un valor entre " +limInf+ " y " +limSup);
            System.out.println(txt+ " [" +limInf+ "-" +limSup+ "]: ");
            numEntero = teclado.nextInt();
        }
        return numEntero;
    }
}