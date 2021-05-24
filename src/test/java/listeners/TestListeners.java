package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//testNg also have somting which will listen events
//what is events?
//f.e one testcase is passed ---> it is one event
//what to do after when testcase pass and what to do if it fails
//it is an interface called ITESTLISTENER
public class TestListeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Method Started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Method Passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Method Failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Method Skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Method statted");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Suite Start");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Suite Ended");
		
	}

}
