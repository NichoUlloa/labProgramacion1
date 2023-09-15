import java.text.DecimalFormat;
import java.util.Scanner;

public class Tiempo {
    public static void main(String[] args) {
        Menu();
    }

    public static double generarNumeroRandom(double minimo, double intervalo) {
        return (minimo + (Math.random() * intervalo));
    }
    public static void llenarMatriz(double[][] matriz, double minimo, double intervalo) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = generarNumeroRandom(minimo, intervalo);
            }
        }
    }

    public static double[] calcularPromedioPorFilaMatriz(double[][] matriz) {
        double promedios[] = new double[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            double contador = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                contador += matriz[i][j];
            }
            promedios[i] = contador / matriz[0].length;
        }
        return promedios;
    }

    public static double calcularPromedioMatriz ( double[][] matriz) {
        double contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                contador += matriz[i][j];
            }
        }
        double promedio = contador / (matriz.length * matriz[0].length);
        return promedio;
    }

    public static double [] diaMasCaluroso(double[] arreglo) {  // segun promedio temperaturas por dia
        double temperaturaDiaMasCalor = Integer.MIN_VALUE;
        int diaMasCalor = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (temperaturaDiaMasCalor < arreglo[i]) {
                temperaturaDiaMasCalor = arreglo[i];
                diaMasCalor = i + 1;
            }
        }
        return new double[]{temperaturaDiaMasCalor, diaMasCalor};
    }

    public static double [] diaMenosCaluroso(double[] arreglo) {
        double temperaturaDiaMenosCalor = Integer.MAX_VALUE;
        int diaMasCalor = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (temperaturaDiaMenosCalor > arreglo[i]) {
                temperaturaDiaMenosCalor = arreglo[i];
                diaMasCalor = i + 1;
            }
        }
        return new double[]{temperaturaDiaMenosCalor, diaMasCalor};
    }

    public static double [] informacionDiaTemperaturaMasAlta(double[][] matriz) {
        double temperaturaMasAlta = Double.MIN_VALUE;
        int dia = 0;
        int hora = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (temperaturaMasAlta < matriz[i][j]) {
                    temperaturaMasAlta = matriz[i][j];
                    dia = i + 1;
                    hora = j + 1;
                }
            }
        }
        return new double[]{temperaturaMasAlta, dia, hora};
    }

    public static double [] informacionDiaTemperaturaMasBaja(double[][] matriz) {
        double temperaturaMasBaja = Double.MAX_VALUE;
        int dia = 0;
        int hora = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (temperaturaMasBaja > matriz[i][j]) {
                    temperaturaMasBaja = matriz[i][j];
                    dia = i + 1;
                    hora = j + 1;
                }
            }
        }
        return new double[]{temperaturaMasBaja, dia, hora};
    }

    public static void imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0 ; j < matriz[0].length; j++) {
                System.out.print(formatearNumero(matriz[i][j]) + "\t");
            }
            System.out.println();
        }
    }

    public static String formatearNumero(double numero) {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        return decimalFormat.format(numero);
    }

    public static void Menu() {
        Scanner teclado = new Scanner(System.in);

        double[][] temperaturas = new double[7][24];
        llenarMatriz(temperaturas,5,25);
        System.out.println("Estas son las temperaturas para la semana: ");
        imprimirMatriz(temperaturas);
        double[] diaMasCaluroso = diaMasCaluroso(calcularPromedioPorFilaMatriz(temperaturas));
        double[] diaMenosCaluroso = diaMenosCaluroso(calcularPromedioPorFilaMatriz(temperaturas));
        double[] infoDiaTemperaturaMasAlta = informacionDiaTemperaturaMasAlta(temperaturas);
        double[] infoDiaTemperaturaMasBaja = informacionDiaTemperaturaMasBaja(temperaturas);

        int respuesta;
        do {
            System.out.println();
            System.out.println("Menu: ");
            System.out.println("1. Mostrar dia mas caluroso");
            System.out.println("2. Mostrar dia menos caluroso");
            System.out.println("3. Mostrar informacion de la temperatura mas alta de la semana");
            System.out.println("4. Mostrar informacion de la temperatura mas baja de la semana");
            System.out.println("5. Mostrar temperatura promedio para la semana");
            System.out.println("9. Salir del menu");
            System.out.print("Seleccione una de las opciones anteriores: ");

            respuesta = teclado.nextInt();
            switch (respuesta) {
                case 1:
                    System.out.println(" ==> El dia " + (int) diaMasCaluroso[1] + " es el mas caluroso, con una media de " + formatearNumero(diaMasCaluroso[0]) + "°C");
                    break;
                case 2:
                    System.out.println(" ==> El dia " + (int) diaMenosCaluroso[1] + " es el menos caluroso, con una media de " + formatearNumero(diaMenosCaluroso[0]) + "°C");
                    break;
                case 3:
                    System.out.println(" ==> El dia " + (int) infoDiaTemperaturaMasAlta[1] + " a las " + (int) infoDiaTemperaturaMasAlta[2] + " horas es la mayor temperatura, con " + formatearNumero(infoDiaTemperaturaMasAlta[0]) + "°C");
                    break;
                case 4:
                    System.out.println(" ==> El dia " + (int) infoDiaTemperaturaMasBaja[1] + " a las " + (int) infoDiaTemperaturaMasBaja[2] + " horas es la menor temperatura, con " + formatearNumero(infoDiaTemperaturaMasBaja[0]) + "°C");
                    break;
                case 5:
                    System.out.println(" ==> La temperatura promedio para la semana es de " + formatearNumero(calcularPromedioMatriz(temperaturas)) + "°C");
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opcion no valida, introduzca una de las opciones anteriores. ");
                    break;
            }
        } while (respuesta != 9);
    }
}