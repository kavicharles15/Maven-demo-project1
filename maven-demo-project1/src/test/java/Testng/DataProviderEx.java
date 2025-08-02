package Testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderEx {
@Test(dataProvider="getData")
	public void bookingTickets(String src, String dest)

{
	System.out.println("book tickets from"+src+"to--->"+dest);
}
@DataProvider
	public Object[][] getData()
	{
		Object[][] objArr = new Object[3][2];
		
		objArr[0][0]="Bangalore";
		objArr[0][1]="Goa";
		
		objArr[1][0]="Bangalore";
		objArr[1][1]="Pune";
		
		objArr[2][0]="Bangalore";
		objArr[2][1]="Mysuru";
		return objArr;
		
	}
}
