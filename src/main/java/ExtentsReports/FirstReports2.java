package ExtentsReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class FirstReports2 {
	public static void main(String[] args) throws IOException   {
		ExtentReports extentreports=new ExtentReports();
//		File file =new File("C:\\java workspace\\Selenium_demo\\report.html");
		ExtentSparkReporter sparkreport=new ExtentSparkReporter("report.html");
		extentreports.attachReporter(sparkreport);
		
		extentreports.
		createTest("Test1")
		.log(Status.INFO,"Info1")                          //fail
		.log(Status.INFO,"Info2")                          //skip
		.log(Status.PASS,"pass1")                          //Warning
		.log(Status.PASS,"Pass2")                          //pass
		.log(Status.WARNING,"warning")                     //info
		.log(Status.WARNING,"warning")
		.log(Status.SKIP,"Skip")
		.log(Status.SKIP,"Skip")
		.log(Status.FAIL,"fail")
		.log(Status.FAIL,"Fail");
	
	
		extentreports.flush();

		Desktop.getDesktop().browse(new File("Report.html").toURI());
	

	}

	private static void log(Status info, String string) {
		// TODO Auto-generated method stub
		
	}

}
