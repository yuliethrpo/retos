package com.demoqa.runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registro_informacion.feature",
        glue = "com.demoqa.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class RegistroInformacion {
}
