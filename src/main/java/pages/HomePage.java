//package pages;
//
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//public class HomePage {
//    WebDriver driver;
//    @FindBy(name = "email")
//    WebElement email;
//
//    @FindBy(name = "password")
//    WebElement password;
//
//    @FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
//    WebElement logInBttn;
//
//    public String messageOnHomePage() {
//        return  this.logInBttn.getText();
//    }
//
//    public void emailBox(String mail) {
//
//    }
//
//    public void passwordBox(String pWord) {
//        this.password.sendKeys(pWord);
//
//    }
//
//    public void verifyLogInBttn() {
//        logInBttn.click();
//        JavascriptExecutor js = (JavascriptExecutor) this.driver;
//        js.executeScript("arguments[0].click();", logInBttn);
//
//
//    }
//
//    public String verifyHomepageTitle() {
//        return this.driver.getTitle();
//
//    }
//}
