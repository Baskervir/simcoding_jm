import java.util.concurrent.ConcurrentHashMap;

public class LockStripingEx {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        map.put("apple", 1);
        map.put("banana", 2);
        map.put("kiwi", 5);
        map.put("mango", 3);

        System.out.println("map " + map);
    }
}
