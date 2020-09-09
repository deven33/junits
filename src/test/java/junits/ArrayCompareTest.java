package junits;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	@Test
	public void testArraySort() {
		int number[] = {12,54,78,34};
		int expected [] = {12, 34, 54, 78};
		Arrays.sort(number);
		assertArrayEquals(expected, number);
	}
	
	//1st approach for exception
	@Test
	public void testArrayException() {
		int number[] = null;
		try {
			Arrays.sort(number);
		}catch(NullPointerException e) {
			System.out.println("null exception");
		}
	}
	
	//2nd approach for exception 
	//its expecting exception, if dosen't happen exception then failure   eg pass empty array
	@Test(expected = NullPointerException.class)
	public void testArrayException2() {
		int number[] = null;
		Arrays.sort(number);
	}
	
	// performance test on array sort
	//time in ms
	@Test(timeout = 10)
	public void testArrayperformance() {
		int array[] = {1,3};
		for(int i=1;i<=1000000;i++) {
			array[0]=i;
			Arrays.sort(array);
		}
	}
		
}
