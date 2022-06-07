package com.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Text;

public class ZiraatPage extends WebPage {

    @UI("#ZiraatVerileri > div > div > ul > li:nth-child(1) > div > div:nth-child(1) > span")
    private static Text rate;

    public float getRate() {
        return Float.parseFloat(rate.getValue().replace(",", "."));
    }
}
