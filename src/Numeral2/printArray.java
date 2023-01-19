package Numeral2;

public class printArray {

    public static void print(Client[] arrayClient){
        for (Client client:arrayClient){
            if(client.name != null && client.id != null){
                System.out.println("Se llama = " + client.name+ " su ID es = " + client.id);
            }else{
                break;
            }

        }
    }

}
