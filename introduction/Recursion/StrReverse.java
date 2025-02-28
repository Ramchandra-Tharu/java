package Recursion;

public class StrReverse {
    static String reverse(String str, int index) {
        if (index == 0) {
            return str.charAt(index) + "";
        }
        return str.charAt(index) + reverse(str, index - 1);
    }

    public static void main(String[] args) {
        String str = "Sirzan";
        String rev = reverse(str, str.length() - 1);
        System.out.println(rev);
    }
}

