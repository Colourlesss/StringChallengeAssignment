
/**
 * Write a description of class PPAP here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class PPAP
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ppap(input);
    }
    static void ppap(String input){
        String a = input.substring(9,input.indexOf(','));
        String b = input.substring(input.indexOf(',')+11,input.length());
        System.out.println("Uh! " + b.substring(0,1).toUpperCase()+b.substring(1) + " " + a);
    }
}
