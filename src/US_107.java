import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_107 extends BaseDriver {
    String emailStr="sefakahraman0001@gmail.com";
    String passwordStr="Earnq123**";
    String invalidPasswordStr="Earnq123";
    String invalidEmailStr="sefakahraman001@gmail.com";
    String searchBoxSendKeys="Laptop ve Notebook";
    static int count=0;
    String[] keyWordStr ={"laptop","notebook","macbook"};

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

        WebElement loginControl=driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
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
        password.sendKeys(invalidPasswordStr);
        MyFunc.Wait(1);

        WebElement clickLogin=driver.findElement(By.xpath("(//input[@value='Giriş yap'])[1]"));
        clickLogin.click();
        MyFunc.Wait(1);

        WebElement loginControl=driver.findElement(By.xpath("(//div[@class='alertX t2'])//p"));
        Assert.assertTrue("Giriş başarılı",loginControl.getText().contains("Şifre doğru değil. Lütfen kontrol edip yeniden deneyin."));
        MyFunc.Wait(1);

        WebElement okBtn =driver.findElement(By.xpath("//button[@onclick='Modal_v8.close()']"));
        okBtn.click();
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
        email.sendKeys(invalidEmailStr);
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

        WebElement okBtn =driver.findElement(By.xpath("//button[@onclick='Modal_v8.close()']"));
        okBtn.click();
        MyFunc.Wait(1);

        driver.close();
    }

    @Test
    public void nullEmailAndPassword(){
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

        WebElement okBtn =driver.findElement(By.xpath("//button[@onclick='Modal_v8.close()']"));
        okBtn.click();
        MyFunc.Wait(1);

        driver.close();
    }

    @Test
    public void nullEmailAndPassword2(){
        driver.get("https://www.akakce.com/");
        MyFunc.Wait(1);

        WebElement login=driver.findElement(By.linkText("Giriş Yap"));
        login.click();

        WebElement email=driver.findElement(By.xpath("(//input[@type='email'])[2]"));
        email.sendKeys(" ");
        MyFunc.Wait(1);

        WebElement password=driver.findElement(By.xpath("(//input[@type='password'])[1]"));
        password.sendKeys(" ");
        MyFunc.Wait(1);

        WebElement clickLogin=driver.findElement(By.xpath("(//input[@value='Giriş yap'])[1]"));
        clickLogin.click();
        MyFunc.Wait(1);

        WebElement loginControl=driver.findElement(By.xpath("(//div[@class='alertX t2'])//p"));
        Assert.assertTrue("Giriş başarılı",loginControl.getText().contains("Lütfen e-posta adresinizi yazın."));
        MyFunc.Wait(1);

        WebElement okBtn =driver.findElement(By.xpath("//button[@onclick='Modal_v8.close()']"));
        okBtn.click();
        MyFunc.Wait(1);

        driver.close();
    }

    @Test
    public void passwordNull(){
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

        WebElement okBtn =driver.findElement(By.xpath("//button[@onclick='Modal_v8.close()']"));
        okBtn.click();
        MyFunc.Wait(1);

        driver.close();
    }

    @Test
    public void emailNull(){
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

        WebElement okBtn =driver.findElement(By.xpath("//button[@onclick='Modal_v8.close()']"));
        okBtn.click();
        MyFunc.Wait(1);

        driver.quit();
    }

    @Test
    public void searchBoxTest(){
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

        WebElement loginControl=driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
        Assert.assertTrue("Giriş başarısız",loginControl.getText().contains("Sefa"));

        WebElement searchBox=driver.findElement(By.xpath("(//span[@class='acHolder'])//input"));
        searchBox.sendKeys(searchBoxSendKeys);
        MyFunc.Wait(1);

        WebElement searchBoxBtn=driver.findElement(By.cssSelector("[title='Ara']"));
        searchBoxBtn.click();
        MyFunc.Wait(1);

        List<WebElement>controlItemName=driver.findElements(By.xpath("//ul[@id='APL']//span//h3"));

        boolean found=false;
        for (WebElement e : controlItemName){
            for (String keyWord : keyWordStr) {
                if (e.getText().toLowerCase().contains(keyWord)) {
                    count++;
                    found=true;
                    break;
                }
                if (!found){
                    System.out.println("Aranan katagoride ürün bulunamadı");
                }
            }
            System.out.println("e.getText() = " + e.getText());
        }
        System.out.println("count = " + count);
        driver.close();
    }

    @Test
    public void footerMenu(){
        driver.navigate().to("https://www.akakce.com/");
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

        WebElement loginControl=driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]"));
        Assert.assertTrue("Giriş başarısız",loginControl.getText().contains("Sefa"));

        List<WebElement> footerMenu=driver.findElements(By.xpath("(//div[contains(@class ,'links_v8')])[2]//a"));

        for (int i = 0; i < footerMenu.size(); i++) {
            footerMenu=driver.findElements(By.xpath("(//div[contains(@class ,'links_v8')])[2]//a[@title]"));
            WebElement e=footerMenu.get(i);
            e.click();
            MyFunc.Wait(1);

            WebElement footerMenuControl=driver.findElement(By.xpath("//body//h1"));
            System.out.println("footerMenuControl.getText() = " + footerMenuControl.getText());
            String[] footerMenuKeyWordStr={footerMenuControl.getText()};

            for (String keyWord: footerMenuKeyWordStr){
                Assert.assertTrue("Aranan ürün eşleşmedi",footerMenuControl.getText().contains(keyWord));
            }
            driver.navigate().back();
            MyFunc.Wait(1);
        }
        driver.quit();
    }
}
