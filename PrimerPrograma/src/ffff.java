import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PruebaCalculadora {

    @Test
    public void pruebaSumar() {
        // Configuración (Arrange)
        Calculadora calculadora = new Calculadora();

        // Ejecución (Act)
        int resultado = calculadora.sumar(3, 5);

        // Verificación (Assert)
        assertEquals(8, resultado);
    }
}
