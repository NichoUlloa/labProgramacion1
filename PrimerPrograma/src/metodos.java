import java.util.Scanner;

public class metodos {

    public static int generarNumeroAleatorioEntero(int minimo, int maximo){
        return (int) (Math.random() * maximo + minimo);
    }

    public static void imprimirMatriz(int matriz[][]){
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int conocerNumeroEntero(String txt, int limInf, int limSup) {
        Scanner teclado = new Scanner(System.in);
        System.out.println(txt+ " [" +limInf+ "-" +limSup+ "]: ");
        int numEntero = teclado.nextInt();
        while(numEntero < limInf || numEntero > limSup) {
            System.out.println("El valor ingresado en invalido. Ingrese un valor entre " +limInf+ " y " +limSup);
            System.out.println(txt+ " [" +limInf+ "-" +limSup+ "]: ");
            numEntero = teclado.nextInt();
        }
        return numEntero;
    }



    public static void definirCatergoriaPorCurso(double [][] meMatrizImc){
        String [] categorias = {"Bajo peso ", "Normal ", "Sobrepeso ", "Obesidad "};

        int [] contadorCategorias = new int[meMatrizImc.length];
        for (int i = 0; i < meMatrizImc.length; i++){
            for (int j = 0; j < meMatrizImc[0].length; j++){
                if (meMatrizImc[i][j] < 18.5) contadorCategorias[0]++;
                else if (meMatrizImc[i][j] >= 18.5 && meMatrizImc[i][j] <= 24.9) contadorCategorias[1]++;
                else if (meMatrizImc[i][j] >= 25 && meMatrizImc[i][j] <= 29.9) contadorCategorias[2]++;
                else contadorCategorias[3]++;

            }
        }
        System.out.println("Bajo peso: " + contadorCategorias[0]);
        System.out.println("Normal: " + contadorCategorias[1]);
        System.out.println("Sobrepeso: " + contadorCategorias[2]);
        System.out.println("Obesidad: " + contadorCategorias[3]);
    }

    public static double calcularPromedioMatriz(double [][] matriz) {
        double contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                contador += matriz[i][j];
            }
        }
        double promedio = contador / (matriz.length * matriz[0].length);
        return promedio;

    }

    public static void imprimirArreglo(double[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }

}
