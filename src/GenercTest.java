import java.util.*;

public class GenercTest {
    public static void main(String[] args) {
            List<String> name = new ArrayList<String>();
            List<Integer> age = new ArrayList<Integer>();
            List<Number> number = new ArrayList<Number>();

            name.add("张三");
            age.add(18);
            number.add(100);

            getData(name);
            getData(age);
            getData(number);

          //  getUperNumber(name);
            getUperNumber(age);
            getUperNumber(number);
    }
    public static void getData(List<?>data){
        System.out.println("data:"+ data.get(0));
    }

    public static void getUperNumber(List<? extends Number> data){
        System.out.println("data:"+ data.get(0));
    }
}
