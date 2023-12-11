package org.example;

import java.math.BigDecimal;

public class MoneyUtil {

    public static String formatear(double cantDinero, String symbol){


        switch (symbol){
            case "$":
                symbol = "$";
                break;
            case "€":
                symbol = "€";
                break;
            case "£":
                symbol = "£";
                break;
            default:
                symbol = "$";
        }

        if (cantDinero < 0){
            symbol = "-" + symbol;
            cantDinero = cantDinero * (-1);
        }

        /*Hacer que agregue 2 ceros al final*/
        BigDecimal redondear = BigDecimal.valueOf(cantDinero).setScale(2,BigDecimal.ROUND_HALF_UP);


        return symbol + redondear;
    }

}
