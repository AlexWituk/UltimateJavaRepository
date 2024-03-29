package ProgrammingProjects.TextSimilarity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import org.apache.commons.text.similarity.FuzzyScore;
import org.apache.commons.text.similarity.LevenshteinDistance;

public class UsingDictionary {

    public static String[] getEnglishWords() {
        ArrayList<String> words = new ArrayList<String>();

        try (BufferedReader br = new BufferedReader(new FileReader("ProgrammingProjects/TextSimilarity/words.txt"))) {
            String curLine;
            while ((curLine = br.readLine()) != null) {
                words.add(curLine);
            }
        } catch (IOException e) {
            System.out.println("Exception occurred");
            System.err.println(e);
        }
        return words.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your word: ");
        String word = s.nextLine();
        s.close();

        FuzzyScore fuzzyNum = new FuzzyScore(Locale.getDefault());
        LevenshteinDistance lDistance = new LevenshteinDistance();


        int highestFuzzy = 0;
        String bestFuzzy = "";
        for (String e : getEnglishWords()) {
            if (fuzzyNum.fuzzyScore(word, e) > highestFuzzy) {
                highestFuzzy = fuzzyNum.fuzzyScore(word, e);
                bestFuzzy = e;
            }
        }

        System.out.println("Closest word using fuzzy algorithm was: " + bestFuzzy);

        int lowestLev = Integer.MAX_VALUE;
        String bestLev = "";
        for (String e : getEnglishWords()) {
            if (lDistance.apply(word, e) < lowestLev) {
                lowestLev = lDistance.apply(word, e);
                bestLev = e;
            }
            
        }

        System.out.println("Closest word using Levenshtein algoritm was: " + bestLev);


    }
}
