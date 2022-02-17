package com.choucairtesting.steps;

import com.choucairtesting.pageObject.ContactenosPageObject;
import com.choucairtesting.utils.Datos;
import com.choucairtesting.utils.Scroll;
import com.choucairtesting.utils.Formacion;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ContactenosSteps {
    ContactenosPageObject contactenosPageObject = new ContactenosPageObject();
    Scroll scroll = new Scroll();
    Datos dataUrls = new Datos();
    List<Formacion> contactenos = dataUrls.contactenos();


    @Step
    public void scroll(){
     // scroll.scrollAlElemento(contactenosPageObject.getDriver(),contactenosPageObject.getInputNombreYApellido());
    }
    @Step
    public void nombreYApellido(){
        contactenosPageObject.getDriver().findElement(contactenosPageObject.getInputNombreYApellido()).sendKeys(contactenos.get(0).getNombreApellido());
    }
    @Step
    public void whatsap(){
        contactenosPageObject.getDriver().findElement(contactenosPageObject.getInputWhatsap()).sendKeys(contactenos.get(0).getWhatsap());
    }
    @Step
    public void correo(){
        contactenosPageObject.getDriver().findElement(contactenosPageObject.getInputCorreo()).sendKeys(contactenos.get(0).getCorreo());
    }
    @Step
    public void ciudad(){
        contactenosPageObject.getDriver().findElement(contactenosPageObject.getInputCiudad()).sendKeys(contactenos.get(0).getCiudad());
    }
    @Step
    public void empresa(){
        scroll.scrollAlElemento(contactenosPageObject.getDriver(),contactenosPageObject.getInputCiudad());
        contactenosPageObject.getDriver().findElement(contactenosPageObject.getInputEmpresa()).sendKeys(contactenos.get(0).getEmpresa());
    }
    @Step
    public void seleccionarTema(){
        Select dropdown = new Select(contactenosPageObject.getDriver().findElement(contactenosPageObject.getDropTemasDe()));
        dropdown.selectByValue(contactenos.get(0).getTemasDeInteres());
    }
    @Step
    public void escribirMsj(){
        contactenosPageObject.getDriver().findElement(contactenosPageObject.getInputMensaje()).sendKeys(contactenos.get(0).getMensaje());

    }
    @Step
    public void clickEnviar(){
        contactenosPageObject.getDriver().findElement(contactenosPageObject.getBtnEnviar()).click();
    }

}
