package com.blazedemo.bal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Reserve {
    private WebDriver _webDriver;

    public Reserve(WebDriver webDriver){
        this._webDriver = webDriver;
    }

    public void ConfirmFlightTitle(){
        String title = this._webDriver.findElement(By.xpath("//div[@class='container']/h3")).getAttribute("textContent");
        System.out.println(title);
    }

    public void ChooseUnitedAirlines(){
        WebElement btn = this._webDriver.findElement(By.xpath("//table[@class='table']/tbody/tr[2]/td[1]/input[@class='btn btn-small']"));
        btn.click();
    }
}
