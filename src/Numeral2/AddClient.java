package Numeral2;

import java.util.HashMap;


public class AddClient {

    CreateHashMap createHashMap = new CreateHashMap();

    HashMap<String, Client> hash = createHashMap.getHashMapClient();

    public AddClient() {
    }

    public void AddClientToArray(Client client){


        printArray p = new printArray();


        if(!hash.containsValue(client.id)) {
            hash.put(client.id, client);
            createHashMap.setHashMapClient(hash);
        }else
        {
            System.out.println("El usuario ya existe");
            return;
        }
    }



}
