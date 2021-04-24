package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Lecture145_2 {
	
	@BeforeTest
	public void demo2() {
		System.out.println("Pre-conditions set-up");
		
	}
	@Test(groups={"Smoke"})
	public void sanity() {
	System.out.println("Smoke Test");	
	}

}
