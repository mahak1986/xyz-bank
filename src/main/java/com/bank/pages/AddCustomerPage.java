package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class AddCustomerPage extends Utility {

    By clickOnAddCustomerButton = (By.xpath("//button[normalize-space()='Add Customer']"));

    public void clickOnAddCustomerButton() {

        clickOnElement(clickOnAddCustomerButton);
    }

    By enterFirstName = (By.xpath("//input[@placeholder='First Name']"));

    public void enterFirstName(String firstName) {
        sendTextToElement(enterFirstName, firstName);
    }

    By enterLastName = (By.xpath("//input[@placeholder='Last Name']"));

    public void enterLastName(String lastName) {
        sendTextToElement(enterLastName, lastName);
    }

    By enterPostcode = (By.xpath("//input[@placeholder='Post Code']"));

    public void enterPostcode(String postCode) {
        sendTextToElement(enterPostcode, postCode);
    }

    By clickOnAddCustomerButtonOnAddCustomerPage = (By.xpath("//button[@type='submit']"));

    public void clickOnAddCustomerButtonOnAddCustomerPage() {
        clickOnElement(clickOnAddCustomerButtonOnAddCustomerPage);
    }

    //By verifyCustomerAddedSuccessfullyText =

    public void acceptAlert() {

        driver.switchTo().alert().accept(); //Click on Ok Button
    }
}

