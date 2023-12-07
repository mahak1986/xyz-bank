package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class CustomerLoginPage extends Utility {

    By clickOnCustomersButton = (By.xpath("//button[normalize-space()='Customer Login']"));

    public void clickOnCustomersButton() {
        clickOnElement(clickOnCustomersButton);
    }

    By clickOnYourNameTextField = (By.xpath("//select[@id='userSelect']"));

    public void clickOnYourNameTextField() {
        clickOnElement(clickOnYourNameTextField);
    }

    By selectCustomerName1 = (By.xpath("//select[@id='userSelect']"));

    public void selectCustomerName1(String customerName) {
        selectByVisibleText(selectCustomerName1, customerName);
    }

    By clickOnLoginButton = (By.xpath("//button[normalize-space()='Login']"));

    public void clickOnLoginButton() {
        clickOnElement(clickOnLoginButton);
    }

    By verifyLogoutText = (By.cssSelector(".btn.logout"));

    public String verifyLogoutText() {
        return getTextFromElement(verifyLogoutText);
    }

    By clickOnLogoutButton = (By.xpath("//button[normalize-space()='Logout']"));

    public void clickOnLogoutButton() {
        clickOnElement(clickOnLogoutButton);
    }

    By verifySelfName = (By.xpath("//span[@class='fontBig ng-binding']"));

    public String verifySelfName() {
        return getTextFromElement(verifySelfName);
    }


}
