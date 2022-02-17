package com.choucairtesting.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ComunidadPageObject extends PageObject {
    By txtTitle = By.xpath("//h2[contains(text(),'NUESTRO BLOG')]");
    By imgRetos = By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/article[1]/div[1]/a[1]");

    public By getTxtTitle() {
        return txtTitle;
    }

    public void setTxtTitle(By txtTitle) {
        this.txtTitle = txtTitle;
    }

    public By getImgRetos() {
        return imgRetos;
    }

    public void setImgRetos(By imgRetos) {
        this.imgRetos = imgRetos;
    }


}
