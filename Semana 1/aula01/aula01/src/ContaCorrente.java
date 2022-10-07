import java.util.Date;
import java.util.List;

public class ContaCorrente {

    private Integer numeroConta;
    private Integer numeroAgencia;
    private String nomeCliente;
    private Date data;
    private Double saldo;

    public void setNumeroConta(Integer numeroConta) {
        if (this.numeroConta == null) {
            this.numeroConta = numeroConta;

        } else {
            System.out.println("Sua conta não pode ser alterada");
        }
    }

    public void setNumeroAgencia(Integer numeroAgencia) {
        this.numeroAgencia = numeroAgencia;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    void transferir(Double valor, ContaCorrente destino) {
    }

    public void sacar(Double saldo) {
        this.saldo -= saldo;
    }

    boolean cancelar(String justificativa) {
        return true;
    }

    Double consultarSaldo() {
        return saldo;
    }

    List consultarExtrato(Date dataInicio, Date dataFinal) {
        return null;
    }

}
