package Numeral2;

public class BiggerArray {
    public BiggerArray() {

    }

    public static Client[] changeArraySize(Client[] client){

        Client[] temp = new Client[client.length + 1];

        for (int i = 0; i < client.length; i++){
            temp[i] = client[i];
        }
        return temp;
    }

}

