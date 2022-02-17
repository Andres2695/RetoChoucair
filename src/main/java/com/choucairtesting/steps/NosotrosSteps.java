package com.choucairtesting.steps;

import com.choucairtesting.pageObject.NosotrosPageObject;
import net.thucydides.core.annotations.Step;

public class NosotrosSteps {
    NosotrosPageObject nosotrosPageObject = new NosotrosPageObject();

    @Step
    public void clickMision(){
        nosotrosPageObject.getDriver().findElement(nosotrosPageObject.getLnkMision()).click();
    }
    @Step
    public String tituloMision(){
        String mision= nosotrosPageObject.getDriver().findElement(nosotrosPageObject.getTxtTitleMision()).getText();
        return mision;
    }

}
