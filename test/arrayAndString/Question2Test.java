package arrayAndString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/*
* @author joypeng 
* 
*/

class Question2Test {

	@Test
	void reverseTest() {
		char[] strarr = {'a','b'};
		Question2.reverse(strarr);
		char[] expected = {'b','a'};
		Assert.assertArrayEquals(strarr,expected);
	}
	
	@Test
	void reverseTest1() {
		char[] strarr = {'a'};
		Question2.reverse(strarr);
		Assert.assertArrayEquals(strarr,strarr);
	}

}
