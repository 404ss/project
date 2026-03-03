import java.util.Iterator;
import java.util.ArrayList;

public class IteratorTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("11");
        list.add("22");
        list.add("33");

        Iterator<String> ite = list.iterator();
        while (ite.hasNext()) {
            System.out.println(ite.next());
        }

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(8);
        list1.add(34);
        list1.add(18);

        Iterator<Integer> ite1 = list1.iterator();
        while (ite1.hasNext()) {
            Integer i = ite1.next();
            if (i>20) {
                ite1.remove();
            }
        }
        System.out.println(list1);
    }
}
