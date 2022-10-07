import java.math.BigDecimal;

public class Trabalho {

    private BigDecimal value;
    private BigDecimal value2;

    public Trabalho(BigDecimal value, BigDecimal value2) {
        this.value = value;
        this.value2 = value2;
    }

    public BigDecimal addValue(BigDecimal value, BigDecimal value2) {
        BigDecimal result = value.add(value2);

        return result;
    }

}
