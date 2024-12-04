// VALID PALINDROME
// Write a function that takes a string, s, as an input and determines whether it is a palindrome.

public class ValidPalindrome {
    public static void main(String[] args){

        System.out.println(isPalindrome("Racecar"));
    }

    private static boolean isPalindrome(String s){
        if(s.isEmpty()){
            return true;
        }

        int start = 0;
        int last = s.length() - 1;
        while(start <= last){
            char currentFirst = s.charAt(start);
            char currentLast = s.charAt(last);

            if(!Character.isLetterOrDigit(currentFirst)){
                start ++;
            }else if(!Character.isLetterOrDigit(currentLast)){
                last --;
            }else{
                if(Character.toLowerCase(currentFirst) != Character.toLowerCase(currentLast)){
                    return false;
                }
                start++;
                last--;
            }
        }
        return true;
    }
}
