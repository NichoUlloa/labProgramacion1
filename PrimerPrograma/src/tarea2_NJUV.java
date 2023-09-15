public class tarea2_NJUV {
    public static void main(String[] args) {

        int  matriz [][] = generarMatriz(3, 3);
        imprimirMatriz(matriz);
        verificarCuadradoMagico(matriz);
    }
    public static int [][] generarMatriz(int filas, int columnas) {
        int matriz [][] = new int [filas][columnas];
        int numerosDisponibles [] = new int[filas * columnas];
        for(int i = 0; i < (filas * columnas); i++) {
            numerosDisponibles[i] = i + 1;
        }
        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                int posicionAleatoria = (int) (Math.random() * (filas * columnas));
                while(numerosDisponibles[posicionAleatoria] == 0){
                    posicionAleatoria = (int) (Math.random() * (filas * columnas));
                }
                matriz[i][j] = numerosDisponibles[posicionAleatoria];
                numerosDisponibles[posicionAleatoria] = 0;
            }
        }
        return matriz;
    }
    public static void verificarCuadradoMagico(int matriz[][]) {
        int n = matriz.length;
        int sumaTotal = n * (n * n +1) / 2;
        boolean CuadradoMagico = true;

        //verificar filas y columnas
        for(int i = 0; i < n; i++) {
            int sumaFila = 0;
            for(int j = 0; j < n; j++) {
                sumaFila += matriz[i][j];
            }
            if(sumaFila != sumaTotal) {
                CuadradoMagico = false;
            }
        }

        for(int j = 0; j < n; j++) {
            int sumaColumna = 0;
            for(int i = 0; i < n; i++) {
                sumaColumna += matriz[i][j];
            }
            if(sumaColumna != sumaTotal) {
                CuadradoMagico = false;
            }
        }

        // verificar diagonal principal y secundaria
        int sumaDiagonalPrincipal = 0;
        for(int i = 0; i < n; i++) {
            sumaDiagonalPrincipal += matriz[i][i];
        }

        int sumaDiagonalSecundaria = 0;
        for(int i = 0; i < n; i++) {
            sumaDiagonalSecundaria += matriz[i][n - 1 - i];
        }
        if(sumaDiagonalPrincipal != sumaTotal || sumaDiagonalSecundaria != sumaTotal) {
            CuadradoMagico = false;
        }

        if(CuadradoMagico) {
            System.out.println("Cuadrado magico");
        }
        else {
            System.out.println("Cuadrado no magico, no se cumple las necesarias sumas iguales a " +sumaTotal);
        }
    }
    public static void imprimirMatriz(int matriz[][]) {
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}