package Numeral2;
import java.util.HashMap;


public class SearchObject {

    CreateHashMap createHashMap = new CreateHashMap();

    HashMap<String, Client> array = createHashMap.getHashMapClient();

    int index = 0;
    boolean flag;
    public void Search(String id){

        flag = array.containsKey(id);
        if(!flag){
            System.out.println("El id: " + id + "exise");
        }else {
            System.out.println("El id no existe");
        }
    }
}

