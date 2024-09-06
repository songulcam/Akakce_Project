import Utility.BaseDriver;
import Utility.MyFunc;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Us_401 extends BaseDriver {
    String emailStr="sefakahraman0001@gmail.com";
    String passwordStr="Earnq123**";

    @Test
    public void successfulLogin(){
        driver.get("https://www.akakce.com/");
        MyFunc.Wait(1);

        WebElement login=driver.findElement(By.linkText("Giriş Yap"));
        login.click();

        WebElement email=driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        email.sendKeys(emailStr);
        MyFunc.Wait(1);

        WebElement password=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        password.sendKeys(passwordStr);
        MyFunc.Wait(1);

        WebElement clickLogin=driver.findElement(By.xpath("(//input[@value='Giriş yap'])[1]"));
        clickLogin.click();
        MyFunc.Wait(1);

        WebElement loginControl=driver.findElement(By.linkText("Sefa"));
        Assert.assertTrue("Giriş başarısız",loginControl.getText().contains("Sefa"));

        driver.close();
    }

    @Test
    public void invalidPassword(){
        driver.get("https://www.akakce.com/");
        MyFunc.Wait(1);

        WebElement login=driver.findElement(By.linkText("Giriş Yap"));
        login.click();

        WebElement email=driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        email.sendKeys(emailStr);
        MyFunc.Wait(1);

        WebElement password=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        password.sendKeys("Earnq123");
        MyFunc.Wait(1);

        WebElement clickLogin=driver.findElement(By.xpath("(//input[@value='Giriş yap'])[1]"));
        clickLogin.click();
        MyFunc.Wait(1);

        WebElement loginControl=driver.findElement(By.xpath("(//div[@class='alertX t2'])//p"));
        Assert.assertTrue("Giriş başarılı",loginControl.getText().contains("Şifre doğru değil. Lütfen kontrol edip yeniden deneyin."));
        MyFunc.Wait(1);

        WebElement okay=driver.findElement(By.xpath("//button[@onclick='Modal_v8.close()']"));
        okay.click();
        MyFunc.Wait(1);

        driver.close();
    }

    @Test
    public void invalidEmail(){
        driver.get("https://www.akakce.com/");
        MyFunc.Wait(1);

        WebElement login=driver.findElement(By.linkText("Giriş Yap"));
        login.click();

        WebElement email=driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        email.sendKeys("sefakahraman001@gmail.com");
        MyFunc.Wait(1);

        WebElement password=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        password.sendKeys(passwordStr);
        MyFunc.Wait(1);

        WebElement clickLogin=driver.findElement(By.xpath("(//input[@value='Giriş yap'])[1]"));
        clickLogin.click();
        MyFunc.Wait(1);

        WebElement loginControl=driver.findElement(By.xpath("(//div[@class='alertX t2'])//p"));
        Assert.assertTrue("Giriş başarılı",loginControl.getText().contains("Bu e-postaya kayıtlı bir hesap bulunamadı."));
        MyFunc.Wait(1);

        WebElement okay=driver.findElement(By.xpath("//button[@onclick='Modal_v8.close()']"));
        okay.click();
        MyFunc.Wait(1);

        driver.close();
    }

    @Test
    public void emptyEmailAndPassword(){
        driver.get("https://www.akakce.com/");
        MyFunc.Wait(1);

        WebElement login=driver.findElement(By.linkText("Giriş Yap"));
        login.click();

        WebElement email=driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        email.sendKeys("");
        MyFunc.Wait(1);

        WebElement password=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        password.sendKeys("");
        MyFunc.Wait(1);

        WebElement clickLogin=driver.findElement(By.xpath("(//input[@value='Giriş yap'])[1]"));
        clickLogin.click();
        MyFunc.Wait(1);

        WebElement loginControl=driver.findElement(By.xpath("(//div[@class='alertX t2'])//p"));
        Assert.assertTrue("Giriş başarılı",loginControl.getText().contains("Lütfen e-posta adresinizi yazın."));
        MyFunc.Wait(1);

        WebElement okay=driver.findElement(By.xpath("//button[@onclick='Modal_v8.close()']"));
        okay.click();
        MyFunc.Wait(1);

        driver.close();
    }

    @Test
    public void passwordEmpty(){
        driver.get("https://www.akakce.com/");
        MyFunc.Wait(1);

        WebElement login=driver.findElement(By.linkText("Giriş Yap"));
        login.click();

        WebElement email=driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        email.sendKeys(emailStr);
        MyFunc.Wait(1);

        WebElement password=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        password.sendKeys("");
        MyFunc.Wait(1);

        WebElement clickLogin=driver.findElement(By.xpath("(//input[@value='Giriş yap'])[1]"));
        clickLogin.click();
        MyFunc.Wait(1);

        WebElement loginControl=driver.findElement(By.xpath("(//div[@class='alertX t2'])//p"));
        Assert.assertTrue("Giriş başarılı",loginControl.getText().contains("Lütfen şifrenizi yazın."));
        MyFunc.Wait(1);

        WebElement okay=driver.findElement(By.xpath("//button[@onclick='Modal_v8.close()']"));
        okay.click();
        MyFunc.Wait(1);

        driver.close();
    }

    @Test
    public void emailEmpty(){
        driver.get("https://www.akakce.com/");
        MyFunc.Wait(1);

        WebElement login=driver.findElement(By.linkText("Giriş Yap"));
        login.click();

        WebElement email=driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        email.sendKeys("");
        MyFunc.Wait(1);

        WebElement password=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        password.sendKeys(passwordStr);
        MyFunc.Wait(1);

        WebElement clickLogin=driver.findElement(By.xpath("(//input[@value='Giriş yap'])[1]"));
        clickLogin.click();
        MyFunc.Wait(1);

        WebElement loginControl=driver.findElement(By.xpath("(//div[@class='alertX t2'])//p"));
        Assert.assertTrue("Giriş başarılı",loginControl.getText().contains("Lütfen e-posta adresinizi yazın."));
        MyFunc.Wait(1);

        WebElement okay=driver.findElement(By.xpath("//button[@onclick='Modal_v8.close()']"));
        okay.click();
        MyFunc.Wait(1);

        driver.close();
    }
}
