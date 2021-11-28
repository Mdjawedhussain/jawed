import java.util.Scanner;

public class verticalprint {
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter the word :");
        String word = Sc.nextLine();

        for (int i=0;i<word.length();i++){
            System.out.println(word.charAt(i));

        }
    }
}
