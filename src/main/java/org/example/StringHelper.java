package org.example;

public class StringHelper {

    public static String reverse(String text){

        String reverseString = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverseString += text.charAt(i);
        }
        System.out.println(text);
        System.out.println(reverseString);

        StringBuilder builder = new StringBuilder().append(text);
        reverseString = builder.reverse().toString();

        System.out.println(reverseString);

    return reverseString;
    }

    public static String encoder(String text) {

        String newText = "";
        int numbers = 0;

        for (int i = 0; i < text.length(); i++) {
            if(text.toLowerCase().charAt(i) == 'a' || text.toLowerCase().charAt(i) == 'e' || text.toLowerCase().charAt(i) == 'i'
                    || text.toLowerCase().charAt(i) == 'o' || text.toLowerCase().charAt(i) == 'u') {
                newText += numbers;
                numbers++;

            }
            else {
                newText += text.charAt(i);
            }
        }

        return newText;

    }
}
