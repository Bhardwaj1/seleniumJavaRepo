package oPack;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ClassFive {
	@Test(dataProvider="getData")
	public void testFive(String Username, String Password) {
		System.out.println("Login through the User name: " + Username + "and Password: " + Password);

	}
	@DataProvider
	public Object[][] getData() {
		Object[][] a = new Object[3][2];
		a[0][0]="Gaurav";
		a[0][1]="1";
		a[1][0]="Jyotirmoy";
		a[1][1]="2";
		a[2][0]="Kattapa";
	    a[2][1]="3";
	    return a;
		
		 
	}

}
