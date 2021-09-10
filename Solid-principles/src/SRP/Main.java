package SRP;

public class Main {
    public static void main(String[] args) {
        Text_Manipulator text_manipulator = new Text_Manipulator("Naincy Kumari Gupta ");
        TextPrinter textPrinter = new TextPrinter(text_manipulator);
        System.out.println(text_manipulator.appendText("SRP_Code_Example"));
        textPrinter.printOutEachWordOfText();
    }
}
