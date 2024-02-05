package Unit03.Xtras;
import java.util.Scanner;

public class BasicTextAnalysis {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter your text: ");
        s.useDelimiter("\\Z");
        String text = s.next();
        s.close();

        int length = text.length();

        int fWI = text.indexOf(" ");
        String firstWord = text.substring(0, fWI);

        int fSI = text.indexOf(".");
        String firstSentence = text.substring(0, fSI);
    



        System.out.println("The length is: " + length +"\nThe first word is: " + firstWord + "\nThe first sentence is: " + firstSentence);


    }
}

// Enter your text interactively
// javac Unit03/Xtras/BasicTextAnalysis.java
// java Unit03.Xtras.BasicTextAnalysis

// Use a file as input
// javac Unit03/Xtras/BasicTextAnalysis.java
// cat Unit03/Xtras/gettysburg-address.txt | java Unit02.Xtras.BasicTextAnalysis
