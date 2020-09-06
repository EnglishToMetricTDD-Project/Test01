import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

/**
 * 
 */

/**
 * @author atmcn
 *
 */
public class DecimalTest {

	@Test
	public void testDecimal() {
		Number n = new Number();
		
		String d ="1234";
		String g = "123.4";
		
		Assert.assertTrue(n.getDecimal(d) == -1);
		Assert.assertTrue(n.getDecimal(g) == 3);
		
		
	}

}
