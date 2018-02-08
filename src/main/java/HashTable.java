package JavaDatastructures;

import java.util.LinkedList;

public class HashTable<K,V> {
  private LinkedList<Entry>[] data;


  public HashTable(int size) {
    data = new LinkedList[size];
  }

  public void put(K key, V value) {
    int hash = hash(key);
    Entry entry = new Entry(key, value);
    LinkedList<Entry> list = generateList(entry);
    list.add(entry);
    data[hash] = list;
  } 

  public V get(K key) {
    LinkedList<Entry> list = data[hash(key)];

    for (Entry e : list) {
      if (e.getKey().equals(key)) {
        return e.getValue();
      }
    }

    return null;
  }

  private LinkedList<Entry> generateList(Entry entry) {
    LinkedList<Entry> list = data[hash(entry.getKey())];

    if (list == null) {
      return new LinkedList<Entry>(); 
    }
    
    removeEntryFromList(list, entry.getKey());
    return list;
  }

  private void removeEntryFromList(LinkedList<Entry> list, K key) {
    for (Entry e : list) {
      if (e.getKey().equals(key)) {
        list.remove(e);
        break;
      }  
    }
  }

  private int hash(K key) {
    return Math.abs(key.hashCode() % data.length);
  }

  private class Entry {
    private K key;
    private V value;

    public Entry(K key, V value) {
      this.key = key;
      this.value = value;
    }  

    public K getKey() {
      return key;
    }

    public V getValue() {
      return value;
    }

    public void setKey(K key) {
      this.key = key;
    }

    public void setValue(V value) {
      this.value = value;
    }
  }
}
