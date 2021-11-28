import java.util.Scanner;
public class eighth {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int first;
        int rem;
        int result1;
        System.out.print("Enter the Number:");
        first=sc.nextInt();

         rem = first % 10;
        result1 = rem / 10;
        rem = result1 * 10 + rem;

        if (rem == first)
            System.out.print(first+ "is a palindrome number");
        else
            System.out.print(first + "is not a palindrome");

    }

}
