
package Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day5 {
	
	
@Parameters({"URL"})
@Test
public void WebLoginCarlogin(String URL)
{
System.out.println("WebLogin CarPersonal login");
System.out.println(URL);
}
}