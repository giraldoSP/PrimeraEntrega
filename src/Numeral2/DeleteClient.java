package Numeral2;
import java.util.HashMap;

import java.util.HashMap;

public class DeleteClient {
    CreateHashMap createHashMap = new CreateHashMap();

    HashMap<String, Client> hash = createHashMap.getHashMapClient();
    public DeleteClient() {
    }


    public void delete(String id){
        try {
            hash.remove(id);
            createHashMap.setHashMapClient(hash);
        }catch (Exception e){
            System.out.println("El error es= " + e);
        }
    }



}
