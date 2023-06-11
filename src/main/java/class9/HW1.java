package class9;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class HW1 extends CommonMethods {
    public static void main(String[] args) {
        //create a method in Common methods for screen shot
        //it should take file name as a parameter.

        /*
        public static void screenShot(String fileName)  {
        TakesScreenshot ts=(TakesScreenshot) driver;
        File screenShot=ts.getScreenshotAs(OutputType.FILE);
        String path="D:\\IdeaProjects\\SeleniumHW\\screenShots\\";

        try {
            FileUtils.copyFile(screenShot,new File(path+fileName+".png"));
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
         */
        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);

        WebElement userNameTextBox=driver.findElement(By.id("txtUsername"));
        userNameTextBox.sendKeys("Admin");
        WebElement pass=driver.findElement(By.name("txtPassword"));
        pass.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.className("button"));
        loginBtn.click();

        screenShot("Screen1");
        closeBrowser();

    }
}
