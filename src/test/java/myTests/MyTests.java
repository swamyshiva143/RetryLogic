package myTests;


import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTests {
	
	
	//@Test --level.. using retryAnalyzer....
	
//	@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class)
//	public void test1() {
//		Assert.assertEquals(false, true);
//	}
//	
//	
//	@Test(retryAnalyzer=Analyzer.RetryAnalyzer.class)
//	public void test2() {
//		Assert.assertEquals(false, true);
//	}

	
	@Test
	public void test1() {
		Assert.assertEquals(false, true);
	}

	@Test
	public void test2() {
		Assert.assertEquals(true, false);
	}


	@Test
	public void test3() {
		Assert.assertEquals(true, true);
	}


	@Test
	public void test4() {
		Assert.assertEquals(false, false);
	}



}

