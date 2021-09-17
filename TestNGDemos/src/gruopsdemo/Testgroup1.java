package gruopsdemo;

import org.testng.annotations.Test;

public class Testgroup1 {
	
	@Test(groups = {"smoke"})
	public void Test1()
	{
		System.out.println("My first smoke test case");
	}
	
	@Test(groups = {"smoke"})
	public void Test2()
	{
		System.out.println("My second smoke test case");
	}
	
	@Test(groups = {"smoke"})
	public void Test3()
	{
		System.out.println("My third smoke test case");
	}
	
	@Test(groups = {"regression"})
	public void Test4()
	{
		System.out.println("My first regression test case");
	}
	
	@Test(groups = {"functional"})
	public void Test5()
	{
		System.out.println("My first functional test case");
	}
	
	
}
