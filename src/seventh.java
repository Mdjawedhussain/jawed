import java.util.Scanner;
public class seventh {
        public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            float firstNumber;
            float secondNumber;
            System.out.print("Enter the first Number:");
            firstNumber=sc.nextInt();
            System.out.print("Enter the second Number:");
            secondNumber=sc.nextInt();
            if (firstNumber>secondNumber)
                System.out.print(firstNumber+"is greater");
            else if (secondNumber>firstNumber)
                System.out.print(secondNumber+"is greater");
            else
                System.out.print("both numbers are equal");
        }


    }

