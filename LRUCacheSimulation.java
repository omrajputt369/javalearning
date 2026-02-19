import java.util.LinkedHashMap;
import java.util.Map;

/**
 * A Java program demonstrating a Simple LRU (Least Recently Used) Cache
 * simulation.
 */

class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int capacity;

    public LRUCache(int capacity) {
        // Init with capacity, load factor, and accessOrder = true for LRU
        super(capacity, 0.75f, true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        // Remove the oldest entry if size exceeds capacity
        return size() > capacity;
    }
}

public class LRUCacheSimulation {
    public static void main(String[] args) {
        LRUCache<Integer, String> cache = new LRUCache<>(3);

        cache.put(1, "Data 1");
        cache.put(2, "Data 2");
        cache.put(3, "Data 3");

        System.out.println("Cache after 3 additions: " + cache);

        // Accessing entry 1 makes it most recently used
        cache.get(1);
        System.out.println("Cache after accessing 1: " + cache);

        // Adding 4th element should trigger eviction of 2 (least recently used)
        cache.put(4, "Data 4");
        System.out.println("Cache after adding 4 (expecting 2 to be evicted): " + cache);

        if (!cache.containsKey(2)) {
            System.out.println("Key 2 was successfully evicted.");
        }
    }
}
