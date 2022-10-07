package javaFundamentos.exception.src.program;

import javaFundamentos.exception.src.exception.NumberTratment;

public class Application {
    public static void main(String[] args){
        try {
            NumberTratment.numberFormat(-9, 5);

        }catch (Exception e){
            System.out.println(e);
        }

        try {
            NumberTratment.numberFormat(1, 2);
        }
        catch (Exception e) {
            System.out.println(e);
        }

        try {
            NumberTratment.numberFormat(0, 0);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
