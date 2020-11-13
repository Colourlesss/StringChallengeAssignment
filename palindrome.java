
import java.util.Scanner;
public class palindrome
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if(isPalindrome(input)){
            System.out.println("\""+ input + "\"" + " is a palindrome");
        }else{
            System.out.println("\""+ input + "\"" + " is not a palindrome");
        }
    }
    static boolean isPalindrome(String input){
        input = input.toLowerCase();
        String newInput = "";
        for(int i = 0;i<input.length();i++){
            if(Character.isLetter(input.charAt(i))){
                newInput +=input.charAt(i);
            }
        }
        for(int i = 0;i<newInput.length()/2;i++){
            if(newInput.charAt(i) == newInput.charAt(newInput.length()-1-i)){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
