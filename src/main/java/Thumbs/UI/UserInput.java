package Thumbs.UI;

import java.util.Scanner;

public class UserInput {

    public String getMessage(){
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        return message;
    }

    public String getMessageToDecode(){
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();;
        return message;
    }

    public String selectOption(){
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("e")){
            return choice;
        } else if (choice.equalsIgnoreCase("d")){
            return choice;
        }
        return "Invalid Response! Good Bye!";
    }


}
