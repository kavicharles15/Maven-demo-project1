package Testng;

import org.testng.annotations.Test;

public class Sample2Test {

	@Test
	public void product()
	{
		System.out.println("protect created");
	}
	@Test(enabled = true)
	public void productmodifier() 
	{
		System.out.println("product modified");
	}
	@Test(enabled = false)
	public void deleteProduc() {
		System.out.println("product deleted");
	}
}
