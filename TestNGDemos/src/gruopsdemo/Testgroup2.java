package gruopsdemo;

import org.testng.annotations.Test;

public class Testgroup2 {
	
	@Test(groups = {"regression"})
	public void Test6()
	{
		System.out.println("My second regression test case");
	}
	
	@Test(groups = {"regression"})
	public void Test7()
	{
		System.out.println("My third regression test case");
	}
	
	@Test(groups = {"functional"})
	public void Test8()
	{
		System.out.println("My second functional test case");
	}
	
	@Test(groups = {"smoke"})
	public void Test9()
	{
		System.out.println("My fourth smoke test case");
	}

}
