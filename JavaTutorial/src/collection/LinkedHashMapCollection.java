package collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapCollection {
    public static void main(String[] args) {
        LinkedHashMap lh = new LinkedHashMap();
        lh.put("John", 90);
        lh.put("Jennifer", 100);
        lh.put("Ted", 50);

        Set set = lh.entrySet();

        Iterator i = set.iterator();

        while(i.hasNext()){
            Map.Entry item = (Map.Entry) i.next();
            System.out.println(item.getKey()+ " -->> "+ item.getValue());

        }



    }
}
