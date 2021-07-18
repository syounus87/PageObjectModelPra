package dataDrivenTestScripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import FrameworkDesign.AccountSummaryPage;
import FrameworkDesign.LoginPage;
import FrameworkDesign.TransferFundsConfirmationPage;
import FrameworkDesign.TransferFundsPage;
import FrameworkDesign.TransferFundsVerifyPage;
import utils.GenericMethods;

public class VerifyFundsTransferTest extends Base {

	@Test
	public void VerifyFundsTransfer() throws IOException {
		LoginPage lp = new LoginPage(driver);
		AccountSummaryPage acc = new AccountSummaryPage(driver);
		TransferFundsPage tf = new TransferFundsPage(driver);
		TransferFundsVerifyPage tfv = new TransferFundsVerifyPage(driver);
		TransferFundsConfirmationPage tfc = new TransferFundsConfirmationPage(driver);

		String[][] data = GenericMethods.getData("C:\\Users\\Syed\\Downloads\\TestData.xlsx", "Sheet1");

		for (int i = 1; i < data.length; i++) {

			lp.applicationLogin(data[i][0], data[i][1]);
			acc.clickTransferFunds();
			tf.doFundTransfer(data[i][2], data[i][3]);
			tfv.clickSubmit();
			String ActualMsg = tfc.getConfText();
			String ExpectedMsg = data[i][4];
			Assert.assertEquals(ActualMsg, ExpectedMsg);
			tfc.logoutFromApp();
			driver.get("http://zero.webappsecurity.com/login.html");
		}

	}
}
