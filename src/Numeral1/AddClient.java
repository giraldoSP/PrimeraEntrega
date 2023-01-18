package Numeral1;

public class AddClient {


    static int counter = 0;
    public static void AddClientToArray(Client client, Client [] arrayClient ){
        BiggerArray biggerArray = new BiggerArray();
        int arraySize;

        if (arrayClient.length<=3) {
            arrayClient[counter] = client;
            counter++;
        } else if (arrayClient.length > 3 &&  arrayClient.length < 10 ) {

            arraySize = arrayClient.length;
            arrayClient = biggerArray.changeArraySize(arrayClient);
            arrayClient[arraySize+1] = client;

        } else{
            System.out.println("Eliminar primero un cliente para poder agregar");
            System.exit(0);
        }
    }

}
