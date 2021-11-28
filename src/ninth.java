import java.util.Scanner;
public class ninth {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int age;
        boolean male;

        System.out.print("Enter the age:");
        age=sc.nextInt();
        if (age>20)
            System.out.print(age+ " you are male");
        else
            System.out.print(age + "you are female");

    }
}
