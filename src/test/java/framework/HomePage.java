package framework;

import org.openqa.selenium.By;
import ru.yandex.qatools.allure.annotations.Step;

public class HomePage extends BasePage{

	private By emailTextField = By.id("email");
	private By passwordTextField = By.id("pass");
	private By loginButton = By.id("loginbutton");
	private By firstNameTextField = By.id("firstName");
	private By lastNameTextField = By.id("lastName");
	private By mobileNumberTextField = By.id("mobileNumber");
	private By newPasswordTextField = By.id("newPwd");
	private By errorMessage = By.id("errorMessage");
	
	public void clickOnLoginButton() {
		clickOn(loginButton);
	}

	public void enterEmail(String enterEmail) {
		setValueToInputField(emailTextField, enterEmail);
	}
	
	public void enterPassword(String enterPassword) {
		setValueToInputField(passwordTextField, enterPassword);
	}

	public void enterFirstName(String firstName) {
		setValueToInputField(firstNameTextField, firstName);
	}

	public void enterLastName(String lastName) {
		setValueToInputField(lastNameTextField, lastName);
	}

	public void enterMobileNumber(String mobileNum) {
		setValueToInputField(mobileNumberTextField, mobileNum);
	}

	public void enterNewPassword(String password) {
		setValueToInputField(newPasswordTextField, password);
	}

	public String getErrorMessage() {
		return getTextFromElement(errorMessage);
	}







}
