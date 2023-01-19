package Numeral2;

import java.util.ArrayList;

public class DeleteClient {

    public void DeleteElement(int pos, ArrayList arrayList){
        if(arrayList.size()>3){
           arrayList.remove(pos);
        }else{
            arrayList.set(pos, null);
        }

    }

}
