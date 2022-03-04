import java.util.Scanner;
public class ASCII {
    public static void main(String args[]) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter char");
        char ch= reader.next().charAt(0);
        int A=ch;
        System.out.println("ASCII value is : "+A);
    }
}