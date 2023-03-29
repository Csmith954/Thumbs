package Thumbs.app;

import Thumbs.UI.UserInput;
import Thumbs.UI.UserOutput;

public class Application {
    UserOutput output = new UserOutput();
    UserInput input = new UserInput();

    public void run(){
        output.getHomepage();
        String binary = output.getCipher(input.getMessage());
        output.printThumbs(binary);


    }

}
