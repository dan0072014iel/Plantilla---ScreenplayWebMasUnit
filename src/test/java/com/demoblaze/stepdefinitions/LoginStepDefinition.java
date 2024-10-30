package com.demoblaze.stepdefinitions;


import com.demoblaze.exceptions.ResultadoNoEsperado;
import com.demoblaze.questions.ValidacionLogin;
import io.cucumber.java.en.*;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class LoginStepDefinition {

    @Then("el visualizara un mensaje de login exitoso")
    public void elVisualizaraUnMensajeDeLoginExitoso() {
        theActorInTheSpotlight().should(seeThat("Verificación del login exitoso", ValidacionLogin.validarLogin(),
                Matchers.equalTo(true)).orComplainWith(ResultadoNoEsperado.class,ResultadoNoEsperado.INICIO_SESION_FALLO));

    }
}