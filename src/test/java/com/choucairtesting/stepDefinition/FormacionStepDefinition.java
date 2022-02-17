package com.choucairtesting.stepDefinition;
import com.choucairtesting.steps.FormacionSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class FormacionStepDefinition {
    @Steps
    FormacionSteps formacionSteps;
    @Cuando("^el usuario da click en preguntas$")
    public void el_usuario_da_click_en_preguntas() {
    formacionSteps.clickPreguntanos();
    }


    @Cuando("^da click en portafolio$")
    public void da_click_en_portafolio() {
    formacionSteps.clickPortafolio();
    }

    @Entonces("^se visualiza la apgina de portafolio$")
    public void se_visualiza_la_apgina_de_portafolio() {
        Assert.assertEquals("Portafolio Training Choucair Online",formacionSteps.tituloPOrtafolio());
    }
}
