package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class CustomListeners implements ITestListener {

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		
		Reporter.log("<a target=\"_blank\" href=\"F:\\screenshot\\error.jpg\">Capture Screenshot</a>");
		
		Reporter.log("<a target=\"_blank\" href=\"F:\\screenshot\\error.jpg\"><img src=\"F:\\screenshot\\error.jpg\" height=200 width=200></img></a>");
		
		
		System.out.println("Capture Screenshot");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {


		System.out.println("Test Successfully Executed");
		
	}

}
