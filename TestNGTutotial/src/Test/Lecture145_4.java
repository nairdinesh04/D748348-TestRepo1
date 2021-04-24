package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Lecture145_4 {
	
	@BeforeSuite
	public void webLoginHome() {
	System.out.println("First test of the suite");
	}
	@Test
	public void mobileLoginHome() {
	System.out.println("mobileLoginHome");	
	}

	@Test(dependsOnMethods={"mobileLoginHome"})
	public void apiLoginHome() {
	System.out.println("apiLoginHome");
	}
	@BeforeClass
	public void beforeLecture145_4Methods(){
	System.out.println("Before class in the Lecture145_4");	
	}
	@AfterClass
	public void afterLecture145_4Methods(){
	System.out.println("After class in the Lecture145_4");	
	}
}
