import static org.junit.Assert.*;

import org.junit.Test;
import org.mule.api.MuleEvent;
import org.mule.tck.junit4.FunctionalTestCase;


public class HelloMavenTest extends FunctionalTestCase {
	
    @Test
    
    public void sayHelloRetrunsHellowMaven() throws Exception {
      
    runFlowAndExpect("sayHello", "HelloMaven");
    }
    
    @Test
    public void retrieveFlightsAddAppropraiteHeader() throws Exception {
    	MuleEvent event = runFlow ("retrieveFlights");
    	String contentType = event.getMessage().getOutboundProperty("Content-Type");
    	assertEquals("application/json", contentType);
    			
    }
	
	@Override
	protected String getConfigFile() {
		// TODO Auto-generated method stub
		return "maven-project.xml";
	}

}
