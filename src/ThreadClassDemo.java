public class ThreadClassDemo {
        public static void main(String[] args) {
            Runnable hello = new DisplayMessage("Hello World!");
            Thread thread1 = new Thread(hello);
            thread1.setDaemon(true);
            thread1.setName("Hello Thread");
            System.out.println("Start Hello Thread");
            thread1.start();

            Runnable bye = new DisplayMessage("Goodbye World!");
            Thread thread2 = new Thread(bye);
            thread2.setPriority(2);
            thread2.setDaemon(true);
            System.out.println("Start Bye Thread");
            thread2.start();

            System.out.println("Starting Thread3");
            Thread thread3 = new GuessANumber(52);
            thread3.start();
            try {
                thread3.join();
            } catch (InterruptedException e) {
                System.out.println("Thread3 is interrupted");
            }

            System.out.println("Starting Thread4");
            Thread thread4 = new GuessANumber(5);
            thread4.start();

            System.out.println("main() is done");
        }
}


