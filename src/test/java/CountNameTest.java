import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.app.InspectMap;

import junit.framework.Assert;

public class CountNameTest {
	private InspectMap inspectMap;
	
	@Test
	public void test() 
	{
		inspectMap = new InspectMap();
		if(inspectMap.getCommonNames() == 2)
		{
			
		}
		//System.out.println(inspectMap.getCommonNames());
		Assert.assertEquals("Failure the returned count isnt right",2,inspectMap.getCommonNames());
		System.out.println("There are 2 Declan's entered into your map");
		
	}

}
