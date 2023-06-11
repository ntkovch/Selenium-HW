package Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;

public class CommonMethods {
    public static WebDriver driver;
    public static void openBrowserAndLaunchApplication(String url, String browser){
        switch (browser){
            case "chrome":
                driver=new ChromeDriver();
                break;
            case "firefox":
                driver=new FirefoxDriver();
                break;
        }
        driver.manage().window().maximize();
        driver.get(url);
    }
    public static void closeBrowser(){
        if(driver!=null){
            driver.quit();
        }
    }
    public  static void sendText(String text, WebElement element){
        element.clear();
        element.sendKeys(text);
    }
    public static void selectFromDropdown(String text, WebElement element){
        Select sel=new Select(element);
        sel.selectByValue(text);
    }
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
}
