package stepdefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import framework.AmazonHomePage;
import framework.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

/**
 * Created by joselitowilliamraymundo on 2/10/18.
 */
public class AmazonLoginSD {

    private AmazonHomePage amazonHomePage = new AmazonHomePage();

    @Given("^I am on Amazon home page$")
    public void iAmOnAmazonHomePage() {
        Assert.assertEquals(BasePage.getDriver().getTitle(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more", "Wrong Page");
    }

    @And("^I hover over to Accounts & List$")
    public void hoverOver() throws Exception {
        amazonHomePage.hoverOver();
    }

    @And("^I click on (signIn|submit) button$")
    public void clickOn(String button) {
        switch (button) {
            case "signIn":
                amazonHomePage.clickOnSignIn();
                break;
            case "submit":
                if (!amazonHomePage.skip){amazonHomePage.clickOnSubmit();}
                break;
        }
    }

    @And("^I enter (.+) into (email|password) text box$")
    public void enterText(String text, String textField) {

        switch (textField) {
            case "email":
                amazonHomePage.enterEmail(text);
                break;
            case "password":
                if (!amazonHomePage.skip){amazonHomePage.enterPassword(text);}
                break;
        }
    }

    @Then("^I verify error or warning message$")
    public void verifyErrorOrWarningMessage() {
        amazonHomePage.verifyErrorMessage();
    }

}
