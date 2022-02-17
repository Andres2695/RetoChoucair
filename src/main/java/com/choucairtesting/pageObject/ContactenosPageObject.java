package com.choucairtesting.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ContactenosPageObject extends PageObject {
    By inputNombreYApellido = By.xpath("//input[@id='form-field-nombre']");
    By inputWhatsap = By.xpath("//input[@id='form-field-field_fb71456']");
    By inputCorreo = By.xpath("//input[@id='form-field-email']");
    By inputCiudad = By.xpath("//input[@id='form-field-field_c3f91b8']");
    By inputEmpresa = By.xpath("//input[@id='form-field-empresa']");
    By dropTemasDe = By.xpath("//select[@id='form-field-Tipodeservicio']");
    By inputMensaje =By.xpath("//textarea[@id='form-field-message']");
    By btnEnviar = By.xpath("//body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[8]/button[1]/span[1]");



    public By getInputNombreYApellido() {
        return inputNombreYApellido;
    }

    public void setInputNombreYApellido(By inputNombreYApellido) {
        this.inputNombreYApellido = inputNombreYApellido;
    }

    public By getInputWhatsap() {
        return inputWhatsap;
    }

    public void setInputWhatsap(By inputWhatsap) {
        this.inputWhatsap = inputWhatsap;
    }

    public By getInputCorreo() {
        return inputCorreo;
    }

    public void setInputCorreo(By inputCorreo) {
        this.inputCorreo = inputCorreo;
    }

    public By getInputCiudad() {
        return inputCiudad;
    }

    public void setInputCiudad(By inputCiudad) {
        this.inputCiudad = inputCiudad;
    }

    public By getInputEmpresa() {
        return inputEmpresa;
    }

    public void setInputEmpresa(By inputEmpresa) {
        this.inputEmpresa = inputEmpresa;
    }

    public By getDropTemasDe() {
        return dropTemasDe;
    }

    public void setDropTemasDe(By dropTemasDe) {
        this.dropTemasDe = dropTemasDe;
    }

    public By getInputMensaje() {
        return inputMensaje;
    }

    public void setInputMensaje(By inputMensaje) {
        this.inputMensaje = inputMensaje;
    }

    public By getBtnEnviar() {
        return btnEnviar;
    }

    public void setBtnEnviar(By btnEnviar) {
        this.btnEnviar = btnEnviar;
    }
}
