import java.util.Scanner;

public class PatternPrinting {
 public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);

		int n;
	
		n = sc.nextInt();

		for(int i=0;i<n;i++)
		{
            if(i==n-1)
                System.out.println("*");
            else
			    System.out.print("* ");
		}

		for(int i=0;i<n;i++)
		{
			System.out.println("*");
		}

        sc.close();

	}
    
}