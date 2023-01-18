package Numeral1;

import java.util.ArrayList;

public class Client {

    String id;
    String name;
    static Client[] clientArray = new Client[3];

    public Client() {
    }

    public Client(String id, String name) {
        if(ValidateClientData.ValidatationIsInt(id)){
            this.id = id;
        }else{
            System.out.println("No es posible usar el valor");
            System.exit(0);
        }
        if(ValidateClientData.ValidationIsString(name)){
            this.name = name;
        }else{
            System.out.println("No es posible usar el valor");
            System.exit(0);
        }

    }
}
