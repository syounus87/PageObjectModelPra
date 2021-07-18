package com.webappsecurity.zero.testScripts;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.webappsecurity.zero.Pages.AccountSummaryPage;
import com.webappsecurity.zero.Pages.LoginPage;
import com.webappsecurity.zero.Pages.TransferFundsConfirmationPage;
import com.webappsecurity.zero.Pages.TransferFundsPage;
import com.webappsecurity.zero.Pages.TransferFundsVerifyPage;

public class verifyFundTransferTest extends Base {


	

	@Test
	public void verifyFundTransfer() {

		LoginPage lp = new LoginPage(driver);
		AccountSummaryPage acc = new AccountSummaryPage(driver);
		TransferFundsPage tf = new TransferFundsPage(driver);
		TransferFundsVerifyPage tfv = new TransferFundsVerifyPage(driver);
		TransferFundsConfirmationPage tfc = new TransferFundsConfirmationPage(driver);

		lp.applicationLogin("username", "password");
		acc.clickTransferFunds();
		tf.doFundTransfer("100", "Fund Transfer of $100");
		tfv.clickSubmit();
		String ActualMsg = tfc.getConfText();
		String ExpectedMsg = "You successfully submitted your transaction.";
		Assert.assertEquals(ActualMsg, ExpectedMsg);

	}

	
	}

