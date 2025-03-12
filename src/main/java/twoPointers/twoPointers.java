package twoPointers;

public class twoPointers {
    public static boolean isPalindrome(String s) {
        if (s.isEmpty()) return true;
        s = s.toLowerCase();
        int right = 0, left = s.length() - 1;
        while (right < left) {
            char r = s.charAt(right);
            char l = s.charAt(left);
            if (!Character.isLetterOrDigit(r)) {
                right++;
                continue;
            }
            if (!Character.isLetterOrDigit(l)) {
                left--;
                continue;
            }

            if (r != l) {
                return false;

            }
            left--;
            right++;
        }
        return true;
    }


    public static void main(String[] args) {

        System.out.println(twoPointers.isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(twoPointers.isPalindrome("race a car"));
        System.out.println(twoPointers.isPalindrome(""));
        System.out.println(twoPointers.isPalindrome(" "));
        System.out.println(twoPointers.isPalindrome(""));
        System.out.println(twoPointers.isPalindrome("BHB"));
        System.out.println(twoPointers.isPalindrome("BB"));

    }
}
