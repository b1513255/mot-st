package fcu.sqa.maven_demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DiffDemoTest {

	private DiffDemo d;
	
	@Before
	public void setup(){
		d = new DiffDemo();
	}
	
	@Test
	public void testGetDiff() {
		//fail("Not yet implemented");
		String str1 = "abcde";
		String str2 = "abcxy";
		
		String expected = "xy";
		
		try{
			String deffResult = d.getDiff(str1, str2);
			assertEquals(expected, deffResult);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	@Test(expected = Exception.class)
	public void testGetDiffWithException() throws Exception {
		String str1 = "";
		String str2 = "abcxy";
		d.getDiff(str1, str2);
		d.getDiff(str2, str1);
		d.getDiff(str1, str1);
	}

}
