public class CalculadoraCientifica {
    public static void main(String[] args) {
    }

    public static double sumarDosNumeros(double numero1, double numero2) {
        return (numero1 + numero2);
    }

    public static double restarDosNumeros(double numero1, double numero2) {
        return (numero1 - numero2);
    }

    public static double multiplicarDosNumeros(double numero1, double numero2) {
        return (numero1 * numero2);
    }

    public static double dividirDosNumeros(double numero1, double numero2) {
        return (numero1 / numero2);
    }

    public static double encontrarMayorDosNumeros(double numero1, double numero2) {
        return Math.max(numero1, numero2);
    }

    public static double encontrarMenorDosNumeros(double numero1, double numero2) {
        return Math.min(numero1 ,numero2);
    }

    public static double elevarNumero(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public static double calcularPorcentaje(double numero, double porcentaje) {
        return ((numero * porcentaje) / 100);
    }

    public static double[] resolverEcuacionCuadratica(double coeficienteA, double coeficienteB, double coeficienteC) {
        double discriminante = Math.pow(coeficienteB,2) - (4 * coeficienteA * coeficienteC);
        double[] soluciones = new double[2];

        if (discriminante > 0) {
            soluciones[0] = (-coeficienteB + Math.sqrt(discriminante)) / (2 * coeficienteA);
            soluciones[1] = (-coeficienteB - Math.sqrt(discriminante)) / (2 * coeficienteA);
        } else if (discriminante == 0) {
            soluciones[0]= coeficienteB / (2 * coeficienteA); // multiplicidad 2
        } else {
            soluciones[0]= Double.NaN;
            soluciones[1]= Double.NaN;
        }
        return soluciones;
    }

    public static double calcularPerimetroCuadrado(double lado) {
        return (4 * lado);
    }

    public static double calcularAreaCuadrado(double lado) {
        return (lado * lado);
    }

    public static double calcularPerimetroRectangulo(double ancho, double largo) {
        return (2 * ancho) + (2 * largo);
    }

    public static double calcularAreaRectangulo(double ancho, double largo) {
        return (ancho * largo);
    }

    public static double calcularPeremitroCirculo(double radio) {
        return (2 * Math.PI * radio);
    }

    public static double calcularAreaCirculo(double radio) {
        return (Math.PI * Math.pow(radio, 2));
    }

    public static double calcularVolumenEsfera(double radio) {
        return ((4.0 / 3.0) * Math.PI * Math.pow(radio, 3));
    }

    public static double calcularVolumenCubo(double lado) {
        return (Math.pow(lado, 3));
    }

    public static double calcularVolumenCono(double radioBase, double altura) {
        return ((1.0 / 3.0) * Math.pow(radioBase, 2) * altura);
    }

    public static double[] resolverSistemaEcuaciones(double coeficienteA, double coeficienteB, double coeficienteC, double coeficienteD, double coeficienteE, double coeficienteF) {
        double determinante = coeficienteA * coeficienteE - coeficienteB * coeficienteD;
        double[] solucion = new double[2];
        if (determinante != 0) {
            solucion[0] = (coeficienteC * coeficienteE - coeficienteB * coeficienteF) / determinante;
            solucion[1] = (coeficienteA * coeficienteF - coeficienteC * coeficienteD) / determinante;
        }
        else {
            System.out.println("El sistema no tiene una única solución.");
        }
        return solucion;
    }

    public static String calcularEcuacionRecta(double x1, double x2, double y1, double y2) {
        double pendiente = (y2 - y1) / (x2 - x1);
        double ordenadaAlOrigen = y1 - pendiente * x1;

        String ecuacion = "Y = " +pendiente+"X + " +ordenadaAlOrigen;

        return ecuacion;
    }
}
