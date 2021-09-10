package SRP;

import java.util.Arrays;

public class TextPrinter {
    Text_Manipulator textManipulator;

    public TextPrinter(Text_Manipulator textManipulator ){
        this.textManipulator = textManipulator;
    }

    public void printText(){
        System.out.println(textManipulator.getText());
    }

    public void printOutEachWordOfText(){
        System.out.println(Arrays.toString(textManipulator.getText().split(" ")));
    }

    public void printRangeOfCharacters(int startingIndex, int endIndex){
        System.out.println(textManipulator.getText().substring(startingIndex,endIndex));
    }
}