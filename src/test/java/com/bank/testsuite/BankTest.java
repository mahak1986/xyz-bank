package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Date;

public class BankTest extends BaseTest {
    HomePage homePage = new HomePage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    AccountPage accountPage = new AccountPage();
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    OpenAccountPage openAccountPage = new OpenAccountPage();


    @Test
    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLoginButton();
        Thread.sleep(2000);
        addCustomerPage.clickOnAddCustomerButton();
        // Get the current system date and time using java.util.Date
        Date currentDate = new Date();
        addCustomerPage.enterFirstName("Mahak");
        Thread.sleep(2000);
        addCustomerPage.enterLastName("Agarwal");
        Thread.sleep(2000);
        addCustomerPage.enterPostcode("HA1 1RQ");
        Thread.sleep(2000);
        addCustomerPage.clickOnAddCustomerButtonOnAddCustomerPage();
        Thread.sleep(2000);
        addCustomerPage.acceptAlert();
        Thread.sleep(2000);
    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        bankManagerShouldAddCustomerSuccessfully();
        Thread.sleep(2000);
        bankManagerLoginPage.clickOnOpenAccountButton();
        Thread.sleep(2000);
        bankManagerLoginPage.clickOnCustomerNameField();
        bankManagerLoginPage.selectCustomerName("Mahak Agarwal");
        Thread.sleep(2000);
        bankManagerLoginPage.clickOnCurrencyField();
        Thread.sleep(2000);
        bankManagerLoginPage.selectCurrency("Pound");
        Thread.sleep(2000);
        bankManagerLoginPage.clickOnProcessButton();
        Thread.sleep(2000);
        bankManagerLoginPage.acceptAlert();
        Thread.sleep(2000);

    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        bankManagerShouldOpenAccountSuccessfully();
        openAccountPage.homeTabOptionOnOpenAccountPage();
        customerLoginPage.clickOnCustomersButton();
        customerLoginPage.clickOnYourNameTextField();
        customerLoginPage.selectCustomerName1("Mahak Agarwal");
        Thread.sleep(2000);
        customerLoginPage.clickOnLoginButton();
        Thread.sleep(2000);
        String expected = "Logout";
        Assert.assertEquals(customerLoginPage.verifyLogoutText(), expected, "Error Message");
        Thread.sleep(2000);
        String expected1 = "Mahak Agarwal";
        Assert.assertEquals(customerLoginPage.verifySelfName(), expected1, "Error Message");

        customerLoginPage.clickOnLogoutButton();

    }

    @Test
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        bankManagerShouldOpenAccountSuccessfully();
        openAccountPage.homeTabOptionOnOpenAccountPage();
        customerLoginPage.clickOnCustomersButton();
        customerLoginPage.clickOnYourNameTextField();
        customerLoginPage.selectCustomerName1("Mahak Agarwal");
        Thread.sleep(2000);
        customerLoginPage.clickOnLoginButton();
        accountPage.depositButton();
        Thread.sleep(6000);
        accountPage.deposit100PoundsAmount("100");
        accountPage.clickOnDepositButtonPostEnteringAmount();
        Thread.sleep(6000);
        String expected2 = "Deposit Successful";
        Assert.assertEquals(accountPage.verifyDepositSuccessfulText(), expected2, "Error Message");
    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
        customerShouldDepositMoneySuccessfully();
        Thread.sleep(4000);
        accountPage.clickOnWithdrawalButton();
        Thread.sleep(4000);
        accountPage.clickOnWithdrawalTextField();
        Thread.sleep(4000);
        accountPage.withdraw50Pounds("50");
        Thread.sleep(4000);
        accountPage.clickOnWithdrawButtonPostEnteringWithdrawAmount();
        Thread.sleep(4000);
        String expected3 = "Transaction successful";
        Assert.assertEquals(accountPage.verifyTransactionSuccessfulText(), expected3, "Error Message");
    }

}
