package com.demoblaze.stepdefinitions;


import com.demoblaze.questions.ValidacionTextoAlerta;
import com.demoblaze.tasks.FormContactTask;
import com.demoblaze.tasks.SelectContactTask;
import io.cucumber.java.en.*;

import static com.demoblaze.utils.Constants.VALIDACION_FORMULARIO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.Matchers.containsString;

public class RegistroFormularioStepDefinition {

    @Given("que el usuario seleccione el menu Contacts")
    public void queElUsuarioSeleccioneElMenuContacts() {
        theActorInTheSpotlight().attemptsTo(SelectContactTask.selectContactTask());
    }
    @When("ingrese la informacion solicitada")
    public void ingreseLaInformacionSolicitada() {
        theActorInTheSpotlight().attemptsTo(FormContactTask.formContactTask());
    }
    @Then("el usuario visualizara un mensaje de envio exitoso")
    public void elUsuarioVisualizaraUnMensajeDeEnvioExitoso() {
        theActorInTheSpotlight().should(
                seeThat(ValidacionTextoAlerta.validacionAlerta(), containsString(VALIDACION_FORMULARIO))
        );
    }

}
