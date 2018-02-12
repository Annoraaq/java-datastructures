import static org.junit.Assert.assertEquals;
import org.junit.Test;
import JavaDatastructures.MaxHeap;

public class MaxHeapTest {

  @Test
  public void getMax() {
    MaxHeap mh = new MaxHeap(); 
    mh.insert(3);
    assertEquals(3, mh.getMax());

    mh.insert(1);
    assertEquals(3, mh.getMax());

    mh.insert(4);
    assertEquals(4, mh.getMax());
  }

  @Test
  public void dropMax() {
    MaxHeap mh = new MaxHeap(); 
    mh.insert(3);
    mh.insert(1);
    mh.insert(4);
    mh.dropMax();
    assertEquals(3, mh.getMax());
  }

  @Test
  public void dropMaxBig() {
    MaxHeap mh = new MaxHeap(); 
    mh.insert(6);
    mh.insert(3);
    mh.insert(1);
    mh.insert(2);
    mh.dropMax();
    assertEquals(3, mh.getMax());
  }

  @Test
  public void dropMaxBiggest() {
    MaxHeap mh = new MaxHeap(); 
    mh.insert(1);
    mh.insert(2);
    mh.insert(3);
    mh.insert(4);
    mh.insert(5);
    mh.insert(6);
    mh.insert(7);
    mh.dropMax();
    mh.dropMax();
    mh.dropMax();
    mh.dropMax();
    assertEquals(3, mh.getMax());
  }

}
