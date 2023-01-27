import static org.junit.Assert.*;
import org.junit.*;


import java.util.NoSuchElementException;


public class LinkedListTests {

	@Test 
	public void testAppendStart() {

    LinkedList LL= new LinkedList(); 

    LL.append(10);

    assertEquals("10 ", LL.toString());
  } 

  @Test
  public void testPrependStart() {

    LinkedList LL= new LinkedList(); 

    LL.prepend(10);

    assertEquals("10 ", LL.toString());
  } 

  @Test
  public void prependMultiple() { 
    LinkedList LL = new LinkedList(); 

    LL.prepend(10);
    LL.prepend(20);
    LL.prepend(30);

    assertEquals("30 20 10 ", LL.toString());
  }

  @Test
  public void testAppend() { 
    LinkedList LL = new LinkedList(); 

    LL.append(10); 
    LL.append(20);
    LL.append(30);

    assertEquals("10 20 30 ", LL.toString());
  }


  @Test (expected = NoSuchElementException.class)
  public void testFirstEmpty() { 
    LinkedList LL = new LinkedList(); 

    try { 
      LL.first();
    }
    catch (NoSuchElementException e){ 
      throw e;
    }
  }

  @Test
  public void testFirstFull() { 
    LinkedList LL = new LinkedList(); 

    LL.append(10);
    LL.append(20);

    assertEquals(10, LL.first());
  }


  @Test (expected = NoSuchElementException.class)
  public void testLastEmpty() { 
    LinkedList LL = new LinkedList(); 

    try { 
      LL.last();
    }
    catch (NoSuchElementException e){ 
      throw e;
    }
  }

  @Test
  public void testOneEmpty() { 
    LinkedList LL = new LinkedList(); 
    LL.append(10); 

    assertEquals(10, LL.last());
  }

  @Test
  public void testEmptyFull() { 
    LinkedList LL = new LinkedList(); 
    LL.append(10);
    LL.append(20);
    assertEquals(20, LL.last());
  }

  @Test
  public void testLengthEmpty() { 
    LinkedList LL = new LinkedList(); 

    assertEquals(0, LL.length());
  }

  @Test
  public void testLengthOne() { 
    LinkedList LL = new LinkedList(); 
    LL.append(10);

    assertEquals(1, LL.length());
  }

  @Test
  public void testLengthFull() { 

    
    LinkedList LL = new LinkedList();
    LL.append(10);
    LL.append(10); 

    assertEquals(2, LL.length());
  }
}