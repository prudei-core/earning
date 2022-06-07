package com.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Text;

public class TinkoffPage extends WebPage {
    @UI("(//span[@class='Money-module__money_UZBbh'])[8]")
    private static Text rate;

    public static float getCurrentRate(){
        String ff = rate.getValue();
        String replace = ff.replace("\n,", ".");
        String replace2 = replace.replace(" ₽", "");
        return Float.parseFloat(replace2);
    }

}
