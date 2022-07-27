package com.demoqa.tasks;

import com.demoqa.models.ModelInfo;
import com.demoqa.userinterfaces.RegistroInformacionUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import javax.jws.WebParam;
import java.awt.*;
import java.awt.event.InputEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class RegistroInformacionT implements Task {

    private ModelInfo data;
    private RegistroInformacionUI ui = new RegistroInformacionUI();
    Path tempfile = Files.createTempFile("testfile", ".jpg");
    String path = tempfile.toAbsolutePath().toString();

    public RegistroInformacionT(ModelInfo data) throws IOException {
        this.data = data;
    }

    public static RegistroInformacionT in(ModelInfo data) {
        return Tasks.instrumented(RegistroInformacionT.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Enter.theValue(data.getNombre()).into(ui.PRIMERNOMBRE),
                Enter.theValue(data.getApellido()).into(ui.APELLIDO),
                Enter.theValue(data.getCorreo()).into(ui.EMAIL),
                Click.on(ui.GENERO),
                Enter.theValue(data.getNumero()).into(ui.NUMERO),
                Click.on(ui.FECHA),
                SelectFromOptions.byVisibleText(data.getAnio()).from(ui.ANiO),
                SelectFromOptions.byVisibleText(data.getMes()).from(ui.MES),
                Click.on(ui.DIA),
                Enter.theValue(data.getAsignatura()).into(ui.ASIGNATURAS).thenHit(Keys.ENTER),
                Click.on(ui.SPORTS1),
                Click.on(ui.SPORTS2),
                Click.on(ui.SPORTS3),
                SendKeys.of(path).into(ui.ARCHIVO),
                Enter.theValue(data.getDireccion()).into(ui.DIRECCION),
                Click.on(ui.ESTADO),
                Enter.theValue(data.getEstado()).into(ui.ESTADO1).thenHit(Keys.ENTER),
                Click.on(ui.CIUDAD),
                Enter.theValue(data.getCiudad()).into(ui.CIUDAD1).thenHit(Keys.ENTER),
                Click.on(ui.ENVIAR)
        );
    }
}
