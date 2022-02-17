package com.choucairtesting.steps;

import com.choucairtesting.pageObject.EmpleosPageObject;
import com.choucairtesting.utils.Scroll;
import net.thucydides.core.annotations.Step;

public class EmpleosSteps {
    EmpleosPageObject empleosPageObject = new EmpleosPageObject();
    Scroll scroll = new Scroll();

    @Step
    public void clickPortal(){
        empleosPageObject.getDriver().findElement(empleosPageObject.getBtnIrPortal()).click();
    }
    @Step
    public String popUp(){
        String msjPop = empleosPageObject.getDriver().findElement(empleosPageObject.getMsjPopUp()).getText();
                return msjPop;
    }

}
