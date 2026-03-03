import java.util.LinkedList;

public class LinkedListTest {
        public static void main(String[] args) {
            LinkedList<String> list = new LinkedList<String>();
            list.add("11");
            list.add("22");
            list.add("33");
            System.out.println(list);
            System.out.println(list.get(0));
            System.out.println(list.size());
            list.add(1,"23");
            for (String str : list) {
                System.out.println(str);
            }
        }
}
