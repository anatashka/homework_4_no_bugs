package edX;

import org.junit.Test;
import org.openqa.selenium.By;

import static org.openqa.selenium.support.ui.ExpectedConditions.titleIs;

public class t1 extends BasicTests {

    @Test
    public void testWikipedia() {
        driver.navigate().to("https://www.wikipedia.org/");
      //  driver.findElement(By.cssSelector("frb-header-minimize.overlay-banner-toggler")).click();
        driver.findElement(By.id("searchInput")).sendKeys("webdriver");
       /* wait.until(elementToBeClickable(By.cssSelector("button.pure-button.pure-button-primary-progressive"))).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //driver.findElement(By.cssSelector("button.pure-button.pure-button-primary-progressive")).click();
        wait.until(titleIs("webdriver - Поиск в Google"));*/
    }

    @Test
    public void testGoogle() {
        driver.navigate().to("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("webdriver");
    }

    @Test
    public void testEdx() {
        driver.navigate().to("http://www.edx.org");
        driver.findElement(By.name("searchfield-input")).sendKeys("sql");
        driver.findElement(By.id("nav-search-desktop-search-submit")).click();
        wait.until(titleIs("webdriver - Поиск в Google"));
    }


}