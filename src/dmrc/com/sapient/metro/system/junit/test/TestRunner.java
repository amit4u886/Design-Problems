package dmrc.com.sapient.metro.system.junit.test;


import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunner {

	  public static void main(String[] args) {
		
		  
		  
	      Result result = JUnitCore.runClasses(TestFareCalculationOnSwipeOut.class);
	     
	      System.out.println(result.wasSuccessful());
	   
	  }
}
