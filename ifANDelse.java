import java.util.Scanner;
public class ifANDelse {
    public static void main(String[] args) {
        System.out.println("Enter maths marks:");
        Scanner a=new Scanner(System.in);
        int maths=a.nextInt();
        System.out.println("Enter hindi marks:");
        Scanner b=new Scanner(System.in);
        int hindi=b.nextInt();
        System.out.println("Enter english marks:");
        Scanner c=new Scanner(System.in);
        int english=c.nextInt();
        
        int precentage=(maths+hindi+english)*100/300;
        System.out.println("precentage :"+precentage+"%");
        if(maths>=33&&english>=33&&hindi>=33)
        {
            System.out.println("Pass in all subject !");
        }
        else{
            System.out.println("fail in subject");
        }
        if(precentage>=40)
        {
            System.out.println("over all result status pass");

        }
        else{
            System.out.println("failed !!!");
        }



    }
    
}
