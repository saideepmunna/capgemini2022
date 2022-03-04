import java.util.Scanner;
public class SwapElements {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter no.1");
        int n1=reader.nextInt();
        System.out.println("Enter no.2");
        int n2=reader.nextInt();
        int temp;
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("n1 ="+n1);
        System.out.println("n2="+n2);
    }

}