package com.blazedemo.main;

import com.blazedemo.bal.Confirmation;
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
    private static Confirmation _confirmation;



    public static void SetUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Susen\\Selenium drivers\\chromedriver.exe");
        _webDriver = new ChromeDriver();
        _webDriver.manage().window().maximize();
        WebDriverHelper.loadNewWindow("http://blazedemo.com", _webDriver);
        WebDriverHelper.wait(_webDriver);

        _travel = new Travel(_webDriver);
        _reserve = new Reserve(_webDriver);
        _purchase = new Purchase(_webDriver);
        _confirmation = new Confirmation(_webDriver);

    }

    public static void main(String[] args) {
        SetUp();

        //choose departure city
        _travel.ChooseDepartureCity("Portland");
        Wait();

        //choose destination city
        _travel.ChooseDestinationCity("Cairo");
        Wait();

        //find flights
        _travel.FindFlights();
        Wait();

        //confirm flight title
        _reserve.ConfirmFlightTitle();
        Wait();

        //choose united airlines
        _reserve.ChooseUnitedAirlines();
        Wait();

        //check airline name
        _purchase.CheckAirlineName();
        Wait();

        //check flight number
        _purchase.CheckFlightNumber();
        Wait();

        //check price
        _purchase.CheckPrice();
        Wait();

        //check misc fees
        _purchase.CheckMiscFees();
        Wait();

        //check total cost
        _purchase.CheckTotalCost();
        Wait();

        //set name
        _purchase.SetName("John Wick");
        Wait();

        //set address
        _purchase.SetAddress("Kumaripati");
        Wait();

        //set city
        _purchase.SetCity("Lalitpur");
        Wait();

        //set state
        _purchase.SetState("State 3");
        Wait();

        //set zip code
        _purchase.SetZipCode("977");
        Wait();

        //select card type
        _purchase.SelectCardType("amex");
        Wait();

        //set credit card number
        _purchase.SetCreditCardNumber("465789315");
        Wait();

        //set credit card month
        _purchase.SetCreditCardMonth("14");
        Wait();

        //set credit card year
        _purchase.SetCreditCardYear("2020");
        Wait();

        //set name on card
        _purchase.SetNameOnCard("MR. John Wick");
        Wait();

        //remember me
        _purchase.RememberMe();
        Wait();

        //purchase flight
        _purchase.PurchaseFlight();
        Wait();

        //get purchase id
        long id = _confirmation.getId();
        System.out.println("ID: " + id);
        Wait();

        //dispose
        _webDriver.close();
        _webDriver.quit();

    }


    public static void Wait(){
        WebDriverHelper.wait(_webDriver);
    }
}
