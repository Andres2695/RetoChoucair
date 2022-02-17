package com.choucairtesting.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ServiciosPageObject extends PageObject {
    By lnkPruebasMoviles = By.xpath("//a[contains(text(),'Pruebas Móviles')]");
    By txtTitlePruebasMovi = By.xpath("//strong[contains(text(),'Pruebas móviles')]");
    By btnSaber = By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/section[16]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]");
    By txtPruebasmov = By.xpath("//a[contains(text(),'Pruebas Móviles')]");
    By scrollText = By.xpath("//h2[contains(text(),'Portafolio de soluciones de testing centradas en s')]");

    public By getLnkPruebasMoviles() {
        return lnkPruebasMoviles;
    }

    public void setLnkPruebasMoviles(By lnkPruebasMoviles) {
        this.lnkPruebasMoviles = lnkPruebasMoviles;
    }

    public By getTxtTitlePruebasMovi() {
        return txtTitlePruebasMovi;
    }

    public void setTxtTitlePruebasMovi(By txtTitlePruebasMovi) {
        this.txtTitlePruebasMovi = txtTitlePruebasMovi;
    }

    public By getBtnSaber() {
        return btnSaber;
    }

    public void setBtnSaber(By btnSaber) {
        this.btnSaber = btnSaber;
    }

    public By getTxtPruebasmov() {
        return txtPruebasmov;
    }

    public void setTxtPruebasmov(By txtPruebasmov) {
        this.txtPruebasmov = txtPruebasmov;
    }

    public By getScrollText() {
        return scrollText;
    }

    public void setScrollText(By scrollText) {
        this.scrollText = scrollText;
    }
}
