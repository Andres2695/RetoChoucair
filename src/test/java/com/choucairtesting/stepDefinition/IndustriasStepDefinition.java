package com.choucairtesting.stepDefinition;
import com.choucairtesting.steps.IndustriaSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class IndustriasStepDefinition {
@Steps
    IndustriaSteps industriaSteps;

    @Cuando("^selecciona la opcion de telecomunicaciones$")
    public void selecciona_la_opcion_de_telecomunicaciones()throws InterruptedException  {
    industriaSteps.clickTelecomunicaciones();
    }


    @Entonces("^se visualiza el titulo de telecomunicaciones$")
    public void se_visualiza_el_titulo_de_telecomunicaciones() {
    //industriaSteps.scroll();
        Assert.assertEquals("Telecomunicaciones",industriaSteps.titleTelecomunicaciones());
    }
}
