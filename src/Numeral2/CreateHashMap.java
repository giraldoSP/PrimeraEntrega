package Numeral2;

import java.util.HashMap;

public class CreateHashMap {

    HashMap<String, Client> hashMapClient = new HashMap<String, Client>();

    public CreateHashMap() {

    }

    public HashMap<String, Client> getHashMapClient() {
        return hashMapClient;
    }

    public void setHashMapClient(HashMap<String, Client> hashMapClient) {
        this.hashMapClient = hashMapClient;
    }
}
