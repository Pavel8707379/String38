package com.company;

import static java.lang.String.valueOf;

public class Main {

    public static void main(String[] args) {
	String str = "Я изучаю Java";
    String str1 = "скоро стану программистом";
    String str2 = "На улице солнцеа";
    String str3 = "На улице солнце";
    String str4 =  "25 + 40 = 65";

    String result = valueOf(symbol(str));
        System.out.println(result);

        symbolArray(str1);

       // valueOf(symbol(str)) = valueOf(symbol(str)).concat (symbolArray(str1));

        boolean longString  = comparison(str2, str3);
        System.out.println(longString);

        boolean longString2 = comparisonIgnoreCase(str2, str3);
        System.out.println(longString2);

        boolean result2 = comparison2(str,str1);
        System.out.println(result2);

        stringReplace(str4);
        stringReplace2(str4);



    }
    private static char symbol(String str) {  //как правильно оформить?
       char z1 =  str.charAt(0);
        return z1;
    }
    private static void symbolArray(String str1) {
        char[] z2 = new char[19];
        str1.getChars(6, 25, z2, 0);
        System.out.println(z2);
        }

        private static boolean comparison(String str2, String str3) {
            if (str2.equals(str3)) {
                System.out.println("Последние 5 символов совпадают");
                return true;
            } else {
                System.out.println("Последние 5 символов не совпадают");
                return false;
            }
        }
        private static boolean comparisonIgnoreCase (String str2, String str3){
        if (str2.equalsIgnoreCase(str3)){
            System.out.println("Последние 5 символов совпадают");
            return true;
        } else {
            System.out.println("Последние 5 символов не совпадают");
            return false;
        }
    }
    private static boolean comparison2 (String str, String str1){
       if (str.endsWith("z")){
           System.out.println("Совпадение");
       } else {
           System.out.println("Нет совпадения");
       }
        return false;
    }
   // private void comparison3 (String str, String str1) {
     //   if()

    private static void stringReplace (String str4){
        StringBuilder string = new StringBuilder(str4);
        string.deleteCharAt(8);
        string.insert(8, "равно");
        System.out.println(string);
    }
    private static void stringReplace2 (String str4){
        StringBuilder string2 = new StringBuilder(str4);
        string2.replace(7,9, "равно");
        System.out.println(string2);
    }
}

