package com.blazedemo.bal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Travel {

    private WebDriver _webDriver;

    private Select _departureCities;
    private Select _destinationCities;

    public Travel(WebDriver webDriver){
        this._webDriver=webDriver;
        this._departureCities= new Select(this._webDriver.findElement(By.name("fromPort")));
        this._destinationCities= new Select(this._webDriver.findElement(By.name("toPort")));
    }

    public void ChooseDepartureCity(String city){
        this._departureCities.selectByValue(city);
    }

    public void ChooseDestinationCity(String city){
        this._destinationCities.selectByValue(city);
    }

    public void FindFlights(){
        WebElement btn = this._webDriver.findElement(By.xpath("//div[@class='container']/input[@class='btn btn-primary']"));
        btn.click();
    }



}
