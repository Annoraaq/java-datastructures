import static org.junit.Assert.assertEquals;
import org.junit.Test;
import JavaDatastructures.HashTable;

public class HashTableTest {

  @Test
  public void integerKey() {
    HashTable<Integer, String> htbl = new HashTable<>(10); 
    htbl.put(5, "test");
    String result = htbl.get(5);
    assertEquals("test", result);
  }

  @Test
  public void stringKey() {
    HashTable<String, String> htbl = new HashTable<>(10); 
    htbl.put("testKey", "test");
    String result = htbl.get("testKey");
    assertEquals("test", result);
  }

  @Test
  public void severalValuesForOneKey() {
    HashTable<String, String> htbl = new HashTable<>(10); 
    htbl.put("testKey", "test");
    htbl.put("testKey", "test2");
    String result = htbl.get("testKey");
    assertEquals("test2", result);
  }
}
