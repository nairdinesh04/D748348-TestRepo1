package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Lecture145_3 {
	 
	  @Parameters({"URL"}) //@Parameter({"URL","username"})
	  @Test
	  public void webLoginCar(String urlname, String username) { 
	  System.out.println("webLoginCar");
	  System.out.println(urlname); 
	  System.out.println(username); 
	  }
	 
	@Test(dataProvider="getData")
	public void mobileLoginCar(String username, String password) {
	System.out.println("mobileLoginCar");	
	System.out.println(username);
	System.out.println(password);
	}
 	@Test(dependsOnMethods={"webLoginCar"})  //@Test(dependsOnMethods={"method1","method2"})
	public void apiLoginCar() {
	System.out.println("apiLoginCar");
	}
	@BeforeMethod 
	public void beforeEveryTest() {
    System.out.println("Run me before every methods in Lecture145_3");
	}
	@AfterMethod 
	public void afterEveryTest() {
	System.out.println("Run me after every methods in Lecture145_3");
	}
	@DataProvider
	public Object[][] getData(){
	//1st Combination - Username Password - no credit history
	//2nd Combination - Username Password - credit history
	//3rd Combination - Username Password - fraud credit history 
	Object data[][] = new Object[3][2];	
	data[0][0] = "firstusername";
	data[0][1] = "firstpassword";
	data[1][0] = "secondusrename";
	data[1][1] = "secondpassword";
	data[2][0] = "thirdusername";
	data[2][1] = "thirdpassword";	
	return data;
	}
}
