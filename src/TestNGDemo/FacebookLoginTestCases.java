package TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FacebookLoginTestCases {
	
	@BeforeTest
	public void PurchageLaptop() {
		
		System.out.println("Purchaging Laptop");
		
	}
	
	@BeforeMethod
	public void ConnectDB() {
		
		System.out.println("Connecting VPN");
		
	}

	@Test
	public static void TC01_LoginFacebookTest() {
		
		
		System.out.println("TC01_LoginFacebookTest");
		
		String ActualTitle = "Facebook";
		
		String ExpectedTitle ="Facebook";
		
		
		Assert.assertEquals(ActualTitle,ExpectedTitle);
		
	}
	
	
	
	@AfterMethod
	public void DisconnectDB() {
		
		System.out.println("Disconnecting VPN");
		
	}
	
	@AfterTest
	public void SellLaptop() {
		
		System.out.println("Selling Laptop");
		
	}
	
	@Test
    public void TC02_UploadFotoInFacebookTest() {
		
		System.out.println("TC02_UploadFotoInFacebookTest");
		
		String ActualMsg ="Foto Uploaded Successfully";
		String ExpectedMsg ="Foto Uploaded Successfully";
		
		Assert.assertEquals(ActualMsg, ExpectedMsg);
		
	}
	
	@Test
    public void TC03_CommentFacebookTest() {
		
		System.out.println("TC02_UploadFotoInFacebookTest");
		
		String ActualMsg ="Foto Uploaded Successfully";
		String ExpectedMsg ="Foto Uploaded Successfully";
		
		Assert.assertEquals(ActualMsg, ExpectedMsg);
		
	}
	

}
