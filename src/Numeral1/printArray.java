package Numeral1;

public class printArray {

    public static void print(Client[] arrayClient){
        for (Client client:arrayClient){
            System.out.println("Se llama = " + client.name+ "su ID es = " + client.id);
        }
    }

}
