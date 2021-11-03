package StringPractise;

public class String1 {

public String helloName(String name) {
        String str = "Hello";

        return str + " " + name;
    }

    public String makeTags(String tag, String word) {

        return "<" + tag + ">" + word + "<" + tag + "/>";

    }

    public String extraEnd(String str) {

        String result = str.substring(str.length() - 2);

        return str.substring(str.length() - 2);
    }


    //Given a string of even length, return the first half. So the string "WooHoo" yields "Woo"
    public String firstHalf(String str) {

        return str.substring(0, str.length() / 2);
    }
    //Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.

    public String withoutEnd(String str) {
        if (str.length() >= 2) {
            return str.substring(1, str.length() - 1);
        }
        return str;
    }

    public String comboString(String a, String b) {
        if (a.length() > b.length()) {
            return b + a + b;
        }
        if (a.length() < b.length()) {
            return a + b + a;
        }

        return "";

    }

    //Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.
    public String nonStart(String a, String b) {

        if (a.length() > 2 && b.length() > 2) {
            String res = a.substring(1, 2).concat(b.substring(1, 2));
            return res;
        }
        return "";


    }

    //Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.
    public String left2(String str) {
        if (str.length() > 2) {
            String firstTwoLetters = str.substring(3);
            String split = str.substring(1, 2);
            String ActualResult = split.concat(firstTwoLetters);
            return ActualResult;
        }
        return str;
    }

    //Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.
    public String right2(String str) {
        return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
    }

//Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.


    public String theEnd(String str, boolean front) {
        if (front) {
            return str.substring(0, 1);
        } else {

            return str.substring(str.length() - 1);
        }
    }

    //Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.
    public String middleTwo(String str) {
        int mid = str.length() / 2;
        return str.substring(mid - 1, mid + 1);
    }

    public boolean endsLy(String str) {
        if (str.substring(str.length() - 2).contains("ly")) {
            return true;
        }
        return false;
    }

    //Given a string and an int n, return a string made of the first and last n chars from the string.
// The string length will be at least n. (will substring till the n )
    public String nTwice(String str, int n) {
        return str.substring(0, n) +
                str.substring(str.length() - n);
    }

//Given a string and an index, return a string length 2 starting at the given index.
// If the index is too big or too small to define a string length 2, use the first 2 chars.
// The string length will be at least 2.


    public String twoChar(String str, int index) {
        if (index < 0 || index + 2 > str.length())
            return str.substring(0, 2);
        return str.substring(index, index + 2);
    }

    public String middleThree(String str) {
        int len = str.length();
        if (len == 3) return str;
        return str.substring(len / 2 - 1, len / 2 + 2);

    }

    //Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx".
// The string may be any length, including 0. Note: use .equals() to compare 2 strings.
    public boolean hasBad(String str) {
        int len = str.length();
        if (len == 3) {
            return str.substring(0, 3).equals("bad");
        }
        if (len >= 4) {
            return str.substring(0, 3).equals("bad") ||
                    str.substring(1, 4).equals("bad");
        }


        return false;
    }
//Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya".
// If either string is length 0, use '@' for its missing char.

    public String lastChars(String a, String b) {
        int firstStr = a.length();
        int secondStr = b.length();
        String sh = "@";
        if (firstStr == 0 && secondStr > 0) {
            return sh + b.substring(secondStr - 1);
        }
        if (secondStr == 0 && firstStr > 0) {
            return a.charAt(0) + sh;
        }
        if (firstStr > 0 && secondStr > 0) {
            return a.charAt(0) + b.substring(secondStr - 1);
        }

        return "@@";

    }

    //Given two strings, append them together (known as "concatenation") and return the result. However,
// if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".
    public String conCat(String a, String b) {

        if (a.length() == 0 || b.length() == 0)

            return a + b;

        if (a.substring(a.length() - 1).equals(b.substring(0, 1)))

            return a + b.substring(1);

        else

            return a + b;

    }

    public String lastTwo(String str) {

        String withOutLastTwo = str.substring(0, str.length() - 2);// with out last 2 chars
        char preLastChar = str.charAt(str.length() - 2);
        char lastChar = str.charAt(str.length() - 1);

        if (str.length() < 2) {
            return str;
        } else {
            return withOutLastTwo + lastChar + preLastChar;
        }

    }

    //Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.
    public String seeColor(String str) {

        if (str.startsWith("red")) {
            return str.substring(0, 3);
        }
        if (str.startsWith("blue")) {
            return str.substring(0, 4);
        }
        return "";
    }

    public boolean frontAgain(String str) {
        if (str.substring(0,2).equals(str.substring(str.length()-2))){
            return true;
        }
        return false;
    }



}
