package test;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.MainPage;
import util.BrowserFactory;

public class MainPageTest extends BrowserFactory {
	
	MainPage mainpage;
	
	
	
	public MainPageTest() {
		super();
	}
	@Before
	public void setUp() {
		
	init();
	}
	
	@Test
public void AddAndRemoveItemTest() {
		mainpage.addAndRemoveItem();
	
		
	}
	@Test
	public void toggleAllCheckBoxTest() {
		mainpage = new MainPage();
		Assert.assertTrue(mainpage.ToggleAllCheckBox());
		
	}
	
	
	@Test
	public void validateListedItemsAreDeletedWhenToggleAllIsOn() {
		mainpage = new MainPage();
		Assert.assertTrue(mainpage.deleteAllEntry());
		System.out.println("Deleted all the entry succefully");
		}
	
	
	@AfterClass
	public static   void tearDown() {
		driver.close();
	 	driver.quit();
	}
}
