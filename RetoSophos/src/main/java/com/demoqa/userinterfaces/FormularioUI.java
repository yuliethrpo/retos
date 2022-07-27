package com.demoqa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FormularioUI {

    public static final Target BUTTON_FORM= Target.the("Selección botón form").locatedBy("//*[contains(text(),'Forms')]");
    public static final Target BUTTON_PRACTICE_FORM= Target.the("Selección botón Practice form").locatedBy("//*[@class='element-list collapse show']");
//    public static final Target LBL= Target.the("Selección botón Practice form").locatedBy("//*[contains(text(),'Please select an item from left to start practice.')]");

}
