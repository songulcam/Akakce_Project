import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_102 extends BaseDriver {

    @Test
    public void TestAccountCheck(){

        driver.get("https://www.akakce.com/");
        MyFunc.Wait(2);

        WebElement clickLogin=driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        clickLogin.click();
        MyFunc.Wait(2);

        String username="kayaamervee01@gmail.com";
        WebElement e_mail=driver.findElement(By.xpath("(//input[@type='email' ])[2]"));
        e_mail.sendKeys(username);
        MyFunc.Wait(2);

        String password="merve94KAYA";
        WebElement writePassword=driver.findElement(By.xpath("(//input[@type='password' ])[1]"));
        writePassword.sendKeys(password);
        MyFunc.Wait(2);

        WebElement clickLogin1=driver.findElement(By.xpath("(//input[@value='Giriş yap' ])[1]"));
        clickLogin1.click();
        MyFunc.Wait(2);

        WebElement clickAccount=driver.findElement(By.xpath("(//a[@rel='nofollow' ])[1]"));
        clickAccount.click();
        MyFunc.Wait(2);

        WebElement helloText=driver.findElement(By.cssSelector("span[class='welcome_user'] b"));
        System.out.println("First Text :" +helloText.getText());

        String text="";
        text=helloText.getText().replaceAll("Merhaba!","");
        System.out.println("Username :" +text);

        String kullaniciAdi="Tester Automation";
        Assert.assertTrue("Kullanıcı adı eşleşmedi!",text.contains(kullaniciAdi));
        tearDown();
    }
}
