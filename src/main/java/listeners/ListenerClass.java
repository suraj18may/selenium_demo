package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;


public class ListenerClass extends BaseClass implements ITestListener  {
	
	public void onTestFailure(ITestResult result) {
		ScreenShot1(result.getTestContext().getName()+"_"+result.getMethod().getMethodName()+".png");
}

}


