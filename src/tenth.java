import java.util.Locale;
import java.util.Scanner;

public class tenth {
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter a character :");
        char chr = Sc.next().toLowerCase().charAt(0);
        //'e'
        switch (chr){
            case 'a':
                System.out.println("vowel");
                break;
            case 'e':
                System.out.println(" vowel");
                break;
            case 'i':
                System.out.print("vowel");
                break;
            case 'o':
                System.out.print(" vowel");
                break;
            case 'u':
                System.out.print(" vowel ");
                break;
            default:
                System.out.print(" Consonent ");
                break;
        }
    }
}
