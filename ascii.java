import java.util.Scanner;

public class ascii {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	for(char alphabet = 'A',alpha='a'; alphabet <= 'Z'&&alpha<='z';alphabet++,alpha++) {
	    System.out.print((int)alphabet+" ");	
	    System.out.println((int)alpha+" ");
	}
	sc.close();
}
}
