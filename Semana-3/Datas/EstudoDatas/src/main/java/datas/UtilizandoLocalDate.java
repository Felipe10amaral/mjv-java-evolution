package datas;

import java.time.Duration;
import java.time.LocalDate;

public class UtilizandoLocalDate {

    public UtilizandoLocalDate() {
    }

    private void validarData(LocalDate dataInicio, LocalDate dataFim) {
        if(dataInicio == null || dataFim == null) {
            throw new IllegalArgumentException("As datas não podem ser nulas ");
        }

        if(dataInicio.isAfter(dataFim)){
            throw new IllegalArgumentException("A data inicial não pode ser posterior a final");
        }
    }

    public int subtracaoDias(LocalDate dataInicio, LocalDate dataFim){
        validarData(dataInicio, dataFim);

        int diaDataInicio = dataInicio.getDayOfMonth();
        int mesDataInicio = dataInicio.getMonthValue();
        int anoDataInicio = dataInicio.getYear();

        int diaDataFim = dataFim.getDayOfMonth();
        int mesDataFim = dataFim.getMonthValue();
        int anoDataFim = dataFim.getYear();

        int resultadoAno = anoDataFim - anoDataInicio;
        int resultadoMes = mesDataFim - mesDataInicio;
        int resultadoDia = diaDataFim - diaDataInicio;
        

        return 0;
    }
}
