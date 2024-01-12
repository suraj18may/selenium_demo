package ExtentsReports;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class FirstReports {
	public static void main(String[] args) throws IOException   {
		ExtentReports extentreports=new ExtentReports();
//		File file =new File("C:\\java workspace\\Selenium_demo\\report.html");
		ExtentSparkReporter sparkreport=new ExtentSparkReporter("report.html");
		extentreports.attachReporter(sparkreport);
		
	ExtentTest test1 =extentreports.createTest("Test1");
	test1.pass("This test is pass");
	
	ExtentTest test2 =extentreports.createTest("Test2");
	test2.log(Status.FAIL,"this test is fail");

	extentreports.createTest("Test3").skip("this method is skip");
	
		extentreports.flush();

		Desktop.getDesktop().browse(new File("Report.html").toURI());
	

	}

}
