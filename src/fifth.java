import java.util.Scanner;
public class fifth {
        public static void main(String[] args){
            Scanner sc= new Scanner(System.in);
            float quantity;
            System.out.print("Enter the quantity:");
            quantity=sc.nextInt();
            if (quantity<=1000){
                System.out.print("You have to pay Rs"+ quantity);
            }else {
                System.out.print("You have to pay Rs:"+(quantity-(0.1*quantity)));
            }


        }



    }

