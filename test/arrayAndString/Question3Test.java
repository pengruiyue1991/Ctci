package arrayAndString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/*
* @author joypeng 
* 
*/

class Question3Test {

	@Test
	void isPermutationTest() {
		String str = "abc";
		String str1 = "bac";
		Assert.assertTrue(Question3.isPermutation(str, str1));

	}
	
	@Test
	void isPermutationTest1() {
		String str = "abc";
		String str1 = "ba";
		Assert.assertFalse(Question3.isPermutation(str, str1));

	}
	
	@Test
	void isPermutationTest2() {
		String str = "abc";
		String str1 = "baa";
		Assert.assertFalse(Question3.isPermutation(str, str1));

	}

}
