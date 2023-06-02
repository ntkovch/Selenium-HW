package class6;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class HW2 extends CommonMethods {
    public static void main(String[] args) {
        /*
        goto http://practice.syntaxtechs.net/dynamic-data-loading-demo.php
        click on get new user
        print the firstname of user
         */
        String url="http://practice.syntaxtechs.net/dynamic-data-loading-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement userBtn=driver.findElement(By.xpath("//button[@type='button']"));
        userBtn.click();

        WebElement userName=driver.findElement(By.xpath("//p[contains(text(),'First Name')]"));
        System.out.println(userName.getText());




    }
}
