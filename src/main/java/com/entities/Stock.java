package com.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
        return (float) (2000*getUsdTry()/getTryUsdt()*getUsdtRub()/getRubUsd()*0.996-2000-25);
    }

    public float profitUSDPerc() {
        return profitUSD()/20;
    }

}
