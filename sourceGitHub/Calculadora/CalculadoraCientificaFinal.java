import java.util.Scanner;

public class CalculadoraCientificaFinal {
    public static void main(String[] args) {
        ejecutarCalculadora();
    }

    public static void ejecutarCalculadora() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Calculadora Científica ===");
            System.out.println("1. Operaciones Aritméticas");
            System.out.println("2. Ecuación Cuadrática");
            System.out.println("3. Figuras Geométricas");
            System.out.println("4. Sistema de Ecuaciones Lineales");
            System.out.println("5. Ecuación de la Recta");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = obtenerEntradaInt(scanner);
            switch (opcion) {
                case 1:
                    realizarOperacionesAritmeticas(scanner);
                    break;
                case 2:
                    resolverEcuacionCuadratica(scanner);
                    break;
                case 3:
                    calcularFigurasGeometricas(scanner);
                    break;
                case 4:
                    resolverSistemaEcuaciones(scanner);
                    break;
                case 5:
                    calcularEcuacionRecta(scanner);
                    break;
                case 6:
                    System.out.println("Saliendo de la calculadora.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    public static void realizarOperacionesAritmeticas(Scanner scanner) {
        while (true) {
            System.out.println("Operaciones Aritméticas");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Mayor de 2 números");
            System.out.println("6. Menor de 2 números");
            System.out.println("7. Potencia de un número");
            System.out.println("8. Porcentaje de un número");
            System.out.println("9. Regresar al menu principal");
            System.out.print("Seleccione una operación: ");

            int opcion = obtenerEntradaInt(scanner);
            switch (opcion) {
                case 1:
                    realizarSuma(scanner);
                    break;
                case 2:
                    realizarResta(scanner);
                    break;
                case 3:
                    realizarMultiplicacion(scanner);
                    break;
                case 4:
                    realizarDivision(scanner);
                    break;
                case 5:
                    realizarEncontrarMayorDosNumeros(scanner);
                    break;
                case 6:
                    realizarEncontrarMenorDosNumeros(scanner);
                    break;
                case 7:
                    realizarElevarNumero(scanner);
                    break;
                case 8:
                    calcularPorcentaje(scanner);
                    break;
                case 9:
                    ejecutarCalculadora();
                    break;
                default:
                    System.out.println("Operación no válida. Intente de nuevo.");
            }
        }
    }

    public static double sumarDosNumeros(double numero1, double numero2) {
        return (numero1 + numero2);
    }
    public static void realizarSuma(Scanner scanner) {
        double numero1 = obtenerEntradaDouble(scanner, "Ingrese el primer número: ");
        double numero2 = obtenerEntradaDouble(scanner, "Ingrese el segundo número: ");
        double resultado = sumarDosNumeros(numero1, numero2);
        System.out.println("Resultado: " + resultado);
    }

    public static double restarDosNumeros(double numero1, double numero2) {
        return (numero1 - numero2);
    }
    public static void realizarResta(Scanner scanner) {
        double numero1 = obtenerEntradaDouble(scanner, "Ingrese el primer número: ");
        double numero2 = obtenerEntradaDouble(scanner, "Ingrese el segundo número: ");
        double resultado = restarDosNumeros(numero1, numero2);
        System.out.println("Resultado: " + resultado);
    }

    public static double multiplicarDosNumeros(double numero1, double numero2) {
        return (numero1 * numero2);
    }
    public static void realizarMultiplicacion(Scanner scanner) {
        double numero1 = obtenerEntradaDouble(scanner, "Ingrese el primer número: ");
        double numero2 = obtenerEntradaDouble(scanner, "Ingrese el segundo número: ");
        double resultado = multiplicarDosNumeros(numero1, numero2);
        System.out.println("Resultado: " + resultado);
    }

    public static double dividirDosNumeros(double numero1, double numero2) {
        if (numero2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return (numero1 / numero2);
    }
    public static void realizarDivision(Scanner scanner) {
        try {
            double numero1 = obtenerEntradaDouble(scanner, "Ingrese el primer número: ");
            double numero2 = obtenerEntradaDouble(scanner, "Ingrese el segundo número: ");
            double resultado = dividirDosNumeros(numero1, numero2);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

    public static double encontrarMayorDosNumeros(double numero1, double numero2) {
        return Math.max(numero1, numero2);
    }
    public static void realizarEncontrarMayorDosNumeros(Scanner scanner) {
        double numero1 = obtenerEntradaDouble(scanner, "Ingrese el primer número: ");
        double numero2 = obtenerEntradaDouble(scanner, "Ingrese el segundo número: ");
        double resultado = encontrarMayorDosNumeros(numero1, numero2);
        System.out.println("El mayor es: " + resultado);
    }

    public static double encontrarMenorDosNumeros(double numero1, double numero2) {
        return Math.min(numero1, numero2);
    }
    public static void realizarEncontrarMenorDosNumeros(Scanner scanner) {
        double numero1 = obtenerEntradaDouble(scanner, "Ingrese el primer número: ");
        double numero2 = obtenerEntradaDouble(scanner, "Ingrese el segundo número: ");
        double resultado = encontrarMenorDosNumeros(numero1, numero2);
        System.out.println("El menor es: " + resultado);
    }

    public static void realizarElevarNumero(Scanner scanner) {
        try {
            double base = obtenerEntradaDouble(scanner, "Ingrese la base: ");
            double exponente = obtenerEntradaDouble(scanner, "Ingrese el exponente: ");
            if (base == 0 && exponente == 0) {
                throw new IllegalArgumentException("La base y el exponente no pueden ser ambos cero.");
            }
            double resultado = Math.pow(base, exponente);
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }

    public static double calcularPorcentaje(double numero, double porcentaje) {
        return ((numero * porcentaje) / 100);
    }
    public static void calcularPorcentaje(Scanner scanner) {
        double numero = obtenerEntradaDouble(scanner, "Ingrese el número: ");
        double porcentaje = obtenerEntradaDouble(scanner, "Ingrese el porcentaje: ");
        double resultado = calcularPorcentaje(numero, porcentaje);
        System.out.println(porcentaje + "% de " + numero + " es: " + resultado);
    }

    public static double[] resolverEcuacionCuadratica(double coeficienteA, double coeficienteB, double coeficienteC) {
        double discriminante = Math.pow(coeficienteB, 2) - (4 * coeficienteA * coeficienteC);
        double[] soluciones = new double[2];

        if (discriminante > 0) {
            soluciones[0] = (-coeficienteB + Math.sqrt(discriminante)) / (2 * coeficienteA);
            soluciones[1] = (-coeficienteB - Math.sqrt(discriminante)) / (2 * coeficienteA);
        } else if (discriminante == 0) {
            soluciones[0] = -coeficienteB / (2 * coeficienteA); // multiplicidad 2 o sol. unica
        } else {
            soluciones[0] = Double.NaN;
            soluciones[1] = Double.NaN;
        }
        return soluciones;
    }
    public static void resolverEcuacionCuadratica(Scanner scanner) {
        System.out.println("Ecuación Cuadrática de la forma Ax2 + Bx + C = 0 ");
        double coeficienteA = obtenerEntradaDouble(scanner, "Ingrese el coeficiente A: ");
        double coeficienteB = obtenerEntradaDouble(scanner, "Ingrese el coeficiente B: ");
        double coeficienteC = obtenerEntradaDouble(scanner, "Ingrese el coeficiente C: ");

        double[] soluciones = resolverEcuacionCuadratica(coeficienteA, coeficienteB, coeficienteC);

        if (!Double.isNaN(soluciones[0])) {
            System.out.println("Solución x1: " + soluciones[0]);
        }
        if (!Double.isNaN(soluciones[1])) {
            System.out.println("Solución x2: " + soluciones[1]);
        }
        else {
            System.out.println("El discriminante es negativo, por lo tanto no hay soluciones reales.");
        }
    }

    public static void calcularFigurasGeometricas(Scanner scanner) {
        while (true){
            System.out.println("Figuras Geométricas");
            System.out.println("1. Cuadrado");
            System.out.println("2. Rectángulo");
            System.out.println("3. Círculo");
            System.out.println("4. Esfera");
            System.out.println("5. Cubo");
            System.out.println("6. Cono");
            System.out.println("7. Regresar al menu principal");
            System.out.print("Seleccione una figura: ");

            int opcion = obtenerEntradaInt(scanner);
            switch (opcion) {
                case 1:
                    calcularCuadrado(scanner);
                    break;
                case 2:
                    calcularRectangulo(scanner);
                    break;
                case 3:
                    calcularCirculo(scanner);
                    break;
                case 4:
                    calcularEsfera(scanner);
                    break;
                case 5:
                    calcularCubo(scanner);
                    break;
                case 6:
                    calcularCono(scanner);
                    break;
                case 7:
                    ejecutarCalculadora();
                    break;
                default:
                    System.out.println("Figura no válida. Intente de nuevo.");
            }
        }
    }

    public static double calcularPerimetroCuadrado(double lado) {
        return (4 * lado);
    }
    public static double calcularAreaCuadrado(double lado) {
        return (lado * lado);
    }
    public static void calcularCuadrado(Scanner scanner) {
        System.out.print("Ingrese el lado del cuadrado: ");
        double lado = obtenerEntradaDouble(scanner, "Ingrese el lado del cuadrado: ");
        double perimetro = calcularPerimetroCuadrado(lado);
        double area = calcularAreaCuadrado(lado);
        System.out.println("Perímetro del cuadrado: " + perimetro);
        System.out.println("Área del cuadrado: " + area);
    }

    public static double calcularPerimetroRectangulo(double ancho, double largo) {
        return (2 * ancho) + (2 * largo);
    }

    public static double calcularAreaRectangulo(double ancho, double largo) {
        return (ancho * largo);
    }
    public static void calcularRectangulo(Scanner scanner) {
        double ancho = obtenerEntradaDouble(scanner, "Ingrese el ancho del rectángulo: ");
        double largo = obtenerEntradaDouble(scanner, "Ingrese el largo del rectángulo: ");
        double perimetro = calcularPerimetroRectangulo(ancho, largo);
        double area = calcularAreaRectangulo(ancho, largo);
        System.out.println("Perímetro del rectángulo: " + perimetro);
        System.out.println("Área del rectángulo: " + area);
    }

    public static double calcularPerimetroCirculo(double radio) {
        return (2 * Math.PI * radio);
    }
    public static double calcularAreaCirculo(double radio) {
        return (Math.PI * Math.pow(radio, 2));
    }
    public static void calcularCirculo(Scanner scanner) {
        double radio = obtenerEntradaDouble(scanner, "Ingrese el radio del círculo: ");
        double perimetro = calcularPerimetroCirculo(radio);
        double area = calcularAreaCirculo(radio);
        System.out.println("Perímetro del círculo: " + perimetro);
        System.out.println("Área del círculo: " + area);
    }

    public static double calcularVolumenEsfera(double radio) {
        return ((4.0 / 3.0) * Math.PI * Math.pow(radio, 3));
    }
    public static void calcularEsfera(Scanner scanner) {
        double radio = obtenerEntradaDouble(scanner, "Ingrese el radio de la esfera: ");
        double volumen = calcularVolumenEsfera(radio);
        System.out.println("Volumen de la esfera: " + volumen);
    }

    public static double calcularVolumenCubo(double lado) {
        return (Math.pow(lado, 3));
    }
    public static void calcularCubo(Scanner scanner) {
        double lado = obtenerEntradaDouble(scanner, "Ingrese el lado del cubo: ");
        double volumen = calcularVolumenCubo(lado);
        System.out.println("Volumen del cubo: " + volumen);
    }

    public static double calcularVolumenCono(double radioBase, double altura) {
        return ((1.0 / 3.0) * Math.pow(radioBase, 2) * altura);
    }
    public static void calcularCono(Scanner scanner) {
        double radioBase = obtenerEntradaDouble(scanner, "Ingrese el radio de la base del cono: ");
        double altura = obtenerEntradaDouble(scanner, "Ingrese la altura del cono: ");
        double volumen = calcularVolumenCono(radioBase, altura);
        System.out.println("Volumen del cono: " + volumen);
    }

    public static double[] resolverSistemaEcuaciones(double coeficienteA, double coeficienteB, double coeficienteC,
                                                     double coeficienteD, double coeficienteE, double coeficienteF) {
        double determinante = coeficienteA * coeficienteE - coeficienteB * coeficienteD;
        double[] solucion = new double[2];
        if (determinante != 0) {
            solucion[0] = (coeficienteC * coeficienteE - coeficienteB * coeficienteF) / determinante;
            solucion[1] = (coeficienteA * coeficienteF - coeficienteC * coeficienteD) / determinante;
        } else {
            System.out.println("El sistema no tiene una única solución.");
            solucion[0] = Double.NaN;
            solucion[1] = Double.NaN;
        }
        return solucion;
    }
    public static void resolverSistemaEcuaciones(Scanner scanner) {
        System.out.println("Sistema de Ecuaciones Lineales del tipo [ Ax + By = C ; Dx + Ey = F ]");
        double coeficienteA = obtenerEntradaDouble(scanner, "Ingrese el coeficiente A de la primera ecuación: ");
        double coeficienteB = obtenerEntradaDouble(scanner, "Ingrese el coeficiente B de la primera ecuación: ");
        double resultadoC = obtenerEntradaDouble(scanner, "Ingrese el resultado C de la primera ecuación: ");
        double coeficienteD = obtenerEntradaDouble(scanner, "Ingrese el coeficiente D de la segunda ecuación: ");
        double coeficienteE = obtenerEntradaDouble(scanner, "Ingrese el coeficiente E de la segunda ecuación: ");
        double resultadoF = obtenerEntradaDouble(scanner, "Ingrese el resultado F de la segunda ecuación: ");

        double[] solucion = resolverSistemaEcuaciones(coeficienteA, coeficienteB, resultadoC,
                coeficienteD, coeficienteE, resultadoF);

        if (!Double.isNaN(solucion[0])) {
            System.out.println("Solución x: " + solucion[0]);
        }
        if (!Double.isNaN(solucion[1])) {
            System.out.println("Solución y: " + solucion[1]);
        }
    }

    public static String calcularEcuacionRecta(double x1, double x2, double y1, double y2) {
        double pendiente = (y2 - y1) / (x2 - x1);
        double ordenadaAlOrigen = y1 - pendiente * x1;
        return "Y = " + pendiente + "X + " + ordenadaAlOrigen;
    }
    public static void calcularEcuacionRecta(Scanner scanner) {
        System.out.println("Ecuación de la Recta");
        double x1 = obtenerEntradaDouble(scanner, "Ingrese la coordenada x1: ");
        double x2 = obtenerEntradaDouble(scanner, "Ingrese la coordenada x2: ");
        double y1 = obtenerEntradaDouble(scanner, "Ingrese la coordenada y1: ");
        double y2 = obtenerEntradaDouble(scanner, "Ingrese la coordenada y2: ");

        String ecuacion = calcularEcuacionRecta(x1, x2, y1, y2);
        System.out.println("Ecuación de la recta: " + ecuacion);
    }

    public static int obtenerEntradaInt(Scanner scanner) {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("ocurrio un error: Debes ingresar un número válido.");
                scanner.nextLine();
            }
        }
    }
    public static double obtenerEntradaDouble(Scanner scanner, String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return scanner.nextDouble();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Ocurrio un error: Debes ingresar un número válido.");
                scanner.nextLine();
            }
        }
    }
}