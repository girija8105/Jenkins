import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_003Test {
	
	@Test
	public void Account() {
		Reporter.log("run TestScript 3",true);
		System.out.println(System.getProperty("BROWSERNAME"));
		System.out.println(System.getProperty("USERNAME"));
	}

}
