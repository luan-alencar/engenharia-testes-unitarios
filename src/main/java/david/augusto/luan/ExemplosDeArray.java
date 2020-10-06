package david.augusto.luan;

public class ExemplosDeArray {

    public static String[] inverterArray(String[] nomes) {
        // armazeno o tamanho do array aqui
        int tamanho = nomes.length;
        // criei outro array para armazenar o array do parametro
        // com o mesmo tamanho
        String[] outroArray = new String[tamanho];
        for (int i = 0; i < outroArray.length; i++) {
            tamanho--;
            // aqui eu passo meu antigo array no novo array ja cm seus elementos invertidos
            outroArray[i] = nomes[tamanho];
        }
        // e agr e o finalmente o qual retornara o array ja invertido
        return outroArray;
    }
}
