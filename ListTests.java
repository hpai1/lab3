import static org.junit.Assert.*;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;


public class ListTests {

	@Test 
	public void testFilter() {
    List<String> result = new ArrayList<>();
    result.add("Java"); 
    result.add("Hello"); 
    result.add("World"); 

    StringChecker sc = new StringChecker() {

      @Override
      public boolean checkString(String s) {
        
        return !s.equals("Hello");
      }
      
    };
    
    result = ListExamples.filter(result, sc);
    assertArrayEquals(new String[] {"Java", "World"}, result.toArray());
	}


  @Test 
  public void testMerge() { 

    List<String> l1 = new ArrayList<>();
    List<String> l2 = new ArrayList<>();

    l1.add("a");
    l1.add("b");
    l1.add("c");

    l2.add("a");
    l2.add("d");

    List<String> result = new ArrayList<>();
    result = ListExamples.merge(l1, l2);

    assertArrayEquals(new String[] {"a", "a", "b", "c", "d"}, result.toArray());

    
  }
} 
