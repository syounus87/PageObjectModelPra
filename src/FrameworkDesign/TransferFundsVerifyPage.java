package FrameworkDesign;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsVerifyPage {
	
	@FindBy(id="btn_submit")
	private WebElement submitBtn;
	
	public TransferFundsVerifyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickSubmit() {
		
		submitBtn.click();
	}

}
