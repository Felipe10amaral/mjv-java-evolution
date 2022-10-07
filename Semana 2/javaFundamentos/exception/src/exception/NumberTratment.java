package javaFundamentos.exception.src.exception;

public class NumberTratment extends Exception{

    public static Integer numberFormat(int number1, int number2) throws Exception{
        if(number1 <= 0) {
            throw new Exception("O primeiro paramentro não pode ser menor ou igual a 0");
        }
        if(number2 > 10) {
            throw new Exception("O primeiro paramentro não pode ser menor ou igual a 10");
        }

        Integer result = 0;

        return result = Math.max(number1, number2) - Math.min(number1, number2);
    }
}
