//异常处理
import javax.naming.InsufficientResourcesException;
import java.io.*;
import java.rmi.RemoteException;
import java.util.Scanner;

public class ExcepTest {
    public static void main(String[] args) {
        try {
            int a[] = new int[2];
            System.out.println(a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界异常"+e.getMessage());
        }
        System.out.println("Out of try-catch block");

        try {
            readFile("D:/Java/src/ExcepTest.java");
        }catch (IOException e){
            System.out.println("文件读取异常"+e.getMessage());
        }

        //finally
        int b[] = new int[2];
        try {
            System.out.println("Access elment three:"+b[3]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown:"+e);
        }
        finally {
            b[0] = 100;
            System.out.println("First element is:"+b[0]);
            System.out.println("finally block is executed");
        }

        //checkNumber(-1);

        //try-with-resources
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader("test.txt"))){
            while ((line = br.readLine()) != null) {
                System.out.println("line -> "+line);
            }
        }catch (IOException e){
            System.out.println("IOException in tey block ->"+e.getMessage());
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

    //try-with-resources 处理多个资源
    public static void RunoobTest() throws IOException {
        try (Scanner sc = new Scanner(new File("testRead.txt"));
             PrintWriter writer = new PrintWriter(new File("testWrite.txt"))) {
            while (sc.hasNext()) {
                writer.print(sc.nextLine());
            }
        }
    }
}