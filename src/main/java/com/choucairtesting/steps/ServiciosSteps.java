package com.choucairtesting.steps;

import com.choucairtesting.pageObject.ServiciosPageObject;
import com.choucairtesting.utils.Scroll;
import net.thucydides.core.annotations.Step;

public class ServiciosSteps {
    Scroll scroll = new Scroll();
    ServiciosPageObject serviciosPageObject = new ServiciosPageObject();

    @Step
    public void clickPruebasMoviles(){
        scroll.scrollAlElemento(serviciosPageObject.getDriver(),serviciosPageObject.getScrollText());
        serviciosPageObject.getDriver().findElement(serviciosPageObject.getLnkPruebasMoviles()).click();
    }
    @Step
    public String titlePruebasMov(){
        String pruebasMoviles = serviciosPageObject.getDriver().findElement(serviciosPageObject.getTxtTitlePruebasMovi()).getText();
        return pruebasMoviles;
    }
    @Step
    public void clickSaberMas() throws InterruptedException {
        Thread.sleep(Long.parseLong("3000"));
        serviciosPageObject.getDriver().findElement(serviciosPageObject.getBtnSaber()).click();
    }
    @Step
    public String paginaPruebas(){
        String paginaPru= serviciosPageObject.getDriver().findElement(serviciosPageObject.getTxtPruebasmov()).getText();
        return paginaPru;
    }
}
