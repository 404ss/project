//异常处理
import java.io.*;

public class ExcepTest {
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            System.out.println(a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界异常"+e.getMessage());
        }
        System.out.println("Out of try-catch block");

        checkNumber(-1);

        try {
            readFile("D:/Java/src/ExcepTest.java");
        }catch (IOException e){
            System.out.println("文件读取异常"+e.getMessage());
        }

    }
    public static void checkNumber(int num){
        if (num < 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
    }

    public static void readFile(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();
        }
        reader.close();
    }
}
