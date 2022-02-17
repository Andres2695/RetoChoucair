package com.choucairtesting.stepDefinition;
import com.choucairtesting.steps.NosotrosSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;
public class NosotrosStepDefinition {
    @Steps
    NosotrosSteps nosotrosSteps;

    @Cuando("^el usuario da clic en nuestra mision$")
    public void el_usuario_da_clic_en_nuestra_mision() {
    nosotrosSteps.clickMision();
    }


    @Entonces("^se dirigi a la parte de mision de la pagina$")
    public void se_dirigi_a_la_parte_de_mision_de_la_pagina() {
    Assert.assertEquals("Nuestra Misión",nosotrosSteps.tituloMision());
    }
}
