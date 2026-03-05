public class ThreadTest {
    public static void main(String[] args) {
        RunnableDemo R1 = new RunnableDemo("Thread-1");
        R1.start();
        RunnableDemo R2 = new RunnableDemo("Thread-2");
        R2.start();
    }
}

class RunnableDemo implements Runnable{
    private Thread t;
    private String threadName;

    RunnableDemo(String name){
        threadName = name;
        System.out.println("创建线程:"+ threadName);
    }
    public void start(){
        System.out.println("启动线程:"+ threadName);
        if (t == null){
            t = new Thread(this,threadName);
            t.start();
        }
    }
    public void run(){
        System.out.println("运行线程:"+ threadName);
    try{
        for (int i = 4;i > 0;i--){
            System.out.println("线程:"+ threadName+",i="+i);
            Thread.sleep(50);
        }
    }catch(InterruptedException e){
        System.out.println("线程"+ threadName+"被中断");
    }
    System.out.println("线程"+ threadName+"退出");
    }

}
