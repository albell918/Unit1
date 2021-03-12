package Bie_edu;

/**
 * @author Bieliaiev Oleksandr
 * @version 1.0.0
 * @project Unit1
 * @class Palindrom
 * @since 09.03.2021 - 17.55
 */


public class Palindrom {

    public static boolean isPalindrom1(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я]", "");
        // remove garbage
        text = text.toLowerCase();

        boolean result = true;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                result = false;
                break;
            }
        }
        return result;
    }

    // use StringBuilder
    public static boolean isPalindrom2(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я]",""); // remove garbage
        text = text.toLowerCase();
        StringBuilder sb = new StringBuilder(text);
        String reversed = sb.reverse().toString();
        boolean result;
        if (text.equals(reversed)) {
            result = true;
        }else {
            result = false;
        }
        return result;
    }

    // build a  reverse string
    public static boolean isPalindrom3(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я]", "");
        // remove garbage
        text = text.toLowerCase();
        boolean result = true;

        char[] array = text.toCharArray();
        String currentString = "";
        for (int i = array.length - 1; i >= 0; i--) {
            currentString = currentString + array[i];


        }

        if (!currentString.equals(text)) {
            result = false;
        }


        return result;
    }

    public static void main(String[] args) {


        String text = "abcdcba";
        String text2 = "abiaiba";
        String text3 = "fjfqwe";

        System.out.println(" The first way");
        System.out.println(text + " is a palindrom   - "
                + isPalindrom1(text));

        System.out.println(" The second way");
        System.out.println(text2 + " is a palindrom   - "
                + isPalindrom2(text2));

        System.out.println(" The third way");
        System.out.println(text3 + " is a palindrom   - "
                + isPalindrom3(text3));

    }
}
