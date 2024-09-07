import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_103 extends BaseDriver {
    @Test
    public void TestLogout(){

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

        WebElement clickAccount=driver.findElement(By.xpath("//a[@title='Hesabım' ]"));
        clickAccount.click();
        MyFunc.Wait(2);

        WebElement logout= driver.findElement(By.cssSelector("ul>:nth-child(6) a[href='#Çık' ]"));
        logout.click();
        MyFunc.Wait(5);

        WebElement loginText=driver.findElement(By.xpath("(//a[text()='Giriş Yap' ]) [1]"));
        System.out.println("Giriş Yap: " +loginText.getText());

        System.out.println("Giriş Yap görünür durumda mı?" +loginText.isDisplayed());
        Assert.assertTrue("Giriş Yap yazısı görünmüyor!",loginText.getText().contains("Giriş Yap"));
        tearDown();

    }
}
