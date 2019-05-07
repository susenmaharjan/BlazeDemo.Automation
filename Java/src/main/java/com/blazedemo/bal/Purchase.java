package com.blazedemo.bal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Purchase {
    private WebDriver _webDriver;
    private String _airlineName;
    private String _flightNumber;
    private String _price;
    private String _miscFees;
    private String _totalCost;

    public Purchase(WebDriver webDriver) {
        this._webDriver = webDriver;
    }

    public void CheckAirlineName() {
        String airlineName = this._webDriver.findElement(By.xpath("//div[@class='container']/p[1]")).getAttribute("textContent");
        this._airlineName = airlineName;
    }

    public String GetAirlineName() {
        return this._airlineName;
    }

    public void CheckFlightNumber() {
        String flightNumber = this._webDriver.findElement(By.xpath("//div[@class='container']/p[2]")).getAttribute("textContent");
        this._flightNumber = flightNumber;
    }

    public String GetFlightNumber() {
        return this._flightNumber;
    }

    public void CheckPrice() {
        String price = this._webDriver.findElement(By.xpath("//div[@class='container']/p[3]")).getAttribute("textContent");
        this._price = price;
    }

    public String GetPrice() {
        return this._price;
    }

    public void CheckMiscFees() {
        String miscFees = this._webDriver.findElement(By.xpath("//div[@class='container']/p[4]")).getAttribute("textContent");
        this._miscFees = miscFees;
    }

    public String GetMiscFees(){
        return  this._miscFees;
    }

    public void CheckTotalCost() {
        String totalCost = this._webDriver.findElement(By.xpath("//div[@class='container']/p[5]")).getAttribute("textContent");
        this._totalCost = totalCost;
    }

    public String GetTotalCost(){
        return this._totalCost;
    }

    public void SetName(String name) {
        this._webDriver.findElement(By.id("inputName")).sendKeys(name);
    }

    public void SetAddress(String address) {
        this._webDriver.findElement(By.id("address")).sendKeys(address);
    }

    public void SetCity(String city) {
        this._webDriver.findElement(By.id("city")).sendKeys(city);
    }

    public void SetState(String state) {
        this._webDriver.findElement(By.id("state")).sendKeys(state);
    }

    public void SetZipCode(String zipCode) {
        this._webDriver.findElement(By.id("zipCode")).sendKeys(zipCode);
    }

    public void SelectCardType(String cardType) {
        Select cardTypes = new Select(this._webDriver.findElement(By.id("cardType")));
        cardTypes.selectByValue(cardType);
    }

    public void SetCreditCardNumber(String creditCardNumber) {
        WebElement creditCardNumberElement = this._webDriver.findElement(By.id("creditCardNumber"));
        creditCardNumberElement.clear();
        creditCardNumberElement.sendKeys(creditCardNumber);
    }

    public void SetCreditCardMonth(String creditCardMonth) {
        WebElement creditCardMonthElement = this._webDriver.findElement(By.id("creditCardMonth"));
        creditCardMonthElement.clear();
        creditCardMonthElement.sendKeys(creditCardMonth);
    }

    public void SetCreditCardYear(String creditCardYear) {
        WebElement creditCardYearElement = this._webDriver.findElement(By.id("creditCardYear"));
        creditCardYearElement.clear();
        creditCardYearElement.sendKeys(creditCardYear);
    }

    public void SetNameOnCard(String nameOnCard) {
        WebElement nameOnCardElement = this._webDriver.findElement(By.id("nameOnCard"));
        nameOnCardElement.clear();
        nameOnCardElement.sendKeys(nameOnCard);
    }

    public void RememberMe() {
        this._webDriver.findElement(By.id("rememberMe")).click();
    }

    public void PurchaseFlight() {
        WebElement submitBtn = this._webDriver.findElement(By.xpath("//input[@type='submit']"));
        submitBtn.click();
    }
}
