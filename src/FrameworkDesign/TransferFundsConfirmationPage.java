package FrameworkDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsConfirmationPage {

	@FindBy(css = "#transfer_funds_content > div > div > div.alert.alert-success")
	private WebElement confMsgBox;

	@FindBy(css = "#settingsBox > ul > li:nth-child(3) > a")
	private WebElement username;

	@FindBy(id = "logout_link")
	private WebElement logout;

	public TransferFundsConfirmationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public String getConfText() {

		String confMsg = confMsgBox.getText();
		return confMsg;
	}

	public void logoutFromApp() {
		username.click();
		logout.click();

	}

}
