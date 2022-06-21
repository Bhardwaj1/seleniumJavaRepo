package kPack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class classNine {
	@Test(dataProvider ="getData")
	public void loginFunctionality(String Username,String Password) {
		System.out.println("Login through username: " +Username+ " and password:"+ Password);
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] a =new Object[3][2];
		a[0][0]="Gautam";
		a[0][1]="1";
		a[1][0]="Veere";
		a[1][1]="2";
		a[2][0]="Bhardwaj"; 
		a[2][1]="3";
		return a;
	}
	

}
