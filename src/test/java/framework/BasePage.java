package framework;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import stepdefinition.SharedSD;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by mohammadmuntakim on 6/9/17.
 */
public class BasePage {

	public static WebDriver getDriver() {return SharedSD.getDriver();}

	public void clickOn(By locator) {
		try {
			getDriver().findElement(locator).click();
		} catch (NoSuchElementException e) {
			Assert.fail("No Element found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}


	public String getTextFromElement(By locator) {
		String text = null;
		try {
			text = getDriver().findElement(locator).getText();
		} catch (NoSuchElementException e) {
			Assert.fail("No Element found with this locator: " + locator.toString());
			e.printStackTrace();
		}
		return text;
	}

	public boolean isDisplayed(By locator) {return getDriver().findElement(locator).isDisplayed();}

	public boolean isEnablead(By locator) {
		return getDriver().findElement(locator).isEnabled();
	}

	public boolean isSelected(By locator) {
		return getDriver().findElement(locator).isSelected();
	}

	public void setValueToInputField(By locator, String value) {
		try {
			getDriver().findElement(locator).sendKeys(value);
		} catch (NoSuchElementException e) {
			Assert.fail("No Element found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}

	public String getAttribute(By locator, String value) {return getDriver().findElement(locator).getAttribute(value);}

	public void selectFromDropDown(By locator, String month) {
		Select monthDropDown = new Select(getDriver().findElement(locator));
		monthDropDown.selectByVisibleText(month);
	}

	public void selectFromDropDown(By locator, int index) {
		Select monthDropDown = new Select(getDriver().findElement(locator));
		monthDropDown.selectByIndex(index);
	}

	public static void switchToWindow(int index) {
		List<String> listOfWindows = new ArrayList<String>(getDriver().getWindowHandles());
		getDriver().switchTo().window(listOfWindows.get(index));
	}

	public static void switchToRootWindowCloseCurrentBrowser() {
		List<String> listOfWindows = new ArrayList<String>(getDriver().getWindowHandles());
		for (int i = 1; i < listOfWindows.size(); i++) {
			getDriver().switchTo().window(listOfWindows.get(i));
			getDriver().close();
		}
		getDriver().switchTo().window(listOfWindows.get(0));
	}

	public void autoComplete(By locator, By locator2,String searchKey, String choice )  {

		getDriver().findElement(locator).sendKeys(searchKey);
		List<WebElement> list = getDriver().findElements(locator2);
		for (WebElement element : list) {
			if (element.getText().contains(choice)) {
				element.click();
				break;
			}
		}
	}

	public void selectCurrentDate(By locator){
		SimpleDateFormat sdf = new SimpleDateFormat("d");
		Date date = new Date();
		String todayDate=sdf.format(date);
		List<WebElement> days=getDriver().findElements(locator);
		for (WebElement day:days){
			String expectedDay=day.getText();
			if (expectedDay.equals(todayDate)){
				day.click();
				break;
			}
		}
	}

	public void selectPreferredDate (String stringDate) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("d");
		SimpleDateFormat sdf3 = new SimpleDateFormat("MMM");
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy");
		Date date = sdf.parse(stringDate);
		String day = sdf2.format(date);
		String month = sdf3.format(date);
		String year = sdf4.format(date);
		System.out.println(month+day+year);

	}
	public static void mouseOver(By locator){
		WebElement element = getDriver().findElement(locator);
		Actions action = new Actions(getDriver());
		action.moveToElement(element).build().perform();
	}

	public static void switchToFrame (String value){
		getDriver().switchTo().frame(value);
	}

	public static void alertAccept () {
		getDriver().switchTo().alert().accept();
	}

	public static void alertDismiss () {
		getDriver().switchTo().alert().dismiss();
	}

	public static void alertGetText () {
		getDriver().switchTo().alert().getText();
	}

	public static void alertSendtext (String value) {
		getDriver().switchTo().alert().sendKeys(value);
	}
}


	/*public void clickOn(By locator) {
		try {
			getDriver().findElement(locator).click();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}

	public void sendText(By locator, String text) {
		try {
			getDriver().findElement(locator).sendKeys(text);
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}
	}

	public String getTextFromElement(By locator) {
		String text = null;
		try {
			text = getDriver().findElement(locator).getText();
		} catch (NoSuchElementException e) {
			Assert.fail("Element is not found with this locator: " + locator.toString());
			e.printStackTrace();
		}

		return text;
	}

	public void clickOnBrowserBackArrow() {getDriver().navigate().back();}

	public void clickOnBrowserForwardArrow() {getDriver().navigate().forward();}

	public void refreshBrowser() {getDriver().navigate().refresh();
	}*/



