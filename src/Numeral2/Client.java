package Numeral2;

public class Client {

    String id;
    String name;


    public Client() {
    }

    public Client(String id, String name) {
        if(ValidateClientData.ValidatationIsInt(id)){
            this.id = id;
        }else{
            System.out.println("No es posible usar el valor");
            return;
        }


        if(ValidateClientData.ValidationIsString(name)){
            this.name = name;
        }else{
            System.out.println("No es posible usar el valor");
           return;
        }

    }
}
