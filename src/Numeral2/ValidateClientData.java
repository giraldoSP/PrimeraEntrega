package Numeral2;

public  class ValidateClientData {


    public static boolean ValidationIsString(String name) {

        int len = name.length();

        for (int i = 0; i < len; i++) {
            if ((!Character.isLetter(name.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

    public static  boolean ValidatationIsInt(String id){

        boolean flagId= id.matches("[0-9]+");

        return flagId;
    }





}
