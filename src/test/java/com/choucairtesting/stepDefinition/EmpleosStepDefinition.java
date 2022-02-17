package com.choucairtesting.stepDefinition;
import com.choucairtesting.steps.EmpleosSteps;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class EmpleosStepDefinition {
    @Steps
    EmpleosSteps empleosSteps;

    @Cuando("^el usuario da click en ir al portal de empleos$")
    public void el_usuario_da_click_en_ir_al_portal_de_empleos() {
    empleosSteps.clickPortal();
    }

    @Entonces("^se muesta el pop pup de aviso$")
    public void se_muesta_el_pop_pup_de_aviso() {
        Assert.assertEquals("¡todo en un solo lugar!",empleosSteps.popUp());
    }
}
