public class Box<T> {
    private T t;
    public void add(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> intergerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();

        intergerBox.add(10);
        stringBox.add("hello");

        System.out.println(intergerBox.get());
        System.out.println(stringBox.get());
    }
}
