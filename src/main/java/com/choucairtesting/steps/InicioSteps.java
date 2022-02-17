package com.choucairtesting.steps;

import com.choucairtesting.pageObject.InicioPageObject;
import com.choucairtesting.utils.Datos;
import com.choucairtesting.utils.Scroll;
import com.choucairtesting.utils.Solicitud;
import net.thucydides.core.annotations.Step;
import org.apache.bcel.generic.PUSH;

import java.util.List;

public class InicioSteps {
    Scroll scroll = new Scroll();
    InicioPageObject inicioPageObject = new InicioPageObject();
    Datos dataUrls = new Datos();
    List<Solicitud> solicituds = dataUrls.urlChouc();
    @Step
    public void abrirNavegadorBasic(){
        inicioPageObject.openUrl(solicituds.get(0).getUrl());
    }
    @Step
    public String title(){
    String titulo = inicioPageObject.getDriver().findElement(inicioPageObject.getTxtTitle()).getText();
    return titulo;
    }
    @Step
    public void scrollInicio(){
        scroll.scrollAlElemento(inicioPageObject.getDriver(),inicioPageObject.getTxtSubTitle());
    }
    @Step
    public String subTitle(){
        String titulo2 = inicioPageObject.getDriver().findElement(inicioPageObject.getTxtSubTitle()).getText();
        return titulo2;
    }
    @Step
    public String proyect(){
        scroll.scrollAlElemento(inicioPageObject.getDriver(),inicioPageObject.getImgPerson());
        String proyecto = inicioPageObject.getDriver().findElement(inicioPageObject.getSpnProyects()).getText();
        return proyecto;
    }
    @Step
    public String subtitle2(){
        String subTitulo = inicioPageObject.getDriver().findElement(inicioPageObject.getTxtSubTitle2()).getText();
return subTitulo;
    }

    @Step
    public void clickServicios(){
        inicioPageObject.getDriver().findElement(inicioPageObject.getLnkServicios()).click();
    }
    @Step
    public String titleServi(){
        String tituloServicio = inicioPageObject.getDriver().findElement(inicioPageObject.getTxtServicoTitle()).getText();
        return tituloServicio;
    }
    @Step
    public void clickIndustria(){
        inicioPageObject.getDriver().findElement(inicioPageObject.getLnkIndustria()).click();
    }
    @Step
    public String titleIndustr(){
        scroll.scrollAlElemento(inicioPageObject.getDriver(),inicioPageObject.getTxtIndustriTitle());
        String industriaTit = inicioPageObject.getDriver().findElement(inicioPageObject.getTxtIndustriTitle()).getText();
        return industriaTit;

    }
    @Step
    public void clickFormacion(){
        inicioPageObject.getDriver().findElement(inicioPageObject.getLnkFormacion()).click();
    }
    @Step
    public String titleFormacio(){
        String formacion = inicioPageObject.getDriver().findElement(inicioPageObject.getTxtFormacionTitle()).getText();
        return formacion;
    }
   @Step
   public void clickComunidad(){
        inicioPageObject.getDriver().findElement(inicioPageObject.getLnkComunidad()).click();
   }
   @Step
    public String titleComunidad(){
        String comunidad= inicioPageObject.getDriver().findElement(inicioPageObject.getTxtComunidadTitle()).getText();
        return comunidad;
   }
   @Step
    public void clickEmpleos(){
        inicioPageObject.getDriver().findElement(inicioPageObject.getLnkEmpleos()).click();
   }
   @Step
    public String titleEmpleos(){
        String empelos= inicioPageObject.getDriver().findElement(inicioPageObject.getTxtEmpleosTitle()).getText();
        return empelos;
   }
   @Step
    public void clickNosotros(){
        inicioPageObject.getDriver().findElement(inicioPageObject.getLnkNosotros()).click();
   }
   @Step
    public String titleNosotros(){
        String nosotros =inicioPageObject.getDriver().findElement(inicioPageObject.getTxtNosotrosTitle()).getText();
        return nosotros;
   }
   @Step
    public void clickContactenos(){
        inicioPageObject.getDriver().findElement(inicioPageObject.getLnkContactenos()).click();
   }
   @Step
    public String titleContactenos(){
        String contactenos = inicioPageObject.getDriver().findElement(inicioPageObject.getTxtContactenosTitle()).getText();
        return contactenos;
   }
   @Step
    public void cerrarPopUp(){
        inicioPageObject.getDriver().findElement(inicioPageObject.getBtnCerrarPop()).click();
   }
}
