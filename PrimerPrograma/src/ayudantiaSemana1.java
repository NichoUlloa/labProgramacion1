public class ayudantiaSemana1 {
    public static void main(String [] args){
        imprimirSalidasPrograma();
    }
    public static double [][] llenarMatrizValoresRandom(int filas, int columnas, double minimo, double intervalo){
        double [][] matriz = new double[filas][columnas];
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                matriz[i][j] = minimo + Math.random() * intervalo;
            }
        }
        return matriz;
    }
    public static double [][] calcularImc(double [][] meMatrizPeso, double [][] meMatrizAltura){
        double [][] meMatrizImc = new double[meMatrizPeso.length][meMatrizAltura[0].length];
        for (int i = 0; i < meMatrizPeso.length; i++){
            for (int j = 0; j < meMatrizAltura[0].length; j++){
                double peso = meMatrizPeso[i][j];
                double altura = meMatrizAltura[i][j];
                double imc = peso / (altura * altura);
                meMatrizImc[i][j] = imc;
            }
        }
        return meMatrizImc;
    }
    public static void  calcularImprimirPromedios(String txt, String txt2, double [][] matriz){
        System.out.println(txt);
        double [] promedios = new double[matriz.length];
        for (int i = 0; i < matriz.length; i++){
            double contadorNotas = 0;
            for (int j = 0; j < matriz[0].length; j++){
                contadorNotas += matriz[i][j];
            }
            promedios[i] = contadorNotas / matriz[0].length;
            System.out.println("Curso " + (i+1) + ": " + (float) promedios[i] + txt2);
        }
        System.out.println();
    }
    public static void definirCategoriaPorCurso(double[][] matriz) {
        String[] categorias = {"Bajo peso", "Normal", "Sobrepeso", "Obesidad"};
        int [][] contadorAlumnos = new int[matriz.length][categorias.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] < 18.5) {
                    contadorAlumnos[i][0]++;
                } else if (matriz[i][j] >= 18.5 && matriz[i][j] <= 24.9) {
                    contadorAlumnos[i][1]++;
                } else if (matriz[i][j] >= 25 && matriz[i][j] <= 29.9) {
                    contadorAlumnos[i][2]++;
                } else {
                    contadorAlumnos[i][3]++;
                }
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("Curso " + (i + 1) + ":");
            for (int j = 0; j < categorias.length; j++) {
                System.out.println(categorias[j] + ": " + contadorAlumnos[i][j]);
            }
            System.out.println();
        }
    }
    public static void imprimirSalidasPrograma() {
        double [][] matrizPeso  = llenarMatrizValoresRandom(4, 10, 50, 50); // 50 a 100 Kg
        double [][] matrizAltura= llenarMatrizValoresRandom(4, 10, 1.5, 0.5); // 1.5 a 2 metros
        double [][] matrizImc = calcularImc(matrizPeso, matrizAltura);
        System.out.println();
        System.out.println("== Cantidad de alumnos por categoria de IMC ==");
        definirCategoriaPorCurso(matrizImc);
        System.out.println();
        calcularImprimirPromedios("Promedio Pesos: ", " Kilgromos", matrizPeso);
        calcularImprimirPromedios("Primedio Alturas: ", " Metros", matrizAltura);
    }
}