package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.testng.Assert;

/**
 * Created by joselitowilliamraymundo on 2/14/18.
 */
public class AmazonHomePage extends BasePage {

    //private By signInButton = By.xpath("//*[@id=\"nav-signin-tooltip\"]/a");
    private By accountListButton = By.id("nav-link-accountList");
    private By signInButton = By.className("nav-action-button");
    private By signIn2Text = By.className("a-button-text");
    private By continueButton = By.id("continue");
    private By email = By.name("email");
    private By passwrd = By.name("password");
    private By submit = By.id("signInSubmit");
    private By assortedMessages = By.className("a-section");
    public boolean skip = false;

    public void enterPassword(String password) {setValueToInputField(passwrd, password);}

    public void clickOnSignIn() {clickOn(signInButton);}

    public void clickOnSubmit() {clickOn(submit);}

    public void hoverOver() throws Exception {
        mouseOver(accountListButton);
        Thread.sleep(2000);
    }

    public void enterEmail(String emailAdd) {
        String text = getTextFromElement(signIn2Text);
        setValueToInputField(email, emailAdd);
        if(text.equals("Continue")){
            clickOn(continueButton);
           skip=true;
        }
    }

    public void verifyErrorMessage() {
        Assert.assertEquals(isDisplayed(assortedMessages), true, "No Error Message Displayed");
        System.out.println(getTextFromElement(assortedMessages).toUpperCase());
    }
}
