package class5;

import Utils.CommonMethods;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {
        /*
        http://practice.syntaxtechs.net/javascript-alert-box-demo.php
        click on the last alert
        send keys and accept it

        Note: don't worry if the text u send doesn't appears up in the textbox
         */
        String url="http://practice.syntaxtechs.net/javascript-alert-box-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        WebElement alertBtn=driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        alertBtn.click();
        Thread.sleep(2000);

        Alert confirmationAlert=driver.switchTo().alert();
        confirmationAlert.sendKeys("Javaaaaaaa");
        confirmationAlert.accept();
        Thread.sleep(2000);
        closeBrowser();
    }
}
