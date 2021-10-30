package codechallenges.hashMap;

import java.util.ArrayList;
import java.util.LinkedList;

public class HashMap<K, V> {

  ArrayList<LinkedList<HashMapPair<K, V>>> bucketArrayList;
  int size;

  public HashMap(int size) {
    if (size < 1) {
      throw new IllegalArgumentException("HashMap must have a size of 1 or greater");
    }

    this.size = size;
    this.bucketArrayList = new ArrayList<>(size);
    for (int i = 0; i < this.size; i++) {
      bucketArrayList.add(i, new LinkedList<>());
    }
  }

  public void add(K key, V value) {
    int hashCode = hash(key);
    LinkedList linkedList = bucketArrayList.get(hashCode);
    HashMapPair keyValuePair = new HashMapPair(key, value);
    linkedList.add(keyValuePair);
  }

  public V get(K key) {
    int hashCode = hash(key);
    LinkedList linkedList = bucketArrayList.get(hashCode);
    return null;
  }

  public boolean contains(K key) {
    return false;
  }

  public int hash(K key) {
    return Math.abs(key.hashCode() % size);
  }
}