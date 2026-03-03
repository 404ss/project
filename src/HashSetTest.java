import java.util.HashSet;

public class HashSetTest {
        public static void main(String[] args) {
            HashSet<String> set = new HashSet<String>();
            set.add("11");
            set.add("22");
            set.add("33");
            System.out.println(set);
            set.remove("11");
            System.out.println(set);
            System.out.println(set.contains("11"));

        }
}
