package com.choucairtesting.stepDefinition;
import com.choucairtesting.steps.ContactenosSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class ContactenosStepDefinition {

    @Steps
    ContactenosSteps contactenosSteps;

    @Cuando("^El usuario llena el formulario$")
    public void el_usuario_llena_el_formulario() {
        contactenosSteps.nombreYApellido();
    contactenosSteps.whatsap();
    contactenosSteps.correo();
    contactenosSteps.ciudad();
    contactenosSteps.empresa();
    contactenosSteps.seleccionarTema();
    contactenosSteps.escribirMsj();
    }

    @Entonces("^envia el formulario$")
    public void acepta_politcas_de_privacidad_y_envia_el_formulario() {
    contactenosSteps.clickEnviar();
    }
}
