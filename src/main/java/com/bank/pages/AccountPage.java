package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage extends Utility {

    By depositButton = (By.xpath("//button[normalize-space()='Deposit']"));

    public void depositButton() {

        mouseHoverToElementAndClick(depositButton);
    }

    By deposit100PoundsAmount = (By.xpath("//input[@placeholder='amount']"));

    public void deposit100PoundsAmount(String amount) {

        sendTextToElement(deposit100PoundsAmount, amount);
    }

    By clickOnDepositButtonPostEnteringAmount = (By.xpath("//button[@type='submit']"));

    public void clickOnDepositButtonPostEnteringAmount() {
        clickOnElement(clickOnDepositButtonPostEnteringAmount);
    }

    By verifyDepositSuccessfulText = By.xpath("//span[contains(text(),'Deposit Successful')]");

    public String verifyDepositSuccessfulText() {
        return getTextFromElement(verifyDepositSuccessfulText);
    }

    By clickOnWithdrawalButton = (By.xpath("//button[normalize-space()='Withdrawl']"));
    public void clickOnWithdrawalButton() {
        mouseHoverToElementAndClick(clickOnWithdrawalButton);
    }
    By clickOnWithdrawalTextField = (By.xpath("//input[@placeholder='amount']"));
    public void clickOnWithdrawalTextField(){
        clickOnElement(clickOnWithdrawalTextField);
    }
    By withdraw50Pounds = (By.xpath("(//input[@placeholder='amount'])[1]"));

    public void withdraw50Pounds(String amount1) {
        sendTextToElement(withdraw50Pounds, amount1);
    }


    By clickOnWithdrawButtonPostEnteringWithdrawAmount = (By.xpath("//button[normalize-space()='Withdraw']"));
     public void clickOnWithdrawButtonPostEnteringWithdrawAmount(){
         clickOnElement(clickOnWithdrawButtonPostEnteringWithdrawAmount);
     }

     By verifyTransactionSuccessfulText = By.xpath("//span[contains(text(),'Transaction successful')]");
    public String verifyTransactionSuccessfulText() {
        return getTextFromElement(verifyTransactionSuccessfulText);
    }

}
