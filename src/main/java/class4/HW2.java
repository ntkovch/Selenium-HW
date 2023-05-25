package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2 {
    public static void main(String[] args) throws InterruptedException {
        /*
        goto facebook.com
        click on create account
        and select the your  date of birth using select class
         */
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
        Thread.sleep(2000);
        WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
        day.click();
        Select sel=new Select(day);
        sel.selectByVisibleText("28");
        WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
        month.click();
        Select sel1=new Select(month);
        sel1.selectByIndex(0);
        WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
        year.click();
        Select sel2=new Select(year);
        sel2.selectByValue("2002");
    }
}
