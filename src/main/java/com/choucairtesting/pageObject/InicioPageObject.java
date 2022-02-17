package com.choucairtesting.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
public class InicioPageObject extends PageObject {
    By txtTitle = By.xpath("//body/div[@id='page']/div[1]/div[1]/div[2]/div[1]/h2[1]");
    By btnRow = By.xpath("//body/div[@id='page']/div[1]/div[1]/div[2]/a[1]/i[1]");
    By txtSubTitle = By.xpath("//h2[contains(text(),'NUESTRO BUSINESS CENTRIC TESTING (BCT)')]");
    By imgpic= By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/section[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/img[1]");
    By imgPerson = By.xpath("//body/div[@id='page']/div[@id='content']/div[1]/div[1]/div[1]/div[1]/div[1]/section[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/i[1]");
    By spnProyects = By.xpath("//span[contains(text(),'30.000')]");
    By txtSubTitle2 = By.xpath("//h2[contains(text(),'INDUSTRIAS')]");
    By lnkServicios = By.xpath("//a[contains(text(),'Servicios')]");
    By lnkIndustria = By.xpath("//a[contains(text(),'Industrias')]");
    By lnkFormacion = By.xpath("//a[contains(text(),'Formación')]");
    By lnkComunidad = By.xpath("//a[contains(text(),'Comunidad')]");
    By lnkEmpleos = By.xpath("//a[contains(text(),'Empleos')]");
    By lnkNosotros = By.xpath("//a[contains(text(),'Nosotros')]");
    By lnkContactenos = By.xpath("//a[contains(text(),'Contáctenos')]");
    By txtServicoTitle = By.xpath("//h2[contains(text(),'Portafolio de soluciones de testing centradas en s')]");
    By txtIndustriTitle = By.xpath("//h2[contains(text(),'Banca')]");
    By txtFormacionTitle= By.xpath("//a[contains(text(),'Programación cursos')]");
    By txtComunidadTitle = By.xpath("//h2[contains(text(),'NUESTRO BLOG')]");
    By txtEmpleosTitle = By.xpath("//a[contains(text(),'¿Qué es ser Choucair?')]");
    By txtNosotrosTitle = By.xpath("//a[contains(text(),'Nuestra Misión')]");
    By txtContactenosTitle = By.xpath("//label[contains(text(),'Nombre y Apellidos')]");
    By btnCerrarPop = By.xpath("//a[@id='cookie_action_close_header']");


    public By getTxtTitle() {
        return txtTitle;
    }

    public void setTxtTitle(By txtTitle) {
        this.txtTitle = txtTitle;
    }

    public By getBtnRow() {
        return btnRow;
    }

    public void setBtnRow(By btnRow) {
        this.btnRow = btnRow;
    }

    public By getTxtSubTitle() {
        return txtSubTitle;
    }

    public void setTxtSubTitle(By txtSubTitle) {
        this.txtSubTitle = txtSubTitle;
    }

    public By getSpnProyects() {
        return spnProyects;
    }

    public void setSpnProyects(By spnProyects) {
        this.spnProyects = spnProyects;
    }

    public By getTxtSubTitle2() {
        return txtSubTitle2;
    }

    public void setTxtSubTitle2(By txtSubTitle2) {
        this.txtSubTitle2 = txtSubTitle2;
    }

    public By getLnkServicios() {
        return lnkServicios;
    }

    public void setLnkServicios(By lnkServicios) {
        this.lnkServicios = lnkServicios;
    }

    public By getLnkIndustria() {
        return lnkIndustria;
    }

    public void setLnkIndustria(By lnkIndustria) {
        this.lnkIndustria = lnkIndustria;
    }

    public By getLnkFormacion() {
        return lnkFormacion;
    }

    public void setLnkFormacion(By lnkFormacion) {
        this.lnkFormacion = lnkFormacion;
    }

    public By getLnkComunidad() {
        return lnkComunidad;
    }

    public void setLnkComunidad(By lnkComunidad) {
        this.lnkComunidad = lnkComunidad;
    }

    public By getLnkEmpleos() {
        return lnkEmpleos;
    }

    public void setLnkEmpleos(By lnkEmpleos) {
        this.lnkEmpleos = lnkEmpleos;
    }

    public By getLnkNosotros() {
        return lnkNosotros;
    }

    public void setLnkNosotros(By lnkNosotros) {
        this.lnkNosotros = lnkNosotros;
    }

    public By getLnkContactenos() {
        return lnkContactenos;
    }

    public void setLnkContactenos(By lnkContactenos) {
        this.lnkContactenos = lnkContactenos;
    }

    public By getImgpic() {
        return imgpic;
    }

    public void setImgpic(By imgpic) {
        this.imgpic = imgpic;
    }

    public By getImgPerson() {
        return imgPerson;
    }

    public void setImgPerson(By imgPerson) {
        this.imgPerson = imgPerson;
    }

    public By getTxtServicoTitle() {
        return txtServicoTitle;
    }

    public void setTxtServicoTitle(By txtServicoTitle) {
        this.txtServicoTitle = txtServicoTitle;
    }

    public By getTxtIndustriTitle() {
        return txtIndustriTitle;
    }

    public void setTxtIndustriTitle(By txtIndustriTitle) {
        this.txtIndustriTitle = txtIndustriTitle;
    }

    public By getTxtFormacionTitle() {
        return txtFormacionTitle;
    }

    public void setTxtFormacionTitle(By txtFormacionTitle) {
        this.txtFormacionTitle = txtFormacionTitle;
    }

    public By getTxtComunidadTitle() {
        return txtComunidadTitle;
    }

    public void setTxtComunidadTitle(By txtComunidadTitle) {
        this.txtComunidadTitle = txtComunidadTitle;
    }

    public By getTxtEmpleosTitle() {
        return txtEmpleosTitle;
    }

    public void setTxtEmpleosTitle(By txtEmpleosTitle) {
        this.txtEmpleosTitle = txtEmpleosTitle;
    }

    public By getTxtNosotrosTitle() {
        return txtNosotrosTitle;
    }

    public void setTxtNosotrosTitle(By txtNosotrosTitle) {
        this.txtNosotrosTitle = txtNosotrosTitle;
    }

    public By getTxtContactenosTitle() {
        return txtContactenosTitle;
    }

    public void setTxtContactenosTitle(By txtContactenosTitle) {
        this.txtContactenosTitle = txtContactenosTitle;
    }

    public By getBtnCerrarPop() {
        return btnCerrarPop;
    }

    public void setBtnCerrarPop(By btnCerrarPop) {
        this.btnCerrarPop = btnCerrarPop;
    }
}
