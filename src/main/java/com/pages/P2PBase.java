package com.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.Text;
import com.epam.jdi.light.ui.html.elements.common.TextField;

import static org.openqa.selenium.Keys.ENTER;

public abstract class P2PBase extends WebPage {
    @UI("body > div.css-vp41bv > div > svg > path")
    private static Button crossOfIntro;

    @UI("#onetrust-policy-text")
    private static Text cookieAlert;

    @UI("#onetrust-accept-btn-handler")
    private static Button acceptCookies;

    @UI("//input[@name='transAmount']")
    private TextField amount;

    @UI("(//div[@class='css-1m1f8hn'])[1]")
    private Text rate;

    private void setAmount(int amount) {
        this.amount.sendKeys(String.valueOf(amount));
        this.amount.sendKeys(ENTER);
    }

    public float getActualRate() {
        return Float.parseFloat(rate.getValue());
    }

    public float getActualRate(int amount) {
        setAmount(amount);
        return Float.parseFloat(rate.getValue());
    }

    public void acceptAllCookieSkipIntro() {
        if(cookieAlert.isDisplayed()) {
            acceptCookies.click();
        }
        if(crossOfIntro.isDisplayed()) {
            crossOfIntro.click();
        }
    }
}
