
/**
 * Write a description of class pigLatin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class pigLatin
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] array = input.split(" ");
        for(int i = 0;i<array.length;i++){
            if(array[i].length() > 2){
            System.out.print(toPigLatin(array[i]) + " ");
            }else{
            System.out.print(array[i] + " ");
            }
        }
    }
    public static String toPigLatin(String input){
        return input.substring(1) + input.substring(0,1) + "ay";
    }
}
