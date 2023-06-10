package class8;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import javax.sound.midi.Soundbank;
import java.util.List;

public class HW1 extends CommonMethods {
    public static void main(String[] args) {
        /*
        goto syntax hrms login
        click on recruitment
        select a date on the calanader
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

        WebElement recrBtn=driver.findElement(By.xpath("//b[text()='Recruitment']"));
        recrBtn.click();

        WebElement cal=driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger'][1]"));
        cal.click();

        WebElement month=driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select sel=new Select(month);
        sel.selectByValue("4");


        WebElement year=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
        sel=new Select(year);
        sel.selectByVisibleText("1981");

        List<WebElement> day=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
        for (WebElement d : day) {
            String dayC=d.getText();
            if(dayC.equals("9")){
                d.click();
                break;
            }
        }


    }
}
