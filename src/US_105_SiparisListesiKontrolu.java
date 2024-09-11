import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_105_SiparisListesiKontrolu extends BaseDriver {
    @Test
    public void orderListTest(){

        driver.get("https://www.akakce.com/");
        MyFunc.Wait(2);
        String Email="songulcam9396@gmail.com";
        String Password="Elisa.1234";

        WebElement signIn=driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        signIn.click();
        MyFunc.Wait(2);

        WebElement email=driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        email.sendKeys(Email);
        MyFunc.Wait(2);

        WebElement password=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        password.sendKeys(Password);
        MyFunc.Wait(2);

        WebElement signButton=driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
        signButton.click();
        MyFunc.Wait(2);

        WebElement team=driver.findElement(By.xpath("(//a[@href='/akakcem/'])[1]"));
        team.click();
        MyFunc.Wait(2);

        WebElement siparislerim=driver.findElement(By.xpath("(//li[@class='order first'])/a[1]"));
        siparislerim.click();
        MyFunc.Wait(2);

        WebElement siparislerimKontrol=driver.findElement(By.cssSelector("[class='no-record']"));
        Assert.assertTrue("Sipariş bulunuyor",siparislerimKontrol.getText().contains("Kayıtlı siparişiniz bulunmuyor."));

        driver.quit();
    }
}
