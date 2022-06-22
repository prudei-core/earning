package com.entities;

import com.jdiai.tools.DataClass;
import lombok.Getter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
public class Stock extends DataClass<Stock> {
    public float usdTry;
    public float tryUsdt;
    public float usdtRub;
    public float rubUsd;
    public float profitUsd;
    public float profitPerc;

    public float profitUSD() {
        return (float) (2000 * getUsdTry() / getTryUsdt() * getUsdtRub() / getRubUsd() * 0.996 - 2000 - 25);
    }


    public float profitUSDPerc() {
        return profitUSD() / 20;
    }

    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return String.format("Actual time: %s\n" +
                "Rate USD  ->  TRY = %f\n" +
                "Rate TRY  -> USDT = %f\n" +
                "Rate USDT ->  RUB = %f\n" +
                "Rate RUB  ->  USD = %f\n" +
                "Profit in USD = %f\n" +
                "Profit in percentages = %f %s", dtf.format(now), usdTry, tryUsdt, usdtRub, rubUsd, profitUsd, profitPerc, "%");
    }

}
