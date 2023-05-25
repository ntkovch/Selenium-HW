package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        goto   http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
        select , tuesday, thursday and friday one by one
         */
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-select-dropdown-demo.php");
        WebElement day=driver.findElement(By.xpath("//select[@id='select-demo']"));
        day.click();
        Select sel=new Select(day);
        sel.selectByValue("Tuesday");
       Thread.sleep(2000);
       sel.selectByIndex(5);
       Thread.sleep(2000);
       sel.selectByVisibleText("Friday");
        Thread.sleep(5000);
        driver.quit();

    }
}
