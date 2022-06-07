package com;

import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.pages.P2PTRYUSDT;
import com.pages.P2PUSDTRUB;
import com.pages.TinkoffPage;
import com.pages.ZiraatPage;

import static com.jdiai.tools.Timer.sleep;
import static com.pages.TinkoffPage.getCurrentRate;

public class Site {

    @Url("https://p2p.binance.com/en/trade/Ziraat/USDT?fiat=TRY")
    public static P2PTRYUSDT tryUsdt;

    @Url("https://p2p.binance.com/en/trade/sell/USDT?fiat=RUB&payment=Tinkoff")
    public static P2PUSDTRUB usdtRub;

    @Url("https://www.ziraatbank.com.tr/tr")
    public static ZiraatPage ziraatHomePage;

    @Url("https://www.tinkoff.ru/invest/currencies/USDRUB/")
    public static TinkoffPage tinkoffPage;

    public static void openTinkoffPage() {
        tinkoffPage.open();
    }

    public static float getActualRadeRubUsd() {
        openTinkoffPage();
        return getCurrentRate();
    }

    public static void open() {
        ziraatHomePage.open();
    }

    public static float getActualRateUsdTry() {
        open();
        return ziraatHomePage.getRate();
    }


    public static void openTryUsdt() {
        tryUsdt.open();
        sleep(5000);
        tryUsdt.acceptAllCookieSkipIntro();
    }

    private static void openUsdtRub() {
        usdtRub.open();
        sleep(5000);
        usdtRub.acceptAllCookieSkipIntro();
    }

    public static float getRateTryUsdt() {
        openTryUsdt();
        return tryUsdt.getActualRate(32000);
    }

    public static float getRateUsdtRub() {
        openUsdtRub();
        return usdtRub.getActualRate(100000);
    }

    public static void openZiraatSite() {
        ziraatHomePage.open();
    }
}
