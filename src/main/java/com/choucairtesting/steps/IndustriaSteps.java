package com.choucairtesting.steps;

import com.choucairtesting.pageObject.IndustriaPageObject;
import com.choucairtesting.utils.Scroll;
import net.thucydides.core.annotations.Step;

public class IndustriaSteps {
    IndustriaPageObject industriaPageObject = new IndustriaPageObject();
    Scroll scroll = new Scroll();

    @Step
    public void clickTelecomunicaciones() throws InterruptedException {
        scroll.scrollAlElemento(industriaPageObject.getDriver(),industriaPageObject.getScrollUp());
        industriaPageObject.getDriver().findElement(industriaPageObject.getLnkTelecomunicaciones()).click();
        Thread.sleep(Long.parseLong("3000"));
    }
    public void scroll(){
        scroll.scrollAlElemento(industriaPageObject.getDriver(),industriaPageObject.getTxtScreoll());

    }
    @Step
    public String titleTelecomunicaciones(){
        String telecomu = industriaPageObject.getDriver().findElement(industriaPageObject.getTxtTitleTelecomunicaciones()).getText();
        return telecomu;
    }

}
