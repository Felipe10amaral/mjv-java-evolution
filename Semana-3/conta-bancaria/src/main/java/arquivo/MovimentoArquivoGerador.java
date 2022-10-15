package arquivo;

import org.digytal.Operacao;

import java.io.File;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

public class MovimentoArquivoGerador {

    // classe com finalidade de gerar um arquivo em uma determinada estrutura
    public void gerarArquivoPosicional(List<Operacao> movimentos) {
        String nomeArquivo = String.format("%s_lancamentos.txt", LocalDate.now().toString());
        File arquivo = new File("/home/felipe/Área de Trabalho/arquivo", nomeArquivo);
        System.out.println(arquivo.getAbsoluteFile());
    }

    public static void main(String[] args){
        MovimentoArquivoGerador mg = new MovimentoArquivoGerador();
        mg.gerarArquivoPosicional(null);
    }
}
