package com.demoqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroInformacionUI {
    public static final Target PRIMERNOMBRE= Target.the("Selección de campo priemr nombre").located(By.id("firstName"));
    public static final Target APELLIDO= Target.the("Selección de campo apéllido").located(By.id("lastName"));
    public static final Target EMAIL= Target.the("Selección de campo email").located(By.id("userEmail"));
    public static final Target NUMERO= Target.the("Selección de campo numero").located(By.id("userNumber"));
    public static final Target FECHA= Target.the("Selección de campo fecha de nacimiento").located(By.id("dateOfBirthInput"));
    public static final Target ARCHIVO= Target.the("Selección el botón para subir el archivo").located(By.id("uploadPicture"));
    public static final Target DIRECCION= Target.the("Selección el botón para subir el archivo").located(By.id("currentAddress"));
    public static final Target ENVIAR= Target.the("Selección el botón para enviar la informacion").located(By.id("submit"));
    public static final Target GENERO= Target.the("Selección de campo Genero").locatedBy("//*[@class='custom-control custom-radio custom-control-inline'][1]");
    public static final Target ANiO= Target.the("Selección de campo año").locatedBy("//*[@class='react-datepicker__year-select']");
    public static final Target MES= Target.the("Selección de campo mes").locatedBy("//*[@class='react-datepicker__month-select']");
    public static final Target DIA= Target.the("Selección de campo dia").locatedBy("//*[@class='react-datepicker__day react-datepicker__day--020']");
    public static final Target ASIGNATURAS= Target.the("Selección de campo Asignaturas").locatedBy("//*[contains(text(),'Subjects')]//following::input[1]");
    public static final Target SPORTS1= Target.the("Selección de campo Hobbies sport").locatedBy("//*[@class='custom-control custom-checkbox custom-control-inline'][1]");
    public static final Target SPORTS2= Target.the("Selección de campo Hobbies reading").locatedBy("//*[@class='custom-control custom-checkbox custom-control-inline'][2]");
    public static final Target SPORTS3= Target.the("Selección de campo Hobbies music").locatedBy("//*[@class='custom-control custom-checkbox custom-control-inline'][3]");
    public static final Target ESTADO= Target.the("Selección de campo estado").locatedBy("//*[@id=\'state\']/div/div[1]");
    public static final Target ESTADO1= Target.the("Selección de campo estado").locatedBy("//*[@id='react-select-3-input']");
    public static final Target CIUDAD= Target.the("Selección de campo ciudad").locatedBy("//*[@id=\'city\']/div/div[1]");
    public static final Target CIUDAD1= Target.the("Selección de campo ciudad").locatedBy("//*[@id='react-select-4-input']");

}
