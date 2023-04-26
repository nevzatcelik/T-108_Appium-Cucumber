package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import java.security.cert.X509Certificate;
import java.time.Duration;

public class AileButcemPage {
    public AileButcemPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);
    }

    @FindBy(xpath = "//*[@text='E-mail Adresi']")
    public MobileElement mailBox;

    @FindBy(xpath = "//*[@text='Şifre']")
    public MobileElement passwordBox;

    @FindBy(xpath = "//*[@text='Başarıyla giriş yapıldı.']")
    private MobileElement girisBasariliText;

    @FindBy(xpath = "(//*[@class='android.widget.ImageView'])[1]")
    public MobileElement solUstMenu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement isimKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[2]")
    public MobileElement soyisimKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[3]")
    public MobileElement sehirKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[4]")
    public MobileElement yasKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[5]")
    public MobileElement meslekKutusu;

    public void girisBasariliMethodu(){
        String actual=  girisBasariliText.getText();
        String expected="Başarıyla giriş yapıldı.";
        Assert.assertEquals("Giris Basarisiz",expected,actual);

    }
}
