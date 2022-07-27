package com.demoqa.stepdefinitions;

import com.demoqa.models.ModelInfo;
import com.demoqa.tasks.FormularioT;
import com.demoqa.tasks.RegistroInformacionT;
import com.demoqa.utils.GenerateData;
import com.intuit.karate.Main;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.webdriver.WebdriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.time.Duration;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class RegistroInformacionStepDefinitions {


    private ModelInfo data = GenerateData.data();

    @Before
    public void setup() {
        setTheStage(new OnlineCast());
//
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--start-maximized");
//        options.addExtensions(new File("./src/test/resources/extensions/Adblock-Plus---free-ad-blocker.crx"));
//        ChromeDriver driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(16));
    }

    @Given("{string} desea ir a la pagina de {string}")
    public void deseaIrALaPaginaDe(String actorName, String url) {
        theActorCalled(actorName).wasAbleTo(Open.url(url));
    }

    @When("ingrese la informacion de registro")
    public void ingreseLaInformacionDeRegistro() {
        theActorInTheSpotlight().attemptsTo(FormularioT.in(), RegistroInformacionT.in(data));
    }

    @Then("valida que el sistema mueste el siguiente prueba")
    public void validaQueElSistemaMuesteElSiguientePrueba() {

    }
}
