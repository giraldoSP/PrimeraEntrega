package Numeral1;

import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    public void showMenu(){
        int option;
        int position;
        String name;
        String id;
        Client c = null;
        Scanner sn = new Scanner(System.in);
        do{

            System.out.println("1. Añadir nuevo cliente");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");

            System.out.println("Escribe una de las opciones");
            option = sn.nextInt();

            switch (option){
                case 1:
                    System.out.println("Ingrese Nombre de cliente");
                    sn.skip("\\R?");
                    name = sn.nextLine();
                    System.out.println("Ingrese id de cliente");
                    id = sn.nextLine();
                    Client client = new Client(id, name);
                    AddClient.AddClientToArray(client, client.clientArray);
                    break;

                case 2:
                    System.out.println("Ingrese la posicion del cliente que desea eliminar");
                    position = sn.nextInt();

                case 3:
                    printArray.print(c.clientArray);

            }


        }while (option != 5);

    }
}
