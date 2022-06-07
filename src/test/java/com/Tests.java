package com;

import com.entities.Stock;
import org.testng.annotations.Test;

import static com.Site.*;

public class Tests extends Base{

    @Test
    public void test1() {
        Stock stock = new Stock();
        stock.setUsdTry(getActualRateUsdTry());
        stock.setTryUsdt(getRateTryUsdt());
        stock.setUsdtRub(getRateUsdtRub());
        stock.setRubUsd(getActualRadeRubUsd());
        stock.setProfitUsd(stock.profitUSD());
        stock.setProfitPerc(stock.profitUSDPerc());
    }
}
