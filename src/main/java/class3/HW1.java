package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Open chrome browser
        Go to “http://practice.syntaxtechs.net/input-form-demo.php%E2%80%9D
        fill in the complete form
         */
        WebDriver driver=new ChromeDriver();
        driver.get("http://practice.syntaxtechs.net/input-form-demo.php");
        driver.manage().window().maximize();
        WebElement firstName= driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        firstName.sendKeys("Kate");
        WebElement lastName=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        lastName.sendKeys("Nikolen");
        Thread.sleep(2000);
        WebElement email=driver.findElement(By.cssSelector("input[placeholder='E-Mail Address']"));
        email.sendKeys("natr@gmail.com");
        WebElement phoneNum=driver.findElement(By.cssSelector("input[name='phone']"));
        phoneNum.sendKeys("845-22-79965");
        WebElement address=driver.findElement(By.cssSelector("input[placeholder='Address']"));
        address.sendKeys("Velington street");
        Thread.sleep(2000);
        WebElement city=driver.findElement(By.cssSelector("input[placeholder='city']"));
        city.sendKeys("Canada");
        WebElement state=driver.findElement(By.cssSelector("select[class*='selectpicker']"));
        Select sel=new Select(state);
        sel.selectByIndex(2);
        Thread.sleep(2000);
        WebElement zip=driver.findElement(By.cssSelector("input[name='zip']"));
        zip.sendKeys("99501");
        WebElement website=driver.findElement(By.cssSelector("input[name='website']"));
        website.sendKeys("Syntax");
        driver.findElement(By.cssSelector("input[value='yes']")).click();
        driver.findElement(By.cssSelector("button[onclick='resetForm();']")).click();
        Thread.sleep(5000);
        driver.quit();




    }
}
