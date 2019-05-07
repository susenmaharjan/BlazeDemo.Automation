package com.blazedemo.bal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Confirmation {
    private WebDriver _webDriver;

    public Confirmation(WebDriver _webDriver){
        this._webDriver= _webDriver;
    }

    public long getId(){
        WebElement idElement = _webDriver.findElement(By.xpath("//table[@class='table']/tbody/tr[1]/td[2]"));
        String result = idElement.getAttribute("textContent");
        System.out.println("Result: "+result);
        return  Long.parseLong(result);
    }


}
