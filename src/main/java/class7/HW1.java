package class7;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HW1 extends CommonMethods {
    public static void main(String[] args) {
        /*
        goto http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login
        login click on PIM
        from the table choose any ID
        and print out the row number of that id

        please make sure that ur code is dynamic enough to cater if another row gets delted , it still prints the row correctly
         */
        String url="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        WebElement userNameTextBox=driver.findElement(By.id("txtUsername"));
        userNameTextBox.sendKeys("Admin");
        WebElement pass=driver.findElement(By.name("txtPassword"));
        pass.sendKeys("Hum@nhrm123");
        WebElement loginBtn=driver.findElement(By.className("button"));
        loginBtn.click();
        WebElement pimBtn=driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
        pimBtn.click();

        List<WebElement> allIDs= driver.findElements(By.xpath("//table/tbody/tr/td[2]"));
        for( int i=0; i<allIDs.size(); i++){
            String id=allIDs.get(i).getText();
            if(id.equals("53710A")){
                System.out.println("The row number of that id is "+(i+1));
            }
        }
        closeBrowser();

    }
}
