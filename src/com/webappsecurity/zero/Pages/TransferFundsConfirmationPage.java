package com.webappsecurity.zero.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferFundsConfirmationPage {
	
	@FindBy(css="#transfer_funds_content > div > div > div.alert.alert-success")
	private WebElement confMsgBox;
	
	

	public TransferFundsConfirmationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	public String getConfText() {
		
		String confMsg = confMsgBox.getText();
		return confMsg;
	}

}
