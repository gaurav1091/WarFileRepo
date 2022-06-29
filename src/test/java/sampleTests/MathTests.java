package sampleTests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MathTests {
	
	@Test
	public void SumTest()
	{
		int a = 10;
		int b = 20;
		int c = a + b;
		Assert.assertEquals(c, 30);
		
	}
	
	@Test
	public void multiply()
	{
		int a = 10;
		int b = 20;
		int c = a * b;
		Assert.assertEquals(c, 200);
		
	}

}
