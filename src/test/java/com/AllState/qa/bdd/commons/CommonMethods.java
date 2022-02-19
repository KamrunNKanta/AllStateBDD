package com.AllState.qa.bdd.commons;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CommonMethods {
	public void click(WebElement element) {
		element.click();
	}

	public void dropDownSelectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}
	public String getText(WebElement element) {
		System.out.println(element.getText());
		return element.getTagName();	
	}
	
	public void enterText(WebElement element, String value) {
		element.sendKeys(value);
	}
	
	
}
