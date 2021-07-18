package FrameworkDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id = "user_login")
	private WebElement uName;

	@FindBy(id = "user_password")
	private WebElement pass;

	@FindBy(name = "submit")
	private WebElement signIn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public void applicationLogin(String loginName, String loginPassword) {
		
		uName.sendKeys(loginName);
		pass.sendKeys(loginPassword);
		signIn.click();
	}

}
