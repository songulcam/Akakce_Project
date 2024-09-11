import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_106 extends BaseDriver {

    @Test
    public void TestMessageBoxCheck(){

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

        WebElement myProfile=driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
        myProfile.click();
        MyFunc.Wait(2);

        WebElement clickMessage=driver.findElement(By.cssSelector("li[class='order first']>:nth-child(3)"));
        clickMessage.click();
        MyFunc.Wait(2);

        WebElement messageBox=driver.findElement(By.xpath("//div[@class='wbb_v8' ]/ p"));
        System.out.println("Mesaj kutusundaki yazılar görünür durumda mı?"+messageBox.isDisplayed());
        Assert.assertTrue("'Listelenecek mesaj bulunamadı.' görüntülenememektedir.",messageBox.getText().contains("Listelenecek mesaj bulunamadı."));

        WebElement clickAccount=driver.findElement(By.xpath("//a[@title='Hesabım' ]"));
        clickAccount.click();
        MyFunc.Wait(2);

        WebElement logout= driver.findElement(By.cssSelector("ul>:nth-child(6) a[href='#Çık' ]"));
        logout.click();
        tearDown();
    }
}
