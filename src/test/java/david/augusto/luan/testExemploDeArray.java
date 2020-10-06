package david.augusto.luan;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;

public class testExemploDeArray {

    @Test
    public void testInverterArray() {
        String[] nomes = new String[]{"beltrano", "fulano", "luan"};
        assertArrayEquals(new String[]{"luan", "fulano", "beltrano"}, ExemplosDeArray.inverterArray(nomes));
    }
}
