package com.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Step;

import static com.demoblaze.userinterfaces.PaginaUsuarioUI.*;
import static com.demoblaze.utils.Constants.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FormContactTask implements Task {

    @Override
    @Step("ingrese la informacion solicitada")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(EMAIL).into(INPUT_EMAIL),
                Enter.theValue(NOMBRE).into(INPUT_NAME),
                Enter.theValue(MENSAJE).into(TEXTAREA_MESSAGE),
                Click.on(BTN_ENVIAR)
        );

    }

    public static Performable formContactTask () {
        return instrumented(FormContactTask.class);
    }
}
