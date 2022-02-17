package com.choucairtesting.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class NosotrosPageObject extends PageObject {
    By lnkMision = By.xpath("//a[contains(text(),'Nuestra Misión')]");
    By txtTitleMision = By.xpath("//h2[contains(text(),'Nuestra Misión')]");

    public By getLnkMision() {
        return lnkMision;
    }

    public void setLnkMision(By lnkMision) {
        this.lnkMision = lnkMision;
    }

    public By getTxtTitleMision() {
        return txtTitleMision;
    }

    public void setTxtTitleMision(By txtTitleMision) {
        this.txtTitleMision = txtTitleMision;
    }
}
