package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerClass extends BaseClass implements ITestListener  {
	
	public void onTestFailure(ITestResult result) {
		ScreenShot(result.getTestContext().getName()+"_"+result.getMethod().getMethodName()+".png");
		
	}

				

}	




