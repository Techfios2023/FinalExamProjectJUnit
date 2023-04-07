package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import util.BrowserFactory;

public class MainPage extends BrowserFactory {

	public static String addNewItem = "Sudip's new item " + randomnumber( );
	
	
	@FindBy(xpath = "//input[@name='allbox']")
	WebElement TOGGLEDBOX_CLICKALL_BOX;
	@FindBy(xpath = "//input[@name='data']")
	WebElement ADD_NEW_ITEM;
	@FindBy(xpath = "//input[@value='Add']")
	WebElement CLICK_ON_ADD_BTN;
	@FindBy(xpath = "//*[@id=\"todos-content\"]/form/ul")
	List<WebElement> ElementCounts;
	@FindBy(xpath = "//*[contains(text(),'Sudip')]")
	WebElement CHECK_BOX_BTN;
	@FindBy(xpath = "//input[@value='Remove']")
	WebElement REMOVE_BTN;
	
	List<WebElement> CHECK_BOX = driver.findElements(By.xpath("//*[@type='checkbox']"));

	
	

	public MainPage() {
		PageFactory.initElements(driver, this);
	}

	public String addAndRemoveItem() {
		ADD_NEW_ITEM.sendKeys(addNewItem);
		CLICK_ON_ADD_BTN.click();
		return toString();

	}

	public boolean ToggleAllCheckBox() {
		
		ADD_NEW_ITEM.sendKeys(addNewItem );
		CLICK_ON_ADD_BTN.click();
		TOGGLEDBOX_CLICKALL_BOX.click();
		for (int i = 0; i < CHECK_BOX.size(); i++) {

			String checkbox = CHECK_BOX.get(i).getAttribute("selected");

			System.out.println("attribut value Selected of Check-box is : " + checkbox);

			if (CHECK_BOX.get(i).getAttribute("selected").equals("null")) {

				CHECK_BOX.get(i).click();
			}
		}
		return true;

	}

	public boolean deleteAllEntry() {
		ADD_NEW_ITEM.sendKeys(addNewItem);
		CLICK_ON_ADD_BTN.click();
		TOGGLEDBOX_CLICKALL_BOX.click();
		REMOVE_BTN.click();
	//	ElementCounts.size();
		int afterDelete = ElementCounts.size();
		afterDelete = 1;
		return true;
	}

}
