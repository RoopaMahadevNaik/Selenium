package learntestng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener  {

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test case started and Test case name is: "+context.getName());
	}
 
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case success and Test case name is: "+result.getName());
	}


	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed and Test case name is: "+result.getName());
	}


	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped and Test case name is: "+result.getName());
	}
	
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test case finished and Test case name is: "+context.getName());
	}

}
