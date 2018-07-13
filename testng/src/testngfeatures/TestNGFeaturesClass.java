package testngfeatures;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestNGFeaturesClass {
@BeforeTest
public void beforeTest(){
	System.out.println("beforetest");
}
@BeforeMethod
 public void configBM(){
	System.out.println("before method");
	}
@Test
   public void test1(){
	System.out.println("test1");
}
@Test
public void test2(){
	System.out.println("test2");
}
@AfterMethod
public void configAM(){
	System.out.println("aftermethod");
}
@AfterTest
public void AT(){
	System.out.println("aftertest");
}
}
