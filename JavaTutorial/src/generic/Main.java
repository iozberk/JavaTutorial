package generic;
import java.util.ArrayList;
import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Test");
        arr.add("Te2st");
        arr.add("Test2");
        // arr.add(true); // Error

        for(String str: arr){
            System.out.println(str);
        }


        System.out.println("----------");

        ArrayList<Integer> arrInt = new ArrayList<>();
        arrInt.add(1);
        arrInt.add(12);
        arrInt.add(13);
        for(Integer intt: arrInt){
            System.out.println(intt.doubleValue());
        }



        System.out.println("----------");
        HashMap<Integer, String> hmap = new HashMap<>();
        hmap.put(1, "a");
        hmap.put(2, "b");
        hmap.put(3, "c");

        
        for(Integer key: hmap.keySet()){
            System.out.println("Key: "+ key + " - Value: " + hmap.get(key));
        }


        System.out.println("----------");

        Test<Integer> iInt = new Test<Integer>(15);
        System.out.println(iInt.getObj());
        System.out.println("----------");
        Test<String> iStr = new Test<String>("15");
        System.out.println(iStr.getObj());


        System.out.println("----***------");
        TestSecond<Integer,String> integerString = new TestSecond<Integer,String>(1, " : United States");
        integerString.print();
    }
}
