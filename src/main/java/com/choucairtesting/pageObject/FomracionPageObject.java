package com.choucairtesting.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class FomracionPageObject extends PageObject {
    By lnkPortafolio = By.xpath("//a[contains(text(),'Portafolio')]");
    By scrollImg = By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/section[2]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/figure[1]/a[1]/img[1]");
    By txtTitlePortafolio = By.xpath("//h1[contains(text(),'Portafolio Training Choucair Online')]");
    By lnkPreguntanos= By.xpath("//a[contains(text(),'Pregúntanos')]");

    public By getLnkPortafolio() {
        return lnkPortafolio;
    }

    public void setLnkPortafolio(By lnkPortafolio) {
        this.lnkPortafolio = lnkPortafolio;
    }

    public By getTxtTitlePortafolio() {
        return txtTitlePortafolio;
    }

    public void setTxtTitlePortafolio(By txtTitlePortafolio) {
        this.txtTitlePortafolio = txtTitlePortafolio;
    }

    public By getLnkPreguntanos() {
        return lnkPreguntanos;
    }

    public void setLnkPreguntanos(By lnkPreguntanos) {
        this.lnkPreguntanos = lnkPreguntanos;
    }

    public By getScrollImg() {
        return scrollImg;
    }

    public void setScrollImg(By scrollImg) {
        this.scrollImg = scrollImg;
    }
}
