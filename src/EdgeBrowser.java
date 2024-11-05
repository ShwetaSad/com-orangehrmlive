import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser {
    /*
    Project-2 - ProjectName : com-orangehrmlive
BaseUrl = https://opensource-demo.orangehrmlive.com/
1. Set up Edge browser.
2. Open URL.
3. Print the title of the page.
4. Print the current URL.
5. Print the page source.
6. Click on the ‘Forgot your password?’ link.
7. Print the current URL.
8. Navigate back to the login page.
9. Refresh the page.
10. Enter the email in the email field.
11. Enter the password in the password field.
12. Click on the Login Button.
13. Close the browser.
     */
    public static void main(String[] args) {
        String baseUrl = " https://opensource-demo.orangehrmlive.com/";
// Set up Edge Driver
        WebDriver driver = new EdgeDriver();
        // Open Url
        driver.get(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Print the Titleof the page
        System.out.println(" The Tittle of the page is " + driver.getTitle());
        //Print the current URL
        System.out.println("The Current URL is " + driver.getCurrentUrl());
        //Print the page Source
        System.out.println("The Page Source is " + driver.getPageSource());
        // Click on the 'forgot your password?' Link
        WebElement forgotpassword = driver.findElement(By.className("orangehrm-login-forgot"));
        forgotpassword.click();
        //Print the Current URL
        System.out.println("URL after clicking 'Forgot your password?': " + driver.getCurrentUrl());
        // Navigate back to the Login page
        driver.navigate().back();
        // Refresh the page
        driver.navigate().refresh();
        //Enter the email id in Email Field
        WebElement searchBox = driver.findElement(By.name("username"));
        searchBox.sendKeys("admin");
//Enter password in the password field
        WebElement searchButton = driver.findElement(By.name("password"));
        searchButton.sendKeys("123456");
// Click on Login Button
        WebElement LoginButton = driver.findElement(By.linkText("Login"));
        LoginButton.click();
// Close the Browser
         driver.quit();


    }
}
