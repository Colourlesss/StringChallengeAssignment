
/**
 * Write a description of class binaryConversion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class binaryConversion
{
    // instance variables - replace the example below with your own
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        System.out.println(toBinary(input));
    }
    public static String toBinary(int input){
                String ans = "";
        while(input!=0){
            ans = input%2 + ans;
            input = input/2;
        }
        return ans;
    }
}
