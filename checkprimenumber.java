import java.util.Scanner;
public class checkprimenumber {
    public static void main(String[] args)
    {   int num=9;
        System.out.println("Enter number:");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        boolean prime=true;
        
            for(int j=2;j<=num-1;j++)
            {
                if(j%a==0)
                {
                    prime=false;
                    break;
                }
                else{
                    prime=true;
                }
            }
                
                    System.out.println("Number is prime");
                    System.out.println(prime);
                
            }
        
        
    }

    

