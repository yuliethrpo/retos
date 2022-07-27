package com.demoqa.tasks;

import com.demoqa.userinterfaces.FormularioUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class FormularioT implements Task {

    public FormularioT() {
    }
    public static FormularioT in(){
        return Tasks.instrumented(FormularioT.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FormularioUI.BUTTON_FORM),
                Click.on(FormularioUI.BUTTON_PRACTICE_FORM)

        );
    }
}
