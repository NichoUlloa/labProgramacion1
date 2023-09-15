import java.text.DecimalFormat;

public class tareaCorregirMetedos {
    public static void main(String [] args) {
        probarMetodos();
    }
    /* En este metodo se sustituye la letra "a" por un vacio "" para que se
       pueda verificar si una frase no contando sus espacios es un polindromo.
       Tambien se cambio el nombre del metodo a uno mas descriptivo.
    */
    public static boolean polindromo(String palabraIngresada) {
        palabraIngresada = palabraIngresada.replace(" ", "");
        StringBuilder stringBuilder = new StringBuilder(palabraIngresada);
        String palabraInvertida = stringBuilder.reverse().toString();
        return palabraIngresada.equalsIgnoreCase(palabraInvertida);
    }

    /* Este metodo principalmente estaba calculando la ponderacion de una nota pero no se iba
       acumulando, sino que se iba sobreescribiendo sobre la anterior, se agrego " + " antes del " = "
       para ir aumentando el valor promedio con las otras ponderaciones y asi obtener el 100%.
       Tambien se cambio el nombre del metodo a uno mas descriptivo.
    */
    public static double calcularPromedioNotas(double [] notas) {
        double [] ponderacionNotas = {0.25, 0.25, 0.25, 0.15, 0.10};
        double promedioNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            promedioNotas += (notas[i] * ponderacionNotas[i]);
        }
        return promedioNotas;
    }

    /* En este metodo solo se cambio su nombre a "determinarGanador" */
    private static String determinarGanador(int [] puntajes) {
        int jugador1 = 20 - puntajes[0];
        int jugador2 = 20 - puntajes[1];

        if((jugador1 < 0 && jugador2 < 0) || jugador1 == jugador2) {
            return "Empate.";
        } else if((jugador1 < 0 || jugador2 < jugador1) && jugador2 >= 0) {
            return "Jugador 2 ganó.";
        } else {
            return "Jugador 1 ganó.";
        }
    }

    /* En este metodo se cambia su respectivo nombre a uno mas descriptivo
       y de igual forma con las variables
    */
    public static int[][] transponerMatriz(int[][] matriz) {
        int[][] matrizTranspuesta = new int[matriz[0].length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        return matrizTranspuesta;
    }

    /* En este metodo se cambia su nombre a uno mas descriptivo, tambien en el
       ciclo for ya no es menor o igual sino que solo menor puesto que de la forma
       anterior el ciclo for iteraria hasta una pocision no existente en la palabra.
       Este metodo verifica si los caracteres del String son solo letras con un true
       y si el String esta en blanco o tiene digitos con un false.
       se movio "(palabraIngresada.isBlank())" antes del ciclo por que sino entregaba true.
    */
    public static boolean contieneSoloLetras(String palabraIngresada) {
        if (palabraIngresada.isBlank()) {
            return false;
        }
        for (int i = 0; i < palabraIngresada.length(); i++) {
            if (Character.isDigit(palabraIngresada.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void probarMetodos() {
        System.out.println();   // polindromo:
        System.out.println(polindromo("oso"));
        System.out.println(polindromo("anita lava la tina"));
        System.out.println(polindromo("hola mundo"));

        System.out.println();   // calcularPromedioNotas
        double [] notas = {6.5, 5.4, 4.3, 3.2, 6.2};
        System.out.println("Promedio: " + formatearNumero(calcularPromedioNotas(notas)));

        System.out.println();   // determinarGanador
        int [] puntajes = {19, 12};
        System.out.println(determinarGanador(puntajes));

        System.out.println();   // transponerMatriz
        int matrizA [][] = new int[3][7];
        System.out.println("Matriz A: ");
        imprimirMatriz(llenarMatriz(matrizA, 1, 20));
        System.out.println("Matriz A transpuesta: ");
        imprimirMatriz(transponerMatriz(matrizA));

        System.out.println();   // contieneSoloLetras
        System.out.println(contieneSoloLetras("hola"));
        System.out.println(contieneSoloLetras("hola123"));
        System.out.println(contieneSoloLetras(""));
    }

    // ---------------------------------------------------------------------------
    public static String formatearNumero(double numero) {
        DecimalFormat decimalFormat = new DecimalFormat("#.0");
        return decimalFormat.format(numero);
    }

    public static int [][] llenarMatriz(int[][] matriz, int minimo, int intervalo) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (minimo + (Math.random() * intervalo));
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(int matriz[][]){
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}