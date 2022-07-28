package thread1;

public class Main {
    public static void main(String[] args) {

      

      TransactionsThreadTest thread = new TransactionsThreadTest("First");
      // thread.run();
      Thread t1 = new Thread(thread);
      TransactionsThreadTest thread1 = new TransactionsThreadTest("Second");
      Thread t2 = new Thread(thread1);
      // thread1.run();
      t1.start();
      t2.start();
  }
}