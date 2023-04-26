package stepDefinitions;

import io.cucumber.java.en.Given;
import utils.BrowserDriver;
import utils.Driver;

public class AmazonBrowserStepDefinitions {
    @Given("Kullanici {string} adresine")
    public void kullanici_adresine(String url) {
        BrowserDriver.getBrowserDriver().get(url);
    }
}
