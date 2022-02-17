package com.choucairtesting.steps;

import com.choucairtesting.pageObject.FomracionPageObject;
import com.choucairtesting.utils.Scroll;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class FormacionSteps {
    FomracionPageObject fomracionPageObject= new FomracionPageObject();
    Scroll scroll = new Scroll();

    @Step
    public void clickPortafolio(){
        scroll.scrollAlElemento(fomracionPageObject.getDriver(),fomracionPageObject.getScrollImg());
        fomracionPageObject.getDriver().findElement(fomracionPageObject.getLnkPortafolio()).click();

    }
    @Step
    public String tituloPOrtafolio(){
        String portafolio = fomracionPageObject.getDriver().findElement(fomracionPageObject.getTxtTitlePortafolio()).getText();
        return portafolio;
    }
    @Step
    public void clickPreguntanos(){
        fomracionPageObject.getDriver().findElement(fomracionPageObject.getLnkPreguntanos()).click();

    }
}
