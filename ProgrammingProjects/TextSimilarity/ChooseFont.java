package ProgrammingProjects.TextSimilarity;

import java.awt.*;
import java.util.Locale;
import java.util.Scanner;

import org.apache.commons.text.similarity.FuzzyScore;

public class ChooseFont {
    public static void main(String[] args) {
        String[] allFonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

        for (String e : allFonts) {
            System.out.println(e);
        }

        Scanner s = new Scanner(System.in);

        System.out.println("Choose a font: ");
        String word = s.nextLine();
        s.close();

        FuzzyScore fuzzyNum = new FuzzyScore(Locale.getDefault());

        int highestFuzzy = 0;
        String bestFuzzy1 = "";
        for (String e : allFonts) {
            if (fuzzyNum.fuzzyScore(word, e) > highestFuzzy) {
                highestFuzzy = fuzzyNum.fuzzyScore(word, e);
                bestFuzzy1 = e;
            }
        }

        highestFuzzy = 0;
        String bestFuzzy2 = "";
        for (String e : allFonts) {
            if (fuzzyNum.fuzzyScore(word, e) > highestFuzzy && e != bestFuzzy1) {
                highestFuzzy = fuzzyNum.fuzzyScore(word, e);
                bestFuzzy2 = e;
            }
        }

        highestFuzzy = 0;
        String bestFuzzy3 = "";
        for (String e : allFonts) {
            if (fuzzyNum.fuzzyScore(word, e) > highestFuzzy && e != bestFuzzy1 && e != bestFuzzy2) {
                highestFuzzy = fuzzyNum.fuzzyScore(word, e);
                bestFuzzy3 = e;
            }
        }

        System.out.println("Top 3 matches: ");
        System.out.println(bestFuzzy1);
        System.out.println(bestFuzzy2);
        System.out.println(bestFuzzy3);
        
    }

}