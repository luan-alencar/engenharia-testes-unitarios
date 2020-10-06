package david.augusto.luan;

import org.junit.Test;

import static org.junit.Assert.*;

public class testCalculadora {

    @Test
    public void testCalcularComposicao() {
        Calculadora c = new Calculadora();
        assertTrue(c.calcularComposicaoDeFuncoes() == 8);
    }
}
