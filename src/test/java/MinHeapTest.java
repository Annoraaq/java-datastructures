import static org.junit.Assert.assertEquals;
import org.junit.Test;
import JavaDatastructures.MinHeap;

public class MinHeapTest {

  @Test
  public void getMin() {
    MinHeap mh = new MinHeap(); 
    mh.insert(3);
    assertEquals(3, mh.getMin());

    mh.insert(4);
    assertEquals(3, mh.getMin());

    mh.insert(1);
    assertEquals(1, mh.getMin());
  }

  @Test
  public void dropMin() {
    MinHeap mh = new MinHeap(); 
    mh.insert(3);
    mh.insert(4);
    mh.insert(1);
    mh.dropMin();
    assertEquals(3, mh.getMin());
  }
  
  @Test
  public void dropMinBig() {
    MinHeap mh = new MinHeap(); 
    mh.insert(6);
    mh.insert(3);
    mh.insert(1);
    mh.insert(2);
    mh.dropMin();
    assertEquals(2, mh.getMin());
  }

  @Test
  public void dropMinBiggest() {
    MinHeap mh = new MinHeap(); 
    mh.insert(1);
    mh.insert(2);
    mh.insert(3);
    mh.insert(4);
    mh.insert(5);
    mh.insert(6);
    mh.insert(7);
    mh.dropMin();
    mh.dropMin();
    mh.dropMin();
    mh.dropMin();
    assertEquals(5, mh.getMin());
  }

}
