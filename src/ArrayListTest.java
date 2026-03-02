import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("11");
        list.add("22");
        list.add("33");
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());

        for (String str : list) {
            System.out.println(str);
        }
    }
}
