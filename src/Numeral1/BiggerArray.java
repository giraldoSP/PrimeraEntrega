package Numeral1;

public class BiggerArray {
    public BiggerArray() {

    }

    public static Client[] changeArraySize(Client client[]){

        int arraySize = client.length;
        Client[] clientArray = new Client[client.length+1];

        for (int i = 0; i < arraySize; i++) {
            clientArray[i] = client[i];
        }
        return clientArray;
    }
}
