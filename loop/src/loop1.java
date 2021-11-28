import java.util.Scanner;
public class loop1 {
    public static void main(String[]args){
        System.out.println("Enter a number :" );
        Scanner Sc = new Scanner(System.in);

        int num =Sc.nextInt();
        int reverse = 0;
        while (num >0){
            int rem = num% 10;
            reverse = reverse* 10+rem;
            num /=10;


        }
        System.out.println("Reverse :" + reverse);


        }
        }


