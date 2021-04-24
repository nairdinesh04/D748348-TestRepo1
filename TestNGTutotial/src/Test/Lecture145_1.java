package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Lecture145_1 {
	
	@AfterTest
	public void PL() {
	System.out.println("Deleting cache after test");
	}
	@Test(enabled=false)
	public void Intermediate(){
	System.out.println("Intermediate test");	
	}
	@AfterSuite
	public void closeTest() {
	System.out.println("Last test of the suite");	
	}

}
