package stepDefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.BrowserPage.MealCenterPage;
import utils.BrowserDriver;
import utils.ReusableMethods;

public class MealCenterStepDefinitions {
    MealCenterPage meal=new MealCenterPage();

    @Given("Kullanici browseri acar adresine")
    public void kullanici_browseri_acar_adresine() {
        BrowserDriver.getBrowserDriver();
    }
    @Given("Kullanici {string} adresine")
    public void kullanici_adresine(String url) {

        ReusableMethods.wait(5);
        BrowserDriver.getBrowserDriver().get(url);
    }
    @Given("Uc cizgi butonuna tiklar")
    public void uc_cizgi_butonuna_tiklar() {

         meal.ucCizgiButon.click();
    }
    @Given("Sign in butonun gorulebilir oldugunu dogrular")
    public void sign_in_butonun_gorulebilir_oldugunu_dogrular() {

        Assert.assertTrue(meal.signInButton.isDisplayed());
    }
    @Given("Kullanici header kisminda bulunan logonun gorulebilir oldugunu dogrular")
    public void kullanici_header_kisminda_bulunan_logonun_gorulebilir_oldugunu_dogrular() {

     Assert.assertTrue(meal.headerLogo.isDisplayed());
    }

    @Given("Kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        BrowserDriver.quitAppiumDriver();
    }
}
