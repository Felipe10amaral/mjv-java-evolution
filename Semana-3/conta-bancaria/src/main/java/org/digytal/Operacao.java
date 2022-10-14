package org.digytal;

import java.time.LocalDate;

public class Operacao {
    private Integer codigo;
    private String tipo;
    private Double valor;
    private LocalDate data;

    public Operacao(LocalDate data) {
        this.data = data;
    }

    public Operacao (String tipo, Double valor) {
        data = LocalDate.now(); // pega a hora atual
        this.valor = valor;
        this.tipo = tipo;
        codigo = (int)Math.random() * 100; //gerando valor aleatorio  double com sinal positivo, maior ou igual a 0,0 e menor que 1,0, multiplicamos por 100 para gerar entre 0 e 99 e depois fiz o cast para int
    }

    public Integer getCodigo() {
        return codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getValor() {
        return valor;
    }

    public LocalDate getData() {
        return data;
    }
}
