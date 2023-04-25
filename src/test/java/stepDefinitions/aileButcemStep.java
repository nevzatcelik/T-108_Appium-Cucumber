package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class aileButcemStep {
   AndroidDriver<AndroidElement> driver=Driver.getAndroidDriver();
   TouchAction action=new TouchAction<>(driver);
    @Given("Kullanici kurulumlari tamamlar")
    public void kullanici_kurulumlari_tamamlar() {
        Driver.getAndroidDriver();
    }

    @Then("ilk ekran ayarlarini yapar ve {string} a tiklayin ve ardindan login sayfasina ulasin")
    public void ilkEkranAyarlariniYaparVeATiklayinVeArdindanLoginSayfasinaUlasin(String girisyap) {
        ReusableMethods.wait(2);
        for (int i=0;i<6; i++){
            action.press(PointOption.point(924,933))
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500))).
                    moveTo(PointOption.point(125,933)).release().perform();
        }
        ReusableMethods.scrollWithUiScrollable(girisyap);
    }
    @Then("mail ve password bilgilerini girerek kullanici bilgileriyle giris yapin")
    public void mail_ve_password_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin() {

    }
    @Then("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin() {

    }
    @Then("sol kisimdaki menuden hesabim bolumune gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin() {

    }
    @Then("hesabim sayfasindaki bilgileri degistirerek degisikleri kaydedin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin() {

    }
    @Then("ardindan degisiklerin yapildigini dogrulayin")
    public void ardindan_degisiklerin_yapildigini_dogrulayin() {

    }


}
