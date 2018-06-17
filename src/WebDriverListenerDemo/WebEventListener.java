package WebDriverListenerDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class WebEventListener implements WebDriverEventListener {

	@Override
	public void afterAlertAccept(WebDriver arg0) {
		
		
	}

	@Override
	public void afterAlertDismiss(WebDriver arg0) {
		
		
	}

	@Override
	public void afterChangeValueOf(WebElement element, WebDriver arg1, CharSequence[] arg2) {
		System.out.println("Element value changed to: " + element.toString());
		
	}

	@Override
	public void afterClickOn(WebElement element, WebDriver arg1) {
		
		System.out.println("Clicked on: " + element.toString());
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Found Element By : " + by.toString());
	}

	@Override
	public void afterNavigateBack(WebDriver arg0) {
		
		
	}

	@Override
	public void afterNavigateForward(WebDriver driver) {
		System.out.println("Navigated forward to next page");
	}

	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		
		
	}

	@Override
	public void afterNavigateTo(String url, WebDriver arg1) {
		System.out.println("Navigated to:'" + url + "'");
		
	}

	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		
		
	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
	}

	@Override
	public void beforeChangeValueOf(WebElement element, WebDriver arg1, CharSequence[] arg2) {
		
		System.out.println("Value of the:" + element.toString()
		+ " before any changes made");
	}

	@Override
	public void beforeClickOn(WebElement element, WebDriver arg1) {
		System.out.println("Trying to click on: " + element.toString());
	}

	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Trying to find Element By : " + by.toString());
	}

	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		System.out.println("Navigating back to previous page");	
	}

	@Override
	public void beforeNavigateForward(WebDriver driver) {
		System.out.println("Navigating forward to next page");
	}


	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		
		
	}

	@Override
	public void beforeNavigateTo(String url, WebDriver arg1) {
		System.out.println("Before navigating to: '" + url + "'");
		
	}

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
	}

	@Override
	public void onException(Throwable error, WebDriver driver) {
		System.out.println("Exception occured: " + error);
	}
}
	
	
	
	