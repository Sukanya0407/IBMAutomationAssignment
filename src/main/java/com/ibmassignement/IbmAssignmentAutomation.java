package com.ibmassignement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IbmAssignmentAutomation {

	public static void main(String[] args) {

		ChromeOptions option = new ChromeOptions();
		option.addArguments("--start-maximized");

		WebDriver wd = new ChromeDriver(option);
		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(30));
		wd.get("https://www.ibm.com/us-en");

		By HybridpathLocator = By.xpath("//c4d-megamenu-top-nav-menu[@menu-label=\"Hybrid Cloud\"]");

	//	WebElement HybridMenu = wd.findElement(HybridpathLocator);
		WebElement HybridMenu=wait.until(ExpectedConditions.visibilityOfElementLocated(HybridpathLocator));
		SearchContext HybridMenuShadow = HybridMenu.getShadowRoot();
		By MenuLocator = By.cssSelector("a");
		WebElement MenuElement = HybridMenuShadow.findElement(MenuLocator);
		MenuElement.click();

		By ItinfrastructureLocator = By.xpath("//c4d-megamenu-category-heading[@title=\"IT infrastructure\"]");
		WebElement ItinfrastructureButton = wait
				.until(ExpectedConditions.visibilityOfElementLocated(ItinfrastructureLocator));
		ItinfrastructureButton.click();

	}

}
