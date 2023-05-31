package class5;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        /*
        goto https://chercher.tech/practice/frames
        click on check box
        then select bay cat from drop down
        then enter text in text box
         */
        String url="https://chercher.tech/practice/frames";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        driver.switchTo().frame("frame1").switchTo().frame("frame3");
        WebElement checkBox=driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        WebElement animals=driver.findElement(By.xpath("//select[@id='animals']"));
        Select sel=new Select(animals);
        sel.selectByValue("big baby cat");

        driver.switchTo().defaultContent();
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(frame);
        WebElement text=driver.findElement(By.xpath("//input"));
        text.sendKeys("Selenium");

        Thread.sleep(2000);
        closeBrowser();

    }
}
