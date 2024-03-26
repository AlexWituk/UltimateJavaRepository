package ProgrammingProjects.TextSimilarity;

import java.util.Locale;
import java.util.Scanner;

import org.apache.commons.text.similarity.FuzzyScore;
import org.apache.commons.text.similarity.LevenshteinDistance;

public class GettingStarted {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter your first word: ");
        String word1 = s.nextLine();

        System.out.println("Please enter your second word: ");
        String word2 = s.nextLine();
        s.close();

    
        FuzzyScore fuzzyNum = new FuzzyScore(Locale.getDefault());
        LevenshteinDistance lDistance = new LevenshteinDistance();
        

        System.out.println("The Fuzzy Score between '" + word1 + "' and '" + word2 + "' is: " + fuzzyNum.fuzzyScore(word1, word2));
        System.out.println("The Levenshtein Distance between '" + word1 + "' and '" + word2 + "' is: " + lDistance.apply(word1, word2));

        // to create a new FuzzyScore object you need to pass in a Locale object.
        // You can get a Locale object with
        // Locale.getDefault()
    }
}
