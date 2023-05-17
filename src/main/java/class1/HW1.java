package class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    public static void main(String[] args) {


    /*
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
     fill out the form
    close the browser
     */
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22");
        driver.manage().window().maximize();
        driver.findElement(By.id("customer.firstName")).sendKeys("Nataliia");
        driver.findElement(By.id("customer.lastName")).sendKeys("Kovalchuk");
        driver.findElement(By.id("customer.address.street")).sendKeys("Sakharova");
        driver.findElement(By.id("customer.address.city")).sendKeys("Ternopil");
        driver.findElement(By.id("customer.address.state")).sendKeys("Ukraine");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("46023");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("03809657512");
        driver.findElement(By.id("customer.ssn")).sendKeys("45HGD4545");
        driver.findElement(By.id("customer.username")).sendKeys("ntkovch");
        driver.findElement(By.id("customer.password")).sendKeys("081gtr55wb21");
        driver.findElement(By.id("repeatedPassword")).sendKeys("081gtr55wb21");
        driver.quit();
    }
}
