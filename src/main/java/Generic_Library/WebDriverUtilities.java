package Generic_Library;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
	    //1.Handle dropdown
	    public void dropDown(WebElement ele,String text) {
	    Select s = new Select(ele);
	    s.selectByVisibleText(text);
	    }
	    
	    //2.Handling mouse over
	  	public void mouseOvering(WebDriver driver,WebElement ele) {
	  	Actions a = new Actions(driver);
	    a.moveToElement(ele).perform();
	  	}
	  	
	    //3.Handling rightClick
	  	public void rightClick(WebDriver driver,WebElement ele) {
	  	Actions a = new Actions(driver);
	  	a.contextClick(ele).perform();
	  	}
	  		
	    //4.Handling doubleClick
		public void doubleClick(WebDriver driver,WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
		}
	    
		//5.Handling drag and drop
		public void dragAndDrop(WebDriver driver,WebElement ele1,WebElement ele2 ) {
		Actions a =new Actions(driver);
		a.dragAndDrop(ele1, ele2).perform();
		}
		
		//6.Handling frame
		public void frames(WebDriver driver,String value) {
		driver.switchTo().frame(value);
		}
		
		//8.Handling default content
		public void frames(WebDriver driver) {
		driver.switchTo().defaultContent();	
		}
		
		//9.Handling child browser
		public void childBrowser(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b: child) {
			driver.switchTo().window(b);
		  }
	    }
		
		//10.Handle Scrolling
        public void scrolling(WebDriver driver,WebElement ele) {
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();", ele);
        }
        
        //11.Handling popup
        public void popup(WebDriver driver) {
        driver.switchTo().alert().accept();
        	
        }
        	
}
