package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapCollection {
    public static void main(String[] args) {

        HashMap h = new HashMap();

        h.put("USA", "Washington D.C.");
        h.put("Canada", "Ottawa");
        h.put("Mexico", "Mexico City");
        h.put("England", "London");

        Set s = h.entrySet();
        Iterator i = s.iterator();
        while(i.hasNext()){
            Map.Entry item = (Map.Entry) i.next();
            System.out.println(item.getKey()+ " -->> "+ item.getValue());
        }
    }
}
