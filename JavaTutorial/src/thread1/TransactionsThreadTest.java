package thread1;

public class TransactionsThreadTest implements Runnable{
    String name;
    public TransactionsThreadTest(String name) {
        this.name = name;
    }
 
    @Override
    public void run(){ 
        try {
            for(int i = 5; i > 0; i--){
                System.out.println(this.name + " : " + i);
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(name + " done");
    }
    
}
