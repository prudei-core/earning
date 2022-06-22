package com;

import com.entities.Stock;
import org.testng.annotations.Test;

import static com.Site.*;

public class Tests extends Base{
    @Test
    public void test1() {
        Stock stock = new Stock().set(e -> {
            e.usdTry = getActualRateUsdTry();
            e.tryUsdt = getRateTryUsdt();
            e.usdtRub = getRateUsdtRub();
            e.rubUsd = getActualRadeRubUsd();
            e.profitUsd = e.profitUSD();
            e.profitPerc = e.profitUSDPerc();
        });
        System.out.println(stock.toString());
    }
}
