package com.choucairtesting.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class IndustriaPageObject extends PageObject {
    By lnkTelecomunicaciones = By.xpath("//a[contains(text(),'Telecomunicaciones')]");
    By txtScreoll = By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/section[8]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[4]/span[2]");
    By txtTitleTelecomunicaciones = By.xpath("//h2[contains(text(),'Telecomunicaciones')]");
    By scrollUp = By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]");

    public By getLnkTelecomunicaciones() {
        return lnkTelecomunicaciones;
    }

    public void setLnkTelecomunicaciones(By lnkTelecomunicaciones) {
        this.lnkTelecomunicaciones = lnkTelecomunicaciones;
    }

    public By getTxtScreoll() {
        return txtScreoll;
    }

    public void setTxtScreoll(By txtScreoll) {
        this.txtScreoll = txtScreoll;
    }

    public By getTxtTitleTelecomunicaciones() {
        return txtTitleTelecomunicaciones;
    }

    public void setTxtTitleTelecomunicaciones(By txtTitleTelecomunicaciones) {
        this.txtTitleTelecomunicaciones = txtTitleTelecomunicaciones;
    }

    public By getScrollUp() {
        return scrollUp;
    }

    public void setScrollUp(By scrollUp) {
        this.scrollUp = scrollUp;
    }
}
