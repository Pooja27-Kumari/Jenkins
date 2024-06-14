package jenkinProject;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExampleTest {

@Test
public void demoJenkins() {
	Reporter.log("demoJenkins is added", true);
	System.out.println("life is unexpected");
}
}
