package com.blazedemo.main;

import com.blazedemo.bal.Purchase;
import com.blazedemo.bal.Reserve;
import com.blazedemo.bal.Travel;
import com.blazedemo.common.WebDriverHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Blaze {
    private static WebDriver _webDriver;
    private static Travel _travel;
    private static Reserve _reserve;
    private static Purchase _purchase;


    public static  void SetUp(){
        System.setProperty("webdriver.chrome.driver", "D:\\Susen\\Selenium drivers\\chromedriver.exe");
        _webDriver = new ChromeDriver();
        _webDriver.manage().window().maximize();
        WebDriverHelper.loadNewWindow("http://blazedemo.com", _webDriver);
        WebDriverHelper.wait(_webDriver);

        _travel = new Travel(_webDriver);
        _reserve = new Reserve(_webDriver);
        _purchase = new Purchase(_webDriver);

    }
    public static void main(String[] args) {
        SetUp();

        //choose departure city
        _travel.ChooseDepartureCity("Portland");

        //choose destination city
        _travel.ChooseDestinationCity("Cairo");

        //find flights
        _travel.FindFlights();

        //confirm flight title
        _reserve.ConfirmFlightTitle();

        //choose united airlines
        _reserve.ChooseUnitedAirlines();

        //check airline name
        _purchase.CheckAirlineName();

        //check flight number
        _purchase.CheckFlightNumber();

        //check price
        _purchase.CheckPrice();

        //check misc fees
        _purchase.CheckMiscFees();

        //check total cost
        _purchase.CheckTotalCost();

        //set name
        _purchase.SetName("John Wick");

        //set address
        _purchase.SetAddress("Kumaripati");

        //set city
        _purchase.SetCity("Lalitpur");

        //set state
        _purchase.SetState("State 3");

        //set zip code
        _purchase.SetZipCode("977");

        //select card type
        _purchase.SelectCardType("amex");

        //set credit card number
        _purchase.SetCreditCardNumber("465789315");

        //set credit card month
        _purchase.SetCreditCardMonth("14");

        //set credit card year
        _purchase.SetCreditCardYear("2020");

        //set name on card
        _purchase.SetNameOnCard("MR. John Wick");

        //remember me
        _purchase.RememberMe();

        //purchase flight
        _purchase.PurchaseFlight();

        //dispose
        _webDriver.close();
        _webDriver.quit();

    }



}
