package com.choucairtesting.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class EmpleosPageObject extends PageObject {
    By lnkQueEsChou = By.xpath("//a[contains(text(),'¿Qué es ser Choucair?')]");
    By scrollUp = By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/section[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/span[1]/span[1]");
    By txtTituloChou = By.xpath("//h2[contains(text(),'SER CHOUCAIR')]");
    By scrollImg = By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]");
    By lnkPrepara = By.xpath("//a[contains(text(),'Prepararse para aplicar')]");
    By txtTitlePrepara = By.xpath("//h2[contains(text(),'PREPARARSE PARA APLICAR')]");
    By btnIrPortal = By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/section[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]");
    By msjPopUp = By.xpath("//strong[contains(text(),'¡todo en un solo lugar!')]");
    public By getLnkQueEsChou() {
        return lnkQueEsChou;
    }

    public void setLnkQueEsChou(By lnkQueEsChou) {
        this.lnkQueEsChou = lnkQueEsChou;
    }

    public By getScrollUp() {
        return scrollUp;
    }

    public void setScrollUp(By scrollUp) {
        this.scrollUp = scrollUp;
    }

    public By getTxtTituloChou() {
        return txtTituloChou;
    }

    public void setTxtTituloChou(By txtTituloChou) {
        this.txtTituloChou = txtTituloChou;
    }

    public By getScrollImg() {
        return scrollImg;
    }

    public void setScrollImg(By scrollImg) {
        this.scrollImg = scrollImg;
    }

    public By getLnkPrepara() {
        return lnkPrepara;
    }

    public void setLnkPrepara(By lnkPrepara) {
        this.lnkPrepara = lnkPrepara;
    }

    public By getTxtTitlePrepara() {
        return txtTitlePrepara;
    }

    public void setTxtTitlePrepara(By txtTitlePrepara) {
        this.txtTitlePrepara = txtTitlePrepara;
    }

    public By getBtnIrPortal() {
        return btnIrPortal;
    }

    public void setBtnIrPortal(By btnIrPortal) {
        this.btnIrPortal = btnIrPortal;
    }

    public By getMsjPopUp() {
        return msjPopUp;
    }

    public void setMsjPopUp(By msjPopUp) {
        this.msjPopUp = msjPopUp;
    }
}
