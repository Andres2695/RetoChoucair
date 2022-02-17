package com.choucairtesting.stepDefinition;
import com.choucairtesting.pageObject.InicioPageObject;
import com.choucairtesting.steps.InicioSteps;
import com.choucairtesting.utils.Scroll;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class InicioStepDefinition {
    @Steps
    InicioPageObject inicioPageObject = new InicioPageObject();
    @Steps
    InicioSteps inicioSteps;
    @Dado("^que el cliente se encuentra en la pagina principal$")
    public void queElClienteSeEncuentraEnLaPaginaPrincipal() {
   inicioSteps.abrirNavegadorBasic();
    }
    @Dado("^cierra el pop up$")
    public void cierra_el_pop_up() {
    inicioSteps.cerrarPopUp();
    }

    @Cuando("^se comprueba el titulo y hace scroll hacia abajo$")
    public void haceScrollHaciaAbajo() {
     inicioSteps.scrollInicio();
     Assert.assertEquals("Pruebas de software centradas en su negocio",inicioSteps.title());


    }

    @Entonces("^Se muestra la informacion correspondiente a la pagina principal$")
    public void seMuestraLaInformacionCorrespondienteALaPaginaPrincipal() {
     Assert.assertEquals("NUESTRO BUSINESS CENTRIC TESTING (BCT)",inicioSteps.subTitle());
    Assert.assertThat(inicioPageObject.getDriver().findElement(inicioPageObject.getImgpic()).isDisplayed(), Matchers.is(true));
    Assert.assertEquals("30.000",inicioSteps.proyect());
    Assert.assertEquals("INDUSTRIAS",inicioSteps.subtitle2());

    }

    @Cuando("^selecciona el link de servicios de la barra de navegacion$")
    public void seleccionaElLinkDeServiciosDeLaBarraDeNavegacion() {
 inicioSteps.clickServicios();
    }

    @Entonces("^Se muestra la informacion correspondiente a servicios$")
    public void seMuestraLaInformacionCorrespondienteAServicios() {
    Assert.assertEquals("Portafolio de soluciones de testing centradas en su negocio",inicioSteps.titleServi());
    }

    @Cuando("^selecciona el link de industrias de la barra de navegacion$")
    public void seleccionaElLinkDeIndustriasDeLaBarraDeNavegacion() {
    inicioSteps.clickIndustria();
    }

    @Entonces("^Se muestra la informacion correspondiente a industrias$")
    public void seMuestraLaInformacionCorrespondienteAIndustrias() {
    Assert.assertEquals("Banca",inicioSteps.titleIndustr());
    }

    @Cuando("^selecciona el link de formacion de la barra de navegacion$")
    public void seleccionaElLinkDeFormacionDeLaBarraDeNavegacion() {
    inicioSteps.clickFormacion();
    }

    @Entonces("^Se muestra la informacion correspondiente a formacion$")
    public void seMuestraLaInformacionCorrespondienteAFormacion() {
    Assert.assertEquals("Programación cursos",inicioSteps.titleFormacio());
    }

    @Cuando("^selecciona el link de comunidad de la barra de navegacion$")
    public void seleccionaElLinkDeComunidadDeLaBarraDeNavegacion() {
    inicioSteps.clickComunidad();
    }

    @Entonces("^Se muestra la informacion correspondiente a comunidad$")
    public void seMuestraLaInformacionCorrespondienteAComunidad() {
    Assert.assertEquals("NUESTRO BLOG",inicioSteps.titleComunidad());
    }

    @Cuando("^selecciona el link de empleos de la barra de navegacion$")
    public void seleccionaElLinkDeEmpleosDeLaBarraDeNavegacion() {
    inicioSteps.clickEmpleos();
    }

    @Entonces("^Se muestra la informacion correspondiente a empleos$")
    public void seMuestraLaInformacionCorrespondienteAEmpleos() {
    Assert.assertEquals("¿Qué es ser Choucair?",inicioSteps.titleEmpleos());
    }

    @Cuando("^selecciona el link de nosotros de la barra de navegacion$")
    public void seleccionaElLinkDeNosotrosDeLaBarraDeNavegacion() {
    inicioSteps.clickNosotros();
    }

    @Entonces("^Se muestra la informacion correspondiente a nosotros$")
    public void seMuestraLaInformacionCorrespondienteANosotros() {
    Assert.assertEquals("Nuestra Misión",inicioSteps.titleNosotros());
    }

    @Cuando("^selecciona el link de contactenos de la barra de navegacion$")
    public void seleccionaElLinkDeContactenosDeLaBarraDeNavegacion() {
    inicioSteps.clickContactenos();
    }

    @Entonces("^Se muestra la informacion correspondiente a contactenos$")
    public void seMuestraLaInformacionCorrespondienteAContactenos() {
    Assert.assertEquals("Nombre y Apellidos",inicioSteps.titleContactenos());
    }

}
