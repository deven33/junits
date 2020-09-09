package junits;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void testTruncateAInFirst2Positions() {
		StringHelper stringHelper =new StringHelper();
		String actual = stringHelper.truncateAInFirst2Positions("AACD");
		String expected = "CD";
		assertEquals(expected, actual);
	}
	
	//ABCD==>false  ABAB==> true  AB==> true  A->false
	@Test
	public void testNegetive() {
		StringHelper stringHelper =new StringHelper();
		boolean actual = stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD");
		assertFalse(actual);
	}
	
	@Test
	public void testpositvie() {
		StringHelper stringHelper =new StringHelper();
		boolean actual = stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD");
		assertTrue(actual);
	}
}
