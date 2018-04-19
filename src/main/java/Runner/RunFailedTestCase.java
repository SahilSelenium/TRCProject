package Runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class RunFailedTestCase {
	
	

	@Test
	
	
	public static void main ()
	
	
	{
		
		
		TestNG runner = new TestNG();
		
		List<String>list = new ArrayList<String>();
		
		list.add("D:\\Sahil_workspace\\TrcTest\\test-output\\testng-failed.xml");
		
		runner.setTestSuites(list);
		
		runner.run();
		
	}
	
}
