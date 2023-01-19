package Numeral2;

import java.util.HashMap;
import Numeral1.AddClient;
public class printArray {

    CreateHashMap createHashMap = new CreateHashMap();

    HashMap<String, Client> array = createHashMap.getHashMapClient();

    public void Print(){
        for (String id: array.keySet()) {
            String key = id.toString();
            String value = array.get(id).toString();
            System.out.println(key + " " + value);
        }
    }


}
