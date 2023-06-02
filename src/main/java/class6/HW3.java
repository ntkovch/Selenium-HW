package class6;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HW3 extends CommonMethods {
    public static void main(String[] args) {
        /*
        develop a function in common methods to select from dropdown(single select)
         */

        //public static void selectFromDropdown(String text, WebElement element){
       //     Select sel=new Select(element);
       //     sel.selectByValue(text);}


        String url="http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
        String browser="chrome";
        openBrowserAndLaunchApplication(url,browser);

        // select Wednesday
        String day="Wednesday";
        WebElement element=driver.findElement(By.xpath("//select[@class='form-control']"));
        selectFromDropdown(day,element);

    }
}
