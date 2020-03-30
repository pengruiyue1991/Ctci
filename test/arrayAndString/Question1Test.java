package arrayAndString;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/*
* @author joypeng 
* 
*/


class Question1Test {

	
	// Check false
	@Test
	void allUniqueTest() {
		String str = "abscda"; 
		boolean isAllUnique = Question1.allUnique(str);
		Assert.assertFalse(isAllUnique);
		
	}
	
	// Check true
	@Test
	void allUniqueTest1() {
		String str = "abscd"; 
		boolean isAllUnique = Question1.allUnique(str);
		Assert.assertTrue(isAllUnique);
		
	}
	
	// Check null
	@Test
	void allUniqueTest2() {
		String str = ""; 
		boolean isAllUnique = Question1.allUnique(str);
		Assert.assertFalse(isAllUnique);
		
	}
	
	// Check 1 char
		@Test
		void allUniqueTest3() {
			String str = "1"; 
			boolean isAllUnique = Question1.allUnique(str);
			Assert.assertTrue(isAllUnique);
			
		}
	
	 // Check more than 128
		@Test
		void allUniqueTest4() {
			StringBuffer stringBuffer = new StringBuffer();
			for(int i = 0 ; i < 129; i++) {
				stringBuffer.append('a');
			}
			String str = stringBuffer.toString();
			boolean isAllUnique = Question1.allUnique(str);
			Assert.assertFalse(isAllUnique);
					
		}	

}
