package arquivo;

import org.digytal.Cliente;
import org.digytal.ContaCorrente;
import org.digytal.Operacao;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.List;

public class MovimentoArquivoGerador {

    // classe com finalidade de gerar um arquivo em uma determinada estrutura

    public void gerarArquivoPosicional(ContaCorrente conta) { //Precisamos iterar de fato em todos os movimentos de uma lista
        /*
         a cada iteração preciso gerar uma linha com as informações
         a melhor estrategia para criar essa concatenação de string é o StringBuilder, ela vai da um append em conteudo que estiver dentro de uma iteração do for */

        List<Operacao> movimentos = conta.consultarExtrato(LocalDate.now(), LocalDate.now());
        Cliente cliente = conta.getCliente();
        StringBuilder sb = new StringBuilder();

        //abreviação sofisticado do ForEach
        for(Operacao mov: movimentos){
            String data = mov.getData().toString().substring(0,10).replaceAll("\\-", "");
            String cpf = cliente.getCpf().replaceAll("[\\.\\-]", "");
            if(cpf.length() < 14){
                cpf = "000".concat(cpf);
            }
            int min = Math.min(30, cliente.getNome().length());
            String nome = cliente.getNome().substring(0,min);

            Double valorAbsoluto = Math.abs(mov.getValor());
            String valorFormatado = String.format("%010d", Math.round(valorAbsoluto * 100));
            //String valor = String.format("%010d", valorFormatado); //coloca numeros 0 a esquerda e formata para que haja apenas 10 dígitos

            String tm = mov.getTipo();
            String estornado = false ? "1" :"0";

            sb.append(data.concat(cpf).concat(nome).concat(valorFormatado).concat(tm).concat(estornado).concat("\n"));
        }

        String nomeArquivo = String.format("%s_lancamentos.txt", LocalDate.now().toString());
        File arquivo = new File("/home/felipe/Área de Trabalho/arquivo", nomeArquivo);

        Path path = arquivo.toPath();

        try {
            Files.write(path, sb.toString().getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
