package com.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Stock {
    private float usdTry;
    private float tryUsdt;
    private float usdtRub;
    private float rubUsd;
    private float profitUsd;
    private float profitPerc;

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
