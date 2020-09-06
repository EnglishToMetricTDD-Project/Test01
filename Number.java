import java.util.ArrayList;

/**
 * 
 */

/**
 * @author atmcn
 *
 */
public class Number {

	public Number(){
		
	}
	
	public int getDecimal(String d){
		ArrayList<Character> c = new ArrayList<Character>();
		for (int i = 0; i <=d.length()-1; i++){
		c.add(d.charAt(i));
		}
		
		return c.indexOf('.');
		
	}
}
