package com.choucairtesting.stepDefinition;
import com.choucairtesting.pageObject.ComunidadPageObject;
import com.choucairtesting.steps.ComunidadSteps;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class ComunidadStepDefinition {
    @Steps
    ComunidadSteps comunidadSteps;
    @Steps
    ComunidadPageObject comunidadPageObject = new ComunidadPageObject();

    @Dado("^que se muestra el titulo correspondiente$")
    public void que_se_muestra_el_titulo_correspondiente() {
        Assert.assertEquals("NUESTRO BLOG",comunidadSteps.tituloComunidad());
    }


    @Entonces("^se comprueba que la foto se este msotrando y se pueda pasar$")
    public void se_comprueba_quye_el_video_se_este_mostrando() {
    Assert.assertThat(comunidadPageObject.getDriver().findElement(comunidadPageObject.getImgRetos()).isDisplayed(), Matchers.is(true));
    }
}
