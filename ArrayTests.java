import static org.junit.Assert.*;
import org.junit.*;


public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testLongReversedInPlace() {
    int[] input1 = {1,2,3,4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{4,3,2,1}, input1);
  }

  @Test
  public void testLongReversed() {
    int[] input1 = {1,2,3,4};
    assertArrayEquals(new int[]{4,3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testShortAverage() {
    double[] input1 = {1};
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.0);
  }

  @Test
  public void testLongAverage() {
    double[] input1 = {1,10,15,20};
    assertEquals(15, ArrayExamples.averageWithoutLowest(input1), 15.0);
    
  }
  
  @Test
  public void testAverageRepeat() {
    double[] input1 = {1,1,1,1,10,15,20};
    assertEquals(15.0, ArrayExamples.averageWithoutLowest(input1),0);
    
  }

}
