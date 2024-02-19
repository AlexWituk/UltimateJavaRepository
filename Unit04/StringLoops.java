package Unit04;

public class StringLoops {

    public static boolean xyzThere(String str) {

        for (int i = 0; i <= str.length() - 3; i++) {
            // found an "xyz"
            if (str.substring(i, i + 3).equals("xyz")) {
                // if it's a ".xyz"
                if (i > 0 && str.substring(i - 1, i).equals(".")) {
                    // do nothing
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    public static String zipZap(String str) {
        String result = "";

        for (int i = 0; i <= str.length() - 3; i++) {
            // if I find zip, zap, zsp, etc
            if (str.substring(i, i + 1).equals("z") &&
                    str.substring(i + 2, i + 3).equals("p")) {
                result += "zp";
                i += 2;
            } else {
                result += str.substring(i, i + 1);
            }
        }

        if (str.length() < 3) {
            result += str;
        } else if (str.substring(str.length() - 3, str.length() - 2).equals("z") &&
                str.substring(str.length() - 1).equals("p")) {
            // do nothing
        } else {
            result += str.substring(str.length() - 2);
        }

        return result;
    }

    public static String doubleChar(String str) {
        String result = "";
        
        for (int i = 0; i < str.length(); i++) {
            result += str.substring(i, i+1) + str.substring(i, i+1);
        }
        
        return result;
    }

    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i <= str.length()-4; i++) {
            if (str.substring(i, i+2).equals("co") && str.substring(i+3, i+4).equals("e")) {
                count++;
            }
        }
        
        return count;
    }

    public static boolean bobThere(String str) {
        boolean bobPresent = false;
        for (int i = 0; i <= str.length()-3; i++)
        if (str.substring(i, i+1).equals("b") && str.substring(i+2, i+3).equals("b")) {
            bobPresent = true;
        }

        return bobPresent;
    }

    public static boolean prefixAgain(String str, int n) {
        boolean pThere = false;

        for (int i = n; i <= str.length()-n; i++) {
            if (str.substring(0,n).equals(str.substring(i,i+n))) {
                pThere = true;
            }
        }

        return pThere;
    }

    public static boolean sameStarChar(String str) {
        boolean star = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i+1).equals("*")) {
                if (i == 0 || i == str.length()-1) {
                    
                }
                else if (str.substring(i-1,i).equals(str.substring(i+1,i+2))) {
                    star = true;
                }
                else {
                    star = false;
                }
            }
        }

        return star;
    }

    public static String starOut(String str) {

        
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i+1).equals("*")) {
                if (i == 0 || i == str.length()-1) {
                    if (i == 0) {
                        if (str.length() > 1) {
                            str = str.substring(i+2, str.length());
                            i--;
                        }
                        else {
                            str = "";
                        }
                    }
                    else {
                        str = str.substring(0, i-1);
                    }
                }
                else {
                    if (str.length()-i >= 3) {
                        if (str.substring(i,i+3).equals("***")) {
                            str = str.substring(0, i-1) + str.substring(i+4, str.length());
                        }
                        else if (str.substring(i,i+2).equals("**")) {
                            str = str.substring(0, i-1) + str.substring(i+3, str.length());
                        }
                        else {
                            str = str.substring(0, i-1) + str.substring(i+2, str.length());
                        }
                    }
                    else if (str.length()-i >= 2) {
                        if (str.substring(i,i+2).equals("**")) {
                            str = str.substring(0, i-1) + str.substring(i+3, str.length());
                        }
                        else {
                            str = str.substring(0, i-1) + str.substring(i+2, str.length());
                        }
                    }
                    else if (str.length()-i >= 1) {
                        str = str.substring(0, i-1) + str.substring(i+2, str.length());
                    }
                    else {
                        str = str.substring(0, i);
                    }
                    i--;
                }
            }
        }
        
        
        // have to do something with the i equals after deleting because rn it is skipping stars
        return str;
    }

    public static int countHi(String str) {
        int result = 0;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.substring(i, i+2).equals("hi")) {
                result++;
            }
        }
        return result;
    }

    public static boolean endOther(String a, String b) {
        boolean end = false;
        String endA = "";
        String endB = "";

        if (a.length() > b.length()) {
            endA = a.substring(a.length()-b.length(), a.length());
            endB = "";
        }
        else if (a.length() < b.length()) {
            endB = b.substring(b.length()-a.length(), b.length());
            endA = "";
        }
        else {
            endA = a;
            endB = b;
        }

        if (endA.toLowerCase().equals(b.toLowerCase()) || endB.toLowerCase().equals(a.toLowerCase())) {
            end = true;
        }
        return end;
    }

    public static boolean xyBalance(String str) {
        boolean balance = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i+1).equals("x")) {
                balance = false;
            }
            else if (str.substring(i, i+1).equals("y")) {
                balance = true;
            }
        }
        
        return balance;
    }


    public static String plusOut(String str, String word) {
        String result = "";
        int n = word.length();
        for (int i = 0; i <= str.length()-n; i++) {
            if (str.substring(i, i+n).equals(word)) {
                result += word;
                i += n-1;
            }
            else {
                result += "+";
            }
        }

        if (str.substring(str.length()-word.length(), str.length()).equals(word)) {

        }
        else {
            int remainder = word.length()-1;
            //result += remainder;
            for (int i = remainder; i > 0; i--) {
                result += "+";
            }
        }
    
        return result;
    }

    public static boolean catDog(String str) {
        int cat = 0;
        int dog = 0;

        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i, i+3).equals("dog")) {
                dog++;
            }
            else if (str.substring(i, i+3).equals("cat")) {
                cat++;
            }
        }

        if (cat == dog) {
            return true;
        }
        else {
            return false;
        }
    }

    public static String mixString(String a, String b) {
        String result = "";
        if (a.length() > b.length()) {
            for (int i = 0; i < b.length(); i++) {
                result += a.substring(i, i+1) + b.substring(i, i+1);
            }
            result += a.substring(b.length(), a.length());
        }
        else if (b.length() > a.length()) {
            for (int i = 0; i < a.length(); i++) {
                result += a.substring(i, i+1) + b.substring(i, i+1);
            }
            result += b.substring(a.length(), b.length());
        }
        else {
            for (int i = 0; i < a.length(); i++) {
                result += a.substring(i, i+1) + b.substring(i, i+1);
            }
        }

        return result;
    }

    public static String repeatSeparator(String word, String sep, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            if (i != count-1){
                result += word + sep;
            }
            else {
                result += word;
            }
        }
        return result;
    }
}
