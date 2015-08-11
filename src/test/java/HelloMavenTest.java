import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;


public class HelloMavenTest extends FunctionalTestCase {
	
    @Test
    
    public void sayHelloRetrunsHellowMaven() throws Exception {
      
    runFlowAndExpect("sayHello", "HelloMaven");
    }
    
	
	@Override
	protected String getConfigFile() {
		// TODO Auto-generated method stub
		return "maven-project.xml";
	}

}
