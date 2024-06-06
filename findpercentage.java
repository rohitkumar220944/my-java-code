import java.util.Scanner;
public class findpercentage {
    public static void main(String[] args) {
        System.out.println("Total number of subject five:");
        System.out.println("subject 1:");
        Scanner s=new Scanner(System.in);
        float a=s.nextInt();
        System.out.println("subject 2:");
        Scanner o=new Scanner(System.in);
        float b=o.nextInt();
        System.out.println("subject 3:");
        Scanner p=new Scanner(System.in);
        float c=p.nextInt();
        System.out.println("subject 4:");
        Scanner q=new Scanner(System.in);
        float d=q.nextInt();
        System.out.println("subject 5:");
        Scanner r=new Scanner(System.in);
        float e=r.nextInt();
        System.out.println("total marks:");
        float sum=a+b+c+d+e;
        System.out.println(sum);
        System.out.println("percentage:");
        float percentage=sum/5;
        System.out.println(percentage+"%");
    }

    
}