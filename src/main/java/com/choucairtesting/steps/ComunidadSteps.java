package com.choucairtesting.steps;

import com.choucairtesting.pageObject.ComunidadPageObject;
import com.choucairtesting.utils.Scroll;
import net.thucydides.core.annotations.Step;

public class ComunidadSteps {
    ComunidadPageObject comunidadPageObject = new ComunidadPageObject();

    @Step
    public String tituloComunidad(){
        String comunidad = comunidadPageObject.getDriver().findElement(comunidadPageObject.getTxtTitle()).getText();
        Scroll scroll = new Scroll();
        scroll.scrollAlElemento(comunidadPageObject.getDriver(),comunidadPageObject.getTxtTitle());
        return comunidad;
    }

}
