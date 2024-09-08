import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
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
        WebElement name= driver.findElement(By.xpath("//input[@id='rnufn']"));
        name.sendKeys("TestUser");
        WebElement surname= driver.findElement(By.xpath("//input[@id='rnufs']"));
        surname.sendKeys("Tester");
        WebElement email= driver.findElement(By.xpath("//input[@id='rnufe1']"));
        email.sendKeys("testuser10@example.com");
        WebElement emailCheck= driver.findElement(By.xpath("//input[@id='rnufe2']"));
        emailCheck.sendKeys("testuser10@example.com");
        WebElement password= driver.findElement(By.xpath("//input[@id='rnufp1']"));
        password.sendKeys("Password123");
        WebElement passwordCheck= driver.findElement(By.xpath("//input[@id='rnufp2']"));
        passwordCheck.sendKeys("Password123");
        WebElement gender= driver.findElement(By.xpath("//input[@id='rngf']"));
        gender.click();
        WebElement provinceSelect= driver.findElement(By.xpath("//select[@id='locpr']"));
        Select selectProvince=new Select(provinceSelect);
        selectProvince.selectByValue("85");
        WebElement birthDaySelect= driver.findElement(By.xpath("//select[@id='bd']"));
        Select selectBirthday=new Select(birthDaySelect);
        selectBirthday.selectByValue("1");
        WebElement birthMonthSelect= driver.findElement(By.xpath("//select[@id='bm']"));
        Select selectBirthMonth=new Select(birthMonthSelect);
        selectBirthMonth.selectByValue("1");
        WebElement birthYearSelect= driver.findElement(By.xpath("//select[@id='by']"));
        Select selectBirthYear=new Select(birthYearSelect);
        selectBirthYear.selectByValue("1990");
        WebElement usingContract= driver.findElement(By.xpath("//input[@id='rnufpca']"));
        usingContract.click();
        WebElement allowanceAdverts= driver.findElement(By.xpath("//input[@id='rnufnee']"));
        allowanceAdverts.click();
        WebElement creteAccountEnd= driver.findElement(By.xpath("//input[@id='rfb']"));
        creteAccountEnd.click();

        WaitAndQuit();




    }
}
