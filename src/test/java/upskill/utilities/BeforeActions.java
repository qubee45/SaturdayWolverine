package upskill.utilities;

import cucumber.api.Scenario;
import cucumber.api.java.Before;



public class BeforeActions {
	
	@Before
	public void beforeAction (Scenario scen) {
		System.out.print("--->>> Initializing Driver");
		SetupDrivers.setupDrier();
		System.out.println("Test Scenario Name : " + scen.getName());
		
	}

}
