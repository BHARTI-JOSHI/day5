package day5;

import java.util.Scanner;

public class diamond {
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int num=s.nextInt();
		int i,j,k;
		for (i=1;i<=num;i++)
			{for(j=1;j<=i;j++)
				{System.out.print("*");
				}
			
			System.out.println("  ");
			}
		for (i=1;i<=num-1;i++)
			{for(j=num-1;j>=i;j--)
				System.out.print("*");
			System.out.println(" ");
			}

	}
}
