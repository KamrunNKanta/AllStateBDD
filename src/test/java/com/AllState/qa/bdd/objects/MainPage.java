package com.AllState.qa.bdd.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	public MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//div[@class='-oneX-header-top-menu-btn-hitbox'])[5]")
	public WebElement payBill;
	@FindBy(id = "pay-a-bill-paymentSelect")
	public WebElement selectPhoneNumber;
	@FindBy(xpath = "//input[@id='pay-a-bill-phoneNo']")
	public WebElement phoneNumberInput;
	@FindBy(xpath = "//input[@id='pay-a-bill-DOB']")
	public WebElement dateBirth;
	@FindBy(xpath="//button[@id='pay-a-bill-submitButton']")
	public WebElement payNow;

}
