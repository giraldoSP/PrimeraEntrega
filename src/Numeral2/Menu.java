package Numeral2;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public void showMenu(){
        int option;
        int position;
        String name;
        String id;
        ArrayList array = new ArrayList<>();
        DeleteClient deleteClient = new DeleteClient();
        AddClient  addClient = new AddClient();

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
                    addClient.AddClientToArray(client);
                    break;

                case 2:
                    System.out.println("Ingrese la cedula del cliente que desea eliminar");
                    id = sn.nextLine();
                    deleteClient.delete(id);

                case 3:
                    System.out.println("Ingrese la cedula del cliente que desea buscar");
                    id = sn.nextLine();


            }


        }while (option != 5);

    }
}
