package PAGE;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BINDING.Hooks;
import PAGEACTION.Pageact;



public class nykaahomebage extends Hooks {

 //public static WebDriver driver;



 // locator

 public static WebElement SearchArea = driver

  .findElement(By.xpath("//*[@id=\"headerMenu\"]/div[2]/div[1]/div/form/input"));

 public static String searchText = "watches";



 public static void clickInElement()



 {



 // nykaahomebage.clickInElement(SearchArea);

    Pageact.CliconEkement(SearchArea);

 Pageact.EnterText(SearchArea, searchText);



 }



}

