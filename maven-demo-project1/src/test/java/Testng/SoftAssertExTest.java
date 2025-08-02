package Testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExTest {

	@Test
	public void ml()
	{
		System.out.println("step1");
		System.out.println("step2");
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(true, true);
		System.out.println("step3");
		System.out.println("step4");
		soft.assertAll();
	}
}
