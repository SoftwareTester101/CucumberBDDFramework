//package stepDefinitions;
//
//        import cucumber.api.java.en.And;
//        import cucumber.api.java.en.Given;
//        import cucumber.api.java.en.Then;
//        import cucumber.api.java.en.When;
//        import cucumber.api.java.en_old.Ac;
//        import org.junit.Assert;
//        import org.openqa.selenium.By;
//        import org.openqa.selenium.JavascriptExecutor;
//        import org.openqa.selenium.WebDriver;
//        import org.openqa.selenium.WebElement;
//        import org.openqa.selenium.chrome.ChromeDriver;
//        import org.openqa.selenium.interactions.Actions;
//        import org.openqa.selenium.support.ui.ExpectedConditions;
//        import org.openqa.selenium.support.ui.WebDriverWait;
//
//        import java.util.Iterator;
//        import java.util.List;
//        import java.util.concurrent.TimeUnit;
//
//public class LogInStepDefinition {
//
//    WebDriver driver;
//
//    @Given("^User on the OpenSource page on URL \"([^\"]*)\"$")
//    public void user_on_the_OpenSource_page_on_URL(String url) {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mira\\Documents\\FreeCRMFramework\\src\\test\\driver\\chromedriver.exe");
//        this.driver = new ChromeDriver();
//        this.driver.get(url);
//        this.driver.manage().window().maximize();
//        this.driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//        this.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    }
//
//    @Then("^user should see Login  message$")
//    public void user_should_see_Login_message() {
//        String message = this.driver.getTitle();
//        Assert.assertEquals(message, "Log In ‹ opensourcecms — WordPress");
//    }
//
//    @When("^user fills in username with \"([^\"]*)\"$")
//    public void user_fills_in_email_with(String username) {
//        this.driver.findElement(By.id("user_login")).sendKeys(username);
//    }
//
//    @And("^user fills in password with \"([^\"]*)\"$")
//    public void user_fills_in_password_with(String password) {
//        this.driver.findElement(By.id("user_pass")).sendKeys(password);
//    }
//
//    @And("^user clicks on the Login button$")
//    public void user_clicks_on_the_Login_button() {
//        this.driver.findElement(By.id("wp-submit")).click();
//    }
//
//    @Then("^user is on home page$")
//    public void user_is_on_home_page() {
//        String title = this.driver.getTitle();
//        Assert.assertEquals(title, "Dashboard ‹ opensourcecms — WordPress");
//
//    }
//
//
//    @Then("^user hoverovers New link$")
//    public void user_clicks_New_button() throws InterruptedException {
//        Actions actions = new Actions(this.driver);
//        actions.moveToElement(this.driver.findElement(By.xpath("//span[@class='ab-label'][contains(text(),'New')]"))).build().perform();
//    }
//
//    @Then("^user clicks user link$")
//    public NewUser user_is_on_add_new_user_page() throws InterruptedException {
//        Thread.sleep(3000);
//        getAllLinksThenClick("//ul[@id=\"wp-admin-bar-new-content-default\"]/li/a", "User");
//        Thread.sleep(3000);
//        return  new NewUser();
//    }
//
//    public void getAllLinksThenClick(String xpath, String text) throws InterruptedException {
//        List<WebElement> elements = this.driver.findElements(By.xpath(xpath));
//        Iterator<WebElement> iterator = elements.iterator();
//        Actions actions = new Actions(this.driver);
//        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        while (iterator.hasNext()) {
//            WebElement we = iterator.next();
//            actions.moveToElement(we).build().perform();
//            if (we.getText().equalsIgnoreCase(text)) {
//                executor.executeScript("arguments[0].click();", we);
//                WebDriverWait wait = new WebDriverWait(this.driver, 10);
//                wait.until(ExpectedConditions.visibilityOf((this.driver.findElement(By.id("add-new-user")))));
//            }
//        }
//
//    }
//
//    public void hoveroversEachLink(String xpath) {
//        List<WebElement> elements = this.driver.findElements(By.xpath(xpath));
//        Iterator<WebElement> iterator = elements.iterator();
//        Actions actions = new Actions(this.driver);
//        while (iterator.hasNext()) {
//            WebElement we = iterator.next();
//            actions.moveToElement(we).build().perform();
//            System.out.println(we + ":  has been hovered.");
//            break;
//        }
//
//    }
//
//    @Then("^user fills contact details \"([^\"]*)\" , \"([^\"]*)\"  and \"([^\"]*)\" , \"([^\"]*)\"$")
//    public void user_fills_contact_details_and(String user_login, String email, String first_name, String last_name) throws InterruptedException {
//        this.driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys(user_login);
//        this.driver.findElement(By.id("email")).sendKeys(email);
//        this.driver.findElement(By.id("first_name")).sendKeys(first_name);
//        this.driver.findElement(By.id("last_name")).sendKeys(last_name);
//
//    }
//
//    @Then("^user presses Add New User Button$")
//    public void user_presses_save_icon() throws InterruptedException {
//        this.driver.findElement(By.id("createuser")).submit();
//    }
//
//
////    @And("^user should see warning message$")
////    public void user_should_see_warning_message() {
////        String warning =
////                this.driver.findElement(By.xpath("//div[contains(text(), 'Something went wrong...')]")).getText();
////        Assert.assertEquals(warning, "Something went wrong...");
////    }
//
//    @Then("^user hoverovers each link on the side bar$")
//    public void user_hoverovers_each_link_on_the_side_bar() {
//        hoveroversEachLink("//div[@id=\"adminmenuwrap\"]/ul/li");
//    }
//
//
//    @Then("^user closes the browser$")
//    public void user_closes_the_browser() {
//        this.driver.quit();
//    }
//
//}