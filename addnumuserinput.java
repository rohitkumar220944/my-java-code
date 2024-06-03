import java.util.Scanner;
public class addnumuserinput {
     public static void main(String[] args)
     {
        System.out.println("Taking input from user:");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number:");
        int a=s.nextInt();
        System.out.println("Enter number:");
        int b=s.nextInt();
        int sum=a+b;
        System.out.println("The sum of two num:");
        System.out.println(sum);

     }
}
