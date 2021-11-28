import java.util.Scanner;
public class sixth {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int age1;
            int age2;
            int age3;
            System.out.print("Enter the age of peron1:");
            age1=sc.nextInt();
            System.out.print("Enter the age person2:");
            age2=sc.nextInt();
            System.out.print("Enter the age person3");
            age3=sc.nextInt();
            if (age1>age2 && age1>age3){
                System.out.print("Person1 with "+age1+"is older");
                System.out.print("Person1 with "+age1+"is older");
            }else if(age2>age3 && age2>age1){
                System.out.print("Person2 with "+age2+ " is older");
            }

        }
    }

