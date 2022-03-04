import java.util.Scanner;
public class LargestNumber {
    public static void main(String args[]) {
        Scanner reader= new Scanner(System.in);
        System.out.println("no.1");
        int n1=reader.nextInt();
        System.out.println("no.2");
        int n2=reader.nextInt();
        System.out.println("no. 3");
        int n3=reader.nextInt();
        System.out.println(n1>((n2>n3)?n2:n3)?n1:n2>n3?n2:n3);
    }

}