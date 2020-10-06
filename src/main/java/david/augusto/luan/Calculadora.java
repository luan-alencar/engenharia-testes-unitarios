package david.augusto.luan;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

public class Calculadora {

    // imperativo
    public int calcularComposicaoDeFuncoes() {
        int[] valores = {6, 2, 3, 4, 7};
        AtomicInteger valor = new AtomicInteger();
        Arrays.stream(valores) // utilizei a API stream() -> API q surgiu a partir do Java 8
                // para cada numero q entrar aqui verifica se o resto da div e igual a 0
                .filter(numero -> numero % 2 == 0)
                // se for multiplica ele por 2
                .map(numero -> numero * 2)
                // depois para cada numero desse de um print
                .forEach(numero -> valor.set(numero)); // manipulando e dizendo oq quer q faca
        return valor.get();
    }
}
