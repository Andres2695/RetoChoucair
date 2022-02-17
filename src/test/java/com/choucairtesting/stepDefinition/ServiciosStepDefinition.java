package com.choucairtesting.stepDefinition;
import com.choucairtesting.steps.ServiciosSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class ServiciosStepDefinition {
    @Steps
ServiciosSteps serviciosSteps;

    @Dado("^que el cliente selecciona pruebas moviles$")
    public void que_el_cliente_selecciona_pruebas_moviles() {
    serviciosSteps.clickPruebasMoviles();
    }


    @Cuando("^se visualiza el texto correspondiente del pruebas moviles$")
    public void se_visualiza_el_texto_correspondiente_del_pruebas_moviles() {
        Assert.assertEquals("Pruebas móviles",serviciosSteps.titlePruebasMov());
    }

    @Cuando("^oprime el boton saber mas$")
    public void oprime_el_boton_saber_mas()throws InterruptedException  {
    serviciosSteps.clickSaberMas();
    }

    @Entonces("^se redirecciona a la pagina de pruebas moviles$")
    public void se_redirecciona_a_la_pagina_de_pruebas_moviles() {
    Assert.assertEquals("Pruebas Móviles",serviciosSteps.paginaPruebas());
    }

}
