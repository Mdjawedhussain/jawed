import java.util.Scanner;

public class loopsecond {
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter start value :");
        int start = Sc.nextInt();
        System.out.println("Enter the ending value :");
        int end = Sc.nextInt();

        int count = 0;
        for (int i = start; i <= end; i++){
            if (i%2==0)
            count = count+1;
        }
        System.out.println(count);
    }
}
