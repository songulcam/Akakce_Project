import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _01_CreateAccount extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://www.akakce.com/");
        WebElement createAccount= driver.findElement(By.xpath("(//*[text()='Hesap Aç'])[1]"));
        createAccount.click();
        MyFunc.Wait(1);

        WebElement name= driver.findElement(By.xpath("//input[@id='rnufn']"));
        name.sendKeys("TestUser");
        MyFunc.Wait(1);

        WebElement surname= driver.findElement(By.xpath("//input[@id='rnufs']"));
        surname.sendKeys("Tester");
        MyFunc.Wait(1);

        WebElement email= driver.findElement(By.xpath("//input[@id='rnufe1']"));
        email.sendKeys("testuser10@example.com");
        MyFunc.Wait(1);

        WebElement emailCheck= driver.findElement(By.xpath("//input[@id='rnufe2']"));
        emailCheck.sendKeys("testuser10@example.com");
        MyFunc.Wait(1);

        WebElement password= driver.findElement(By.xpath("//input[@id='rnufp1']"));
        password.sendKeys("Password123");
        MyFunc.Wait(1);

        WebElement passwordCheck= driver.findElement(By.xpath("//input[@id='rnufp2']"));
        passwordCheck.sendKeys("Password123");
        MyFunc.Wait(1);

        WebElement gender= driver.findElement(By.xpath("//input[@id='rngf']"));
        gender.click();
        MyFunc.Wait(1);

        WebElement provinceSelect= driver.findElement(By.xpath("//select[@id='locpr']"));
        Select selectProvince=new Select(provinceSelect);
        selectProvince.selectByValue("85");
        MyFunc.Wait(1);

        WebElement birthDaySelect= driver.findElement(By.xpath("//select[@id='bd']"));
        Select selectBirthday=new Select(birthDaySelect);
        selectBirthday.selectByValue("1");
        MyFunc.Wait(1);

        WebElement birthMonthSelect= driver.findElement(By.xpath("//select[@id='bm']"));
        Select selectBirthMonth=new Select(birthMonthSelect);
        selectBirthMonth.selectByValue("1");
        MyFunc.Wait(1);

        WebElement birthYearSelect= driver.findElement(By.xpath("//select[@id='by']"));
        Select selectBirthYear=new Select(birthYearSelect);
        selectBirthYear.selectByValue("1990");
        MyFunc.Wait(1);

        WebElement usingContract= driver.findElement(By.xpath("//input[@id='rnufpca']"));
        usingContract.click();
        MyFunc.Wait(1);

        WebElement allowanceAdverts= driver.findElement(By.xpath("//input[@id='rnufnee']"));
        allowanceAdverts.click();
        MyFunc.Wait(1);

        WebElement creteAccountEnd= driver.findElement(By.xpath("//input[@id='rfb']"));
        creteAccountEnd.click();

        tearDown();
    }
}
