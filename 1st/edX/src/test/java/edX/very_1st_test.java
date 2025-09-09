package edX;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleContains;

public class very_1st_test {

    private WebDriver driver;
    private WebDriverWait wait;
    private boolean elementExists;

    @Before
    public void start(){
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void very_1st_test(){
        driver.get("https://www.edx.org/");
        driver.findElement(By.name("searchfield-input")).sendKeys("sql");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.id("nav-search-desktop-search-submit")).click();
        //elementExists = existsElement("test");
       // return elementExists;
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        wait.until(titleContains("sql"));
    }

    @After
    public void stop(){
        driver.quit();
        driver = null;
    }

    private boolean existsElement(String name){
        try {
            driver.findElement(By.name(name));
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }
}
