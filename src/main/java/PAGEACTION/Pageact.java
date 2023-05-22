package PAGEACTION;

import org.openqa.selenium.WebElement;

import BINDING.Hooks;

public class Pageact extends Hooks {

	// click

	public static void CliconEkement(WebElement ele) {

		ele.click();

	}

	// sendkeys

	public static void EnterText(WebElement ele, String Searchtext) {

		ele.sendKeys(Searchtext);

	}

}
