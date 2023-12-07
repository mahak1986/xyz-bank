package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.By;

public class OpenAccountPage extends Utility {
    By homeTabOptionOnOpenAccountPage = By.xpath("//button[@class='btn home']");
    public void homeTabOptionOnOpenAccountPage(){
        clickOnElement(homeTabOptionOnOpenAccountPage);
    }

}
