package Numeral2;

import java.util.Arrays;

public class AddClient {


    static int counter = 0;
    static Client[] clientArray = new Client[4];
    public static void AddClientToArray(Client client){
        BiggerArray biggerArray = new BiggerArray();
        int arraySize;
        printArray p = new printArray();
        if (counter<=3) {
            clientArray[counter] = client;
            counter++;
        } else if (counter > 3  &&  counter < 10 ) {

            System.out.println(clientArray.length);
            clientArray = Arrays.copyOf(clientArray, counter+1);
            System.out.println(clientArray.length);

            clientArray[clientArray.length-1] = client;
            p.print(clientArray);
            counter++;



        } else{
            System.out.println("Eliminar primero un cliente para poder agregar");
            return;
        }
    }

}
