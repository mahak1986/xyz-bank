package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
   By clickOnBankManagerLoginButton = (By.xpath("//button[normalize-space()='Bank Manager Login']"));
     public void clickOnBankManagerLoginButton(){

         clickOnElement(clickOnBankManagerLoginButton);
     }


}
