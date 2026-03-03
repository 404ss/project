import java.util.HashMap;

public class HashMapTest {
        public static void main(String[] args) {
            HashMap<Integer,String> map = new HashMap<>();
            map.put(8,"11");
            map.put(9,"22");
            map.put(10,"33");
            System.out.println(map.get(9));
            System.out.println(map.size());
            for (Integer key: map.keySet()) {
                System.out.println("key="+ key+" value="+map.get(key));
            }
            map.remove(2);
            System.out.println(map);
            map.clear();
            System.out.println(map);
        }
}
