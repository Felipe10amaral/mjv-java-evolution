package model;

public class Banco {
    private String codigoBanco;
    private String nomeInstituicao;
    private String isbp;

    public String getCodigoBanco() {
        return codigoBanco;
    }

    public void setCodigoBanco(String codigoBanco) {
        this.codigoBanco = codigoBanco;
    }

    public String getNomeInstituicao() {
        return nomeInstituicao;
    }

    public void setNomeInstituicao(String nomeInstituicao) {
        this.nomeInstituicao = nomeInstituicao;
    }

    public String getIsbp() {
        return isbp;
    }

    public void setIsbp(String isbp) {
        this.isbp = isbp;
    }

    @Override
    public String toString() {
        return "codigoBanco:" + codigoBanco + "\n" +
                "nome da Instituição:" + nomeInstituicao +
                "ISBP: " + isbp;
    }
}
