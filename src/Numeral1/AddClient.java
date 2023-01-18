package Numeral1;

public abstract class AddClient {



    public static void AddClientToArray(Client client, Client [] arrayClient ){

        if (arrayClient.length<3) {
            arrayClient[arrayClient.length+1] = client;
        }else if(arrayClient.length>10){
            System.out.println("Eliminar primero un cliente para poder agregar");
            System.exit(0);
        }
    }

}
