package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class BankManagerLoginPage extends Utility {

    By clickOnOpenAccountButton = (By.xpath("//button[normalize-space()='Open Account']"));

    public void clickOnOpenAccountButton() {
        clickOnElement(clickOnOpenAccountButton);
    }

    By clickOnCustomerNameField = (By.xpath("//select[@id='userSelect']"));
    public void clickOnCustomerNameField(){
        clickOnElement(clickOnCustomerNameField);
    }
    By selectCustomerName = (By.xpath("//select[@id='userSelect']"));
    public void selectCustomerName(String name){
        selectByVisibleText(selectCustomerName,name);
    }

    By clickOnCurrencyField = By.xpath("//select[@id='currency']");
    public void clickOnCurrencyField(){
        clickOnElement(clickOnCurrencyField);
    }
    By selectCurrency = By.xpath("//select[@id='currency']");
    public void selectCurrency(String currency){
        selectByVisibleText(selectCurrency,currency);
    }
     By clickOnProcessButton = (By.xpath("//button[normalize-space()='Process']"));
    public void clickOnProcessButton(){
        clickOnElement(clickOnProcessButton);
    }


    public void acceptAlert(){
    driver.switchTo().alert().accept();
    }

}
