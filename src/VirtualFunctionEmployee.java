//多态虚函数
public class VirtualFunctionEmployee {
    private String name;
    private String address;
    private int number;

    public VirtualFunctionEmployee(String name, String address, int number) {
        System.out.println("VirtualFunctionEmployee constructor");
        this.name = name;
        this.address = address;
        this.number = number;
    }
    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + address);
    }
    //
     public String getName() {
        return name;
    }
     public String getAddress() {
        return address;
    }
     public int getNumber() {
        return number;
    }

}
