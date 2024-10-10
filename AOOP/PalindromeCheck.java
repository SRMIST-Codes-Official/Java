import java.util.*;
class stringpalindrome{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        int left = 0;
        int right = s.length() - 1;
        boolean palindrome = true;

        while(left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }

        if(palindrome) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Not a palindrome");
        }

        sc.close(); 
    }
}
