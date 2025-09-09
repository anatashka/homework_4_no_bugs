package edX;

//import static org.testng.Assert.fail;

/*public class edX_one {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();
    private JavascriptExecutor js;

    @BeforeClass(alwaysRun = true)
   public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        js = (JavascriptExecutor) driver;
    }

    @Test
    public void testEdX() throws Exception {
        driver.get("https://www.edx.org/");
        driver.findElement(By.xpath("//div[@id='page']/header/div/div[7]/nav/a")).click();
        driver.get("https://authn.edx.org/login?_gl=1*ein1yk*_gcl_au*MjcxNDYwOTA0LjE3Mjk5NzA2MDc.*_ga*NjQ2NTk1MTQ3LjE3Mjk5NzA2MDc.*_ga_D3KS4KMDT0*MTczMDc0OTgzNi4xMC4xLjE3MzA3NTA4NjQuNjAuMC4w");
        driver.findElement(By.id("emailOrUsername")).click();
        driver.findElement(By.id("emailOrUsername")).clear();
        driver.findElement(By.id("emailOrUsername")).sendKeys("demoNka");
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("sign-in")).click();
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("test1ng!");
        driver.findElement(By.id("password-security-close")).click();
        driver.get("https://home.edx.org/");
        driver.findElement(By.xpath("//div[@id='dashboard-content']/div/div/div")).click();
        driver.findElement(By.linkText("Explore courses")).click();
        driver.get("https://www.edx.org/search?_gl=1*9xvhp1*_gcl_au*MjcxNDYwOTA0LjE3Mjk5NzA2MDc.*_ga*NjQ2NTk1MTQ3LjE3Mjk5NzA2MDc.*_ga_D3KS4KMDT0*MTczMDc0OTgzNi4xMC4xLjE3MzA3NTA4ODkuMzUuMC4w");
        driver.get("https://www.edx.org/search");
        driver.findElement(By.xpath("//main[@id='main-content']/div")).click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)=concat('I', \"'\", 'm Xpert, an AI assistant to help you find things.')])[1]/following::*[name()='svg'][1]")).click();
        driver.findElement(By.xpath("//div[@id='page']/header/div/div[7]/div/button")).click();
        driver.findElement(By.linkText("Sign Out")).click();
        driver.get("https://courses.edx.org/logout?_gl=1*1y58w45*_gcl_au*MjcxNDYwOTA0LjE3Mjk5NzA2MDc.*_ga*NjQ2NTk1MTQ3LjE3Mjk5NzA2MDc.*_ga_D3KS4KMDT0*MTczMDc0OTgzNi4xMC4xLjE3MzA3NTA5MjkuNTguMC4w");
        driver.get("https://www.edx.org/");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
*/