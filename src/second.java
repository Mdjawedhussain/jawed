import java.util.Scanner;
public class second {
        public static void main(String[] args){
            Scanner sc =new Scanner(System.in);
            float principal;
            float time;
            float rate;
            float result;
            System.out.print("Enter the principal:");
            principal=sc.nextInt();
            System.out.print("Enter the time");
            time=sc.nextInt();
            System.out.print("Enter the rate:");
            rate= sc.nextInt();
            result=(principal*time*rate)/100;
            System.out.print("Interest is "+ result);
        }
    }

