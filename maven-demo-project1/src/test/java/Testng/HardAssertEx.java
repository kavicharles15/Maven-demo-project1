package Testng;

import org.testng.annotations.Test;

import org.testng.Assert;

public class HardAssertEx {

	@Test
	public void ml()
       {   
		System.out.println("Step1");
		System.out.println("Step2");
		Assert.assertEquals("A", "A","Assert iS FAIL");
		System.out.println("Assert is PASS");
		System.out.println("Step3");
		System.out.println("Step4");
		
		
		}
	
	@Test
	public void m2()
	{
		int ExpData =10;
		int ActData=10;
		Assert.assertEquals( ActData,  ExpData);
	}
}
