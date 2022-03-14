import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
	    String[] subArr = str.split(" ");
	    String temp="";
	    int max=subArr[0].length();
	    for(int i=1;i<subArr.length;i++){
	        if(subArr[i].length()>max){
	        max=subArr[i].length();
	        temp = subArr[i];
	        }
	        
	    }
	    System.out.println(temp);
	}
}
