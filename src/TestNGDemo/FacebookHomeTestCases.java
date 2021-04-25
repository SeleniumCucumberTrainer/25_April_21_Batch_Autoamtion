package TestNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FacebookHomeTestCases {
	
	
	@Test
	public void TC03_FacebookPost() {
		
		String ActualPostSuccessText ="Post successful";
		String ExpectedPostSuccessText ="Posts successful";
		
		Assert.assertEquals(ExpectedPostSuccessText, ActualPostSuccessText);
		
	}

}
