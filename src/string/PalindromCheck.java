package string;

public class PalindromCheck {
    public static void main(String[] args) {
        String str1 = "Racecar";
        String str2 = "silent";

        boolean result = str1.equalsIgnoreCase(new StringBuilder(str1).reverse().toString());
        System.out.println("Palindrop check of "+str1+" is "+ result);

        boolean result1 = str2.equalsIgnoreCase(new StringBuilder(str2).reverse().toString());
        System.out.println("Palindrop check of "+str2+" is "+ result1);

    }
}
