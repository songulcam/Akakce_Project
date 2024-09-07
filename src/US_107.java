import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_107 extends BaseDriver {
    String emailStr="team6@gmail.com";
    String passwordStr="Team61234";
    String wrongPassword="team6_1234";

    @Test
    public void accountDeletePositiveTest(){
        driver.get("https://www.akakce.com/");
        MyFunc.Wait(2);

        WebElement login=driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        login.click();
        MyFunc.Wait(2);

        WebElement email=driver.findElement(By.xpath("//input[@class='t' and @name='life']"));
        email.sendKeys(emailStr);
        MyFunc.Wait(2);

        WebElement password=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        password.sendKeys(passwordStr);
        MyFunc.Wait(2);

        WebElement loginButton=driver.findElement(By.xpath("(//input[@value='Giriş yap'])[1]"));
        loginButton.click();
        MyFunc.Wait(2);

        WebElement myProfile=driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
        myProfile.click();
        MyFunc.Wait(2);

        WebElement deleteAccount=driver.findElement(By.xpath("//a[text()='Hesabımı Sil']"));
        deleteAccount.click();
        MyFunc.Wait(2);

        WebElement passwordBox=driver.findElement(By.xpath("//input[@name='p']"));
        passwordBox.click();
        MyFunc.Wait(2);

        WebElement passwordWrite=driver.findElement(By.xpath("//input[@name='p']"));
        passwordWrite.sendKeys(passwordStr);
        MyFunc.Wait(2);

        WebElement accountDelete=driver.findElement(By.xpath("//input[@type='submit']"));
        accountDelete.click();
        MyFunc.Wait(2);

        WebElement deleteAccountControl=driver.findElement(By.xpath("//ul[@class='cul']//p//i"));
        Assert.assertTrue("Hesabın Silinemedi", deleteAccountControl.getText().contains("Hesabın silindi"));
        MyFunc.Wait(2);

        tearDown();
    }


    @Test
    public void deleteAccountNegativeTest(){
        driver.get("https://www.akakce.com/");
        MyFunc.Wait(2);

        WebElement login=driver.findElement(By.xpath("(//a[text()='Giriş Yap'])[1]"));
        login.click();
        MyFunc.Wait(2);

        WebElement email=driver.findElement(By.xpath("//input[@class='t' and @name='life']"));
        email.sendKeys(emailStr);
        MyFunc.Wait(2);

        WebElement password=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        password.sendKeys(passwordStr);
        MyFunc.Wait(2);

        WebElement loginButton=driver.findElement(By.xpath("(//input[@value='Giriş yap'])[1]"));
        loginButton.click();
        MyFunc.Wait(2);

        WebElement myProfile=driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
        myProfile.click();
        MyFunc.Wait(2);

        WebElement deleteAccount=driver.findElement(By.xpath("//a[text()='Hesabımı Sil']"));
        deleteAccount.click();
        MyFunc.Wait(2);

        WebElement passwordBox=driver.findElement(By.xpath("//input[@name='p']"));
        passwordBox.click();
        MyFunc.Wait(2);

        WebElement passwordWrite=driver.findElement(By.xpath("//input[@name='p']"));
        passwordWrite.sendKeys(wrongPassword);
        MyFunc.Wait(2);

        WebElement accountDelete=driver.findElement(By.xpath("//input[@type='submit']"));
        accountDelete.click();
        MyFunc.Wait(2);

        WebElement wrongPasswordControl=driver.findElement(By.xpath("//div[@class='alertX t2']//p"));
        Assert.assertTrue("Hesabın Silindi", wrongPasswordControl.getText().contains("şifrenizi doğru girdiğinizden emin olun"));
        MyFunc.Wait(2);

        tearDown();
    }
}

