package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        (only use XPATH) navigate to fb.com click on create new account
         Thread.sleep(2000)
         fill up all the textboxes close the popup  close the browser
         */
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Створити обліковий запис']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nataliia");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Kovalchuk");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("ntjkghs@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("ntjkghs@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@autocomplete='new-password']")).sendKeys("092hyr35cc778");
        Thread.sleep(2000);
        driver.close();

    }
}
