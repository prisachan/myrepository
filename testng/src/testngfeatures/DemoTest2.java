package testngfeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest2 {
	@Test
	public void test1(){
		System.out.println("test1");
		Assert.assertEquals(true, true);
	}
	@Test
	public void test2(){
		System.out.println("test2");
		Assert.assertEquals(true, true);	
	}
	@Test
	public void test3(){
		System.out.println("test3");
		Assert.assertEquals(true, true);
	}
	@Test
	public void test4(){
		System.out.println("test4");
		Assert.assertEquals(true, true);
	}
}
