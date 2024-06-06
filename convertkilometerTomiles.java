import java.util.Scanner;
public class convertkilometerTomiles {
    public static void main(String[] args) {
        System.out.println("enter input in kilometer:");
        Scanner s=new Scanner(System.in);
        float a=s.nextFloat();
       // System.out.println(a+" kilometer ");
        double b=a*0.621371;
        System.out.println(a+ " kilometer is equal to "+b+" miles");


    }

    
}