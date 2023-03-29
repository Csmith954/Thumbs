package Thumbs.UI;

import java.util.HashMap;
import java.util.Map;

public class UserOutput {
    UserInput input = new UserInput();

    public void getHomepage(){
        System.out.println("-------------------");
        System.out.println("------Welcome------");
        System.out.println("-------------------");
        System.out.println();
        System.out.println("What message would you like to encode?: ");
    }

    public String getCipher(String inputStr) {
        byte[] bytes = inputStr.getBytes();
        StringBuilder binaryStr = new StringBuilder();
        for (byte bit : bytes){
            int val = bit;
            for (int i = 0; i < 8; i++) {
                binaryStr.append((val & 128) == 0 ? 0:1);
                val <<= 1;
            }
            binaryStr.append(' ');
        }
        String binary = binaryStr.toString();
        return binary;
    }

    public void printThumbs(String binaryMessage){
       StringBuilder thumbsString = new StringBuilder();
        for (int i = 0; i < binaryMessage.length(); i++) {
            if (binaryMessage.charAt(i) == '0'){
                thumbsString.append("\uD83D\uDC4E");
            } else if (binaryMessage.charAt(i) == '1'){
                thumbsString.append("\uD83D\uDC4D");
            } else if (binaryMessage.charAt(i) == ' '){
                thumbsString.append(' ');
            }
        }
        System.out.println(thumbsString.toString());
       }


    public void getOption(){
           System.out.println("Would you like to (E)ncode a message or (D)ecode a message?");
       }

       public void getMessage(){
           System.out.println("What would you like to decode?: ");
       }
    }


