import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Pruebas {

    @Test
    public void pruebaSumar() {
        // Configuración (Arrange)
        Calculadora calculadora = new Calculadora();

        // Ejecución (Act)
        int resultado = calculadora.sumar(3, 5);

        // Verificación (Assert)
        assertEquals(8, resultado);
    }


    @Test
    public void pruebaSumaMatriz() {
        // Configuración (Arrange)
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sumaEsperada = 45;

        // Ejecución (Act)
        int resultado = Calculadora.sumaMatriz(matriz);

        // Verificación (Assert)
        assertEquals(sumaEsperada, resultado);
    }


}
