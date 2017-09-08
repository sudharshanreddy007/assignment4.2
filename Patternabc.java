package toPrintinaPattern;
import java.util.Scanner;
public class Patternabc {

		public static void main(String[] args) {
	
			int j;
			 Scanner sc=new Scanner(System.in);
			//to scan values which we initialize
			 System.out.print("Enter N:\n");
			
			 int n=sc.nextInt();
			//scans next token of the input as int
			 for(int i=1;i<=n;i++)
			{
				for (j=1;j<=(n+1)-i;j++)
					System.out.print(" ");
				for(j=1;j<=2*i-1;j++)
					if(j<=i)
		       System.out.print((char)(char)(j+96)+" ");//for printing values parallely
				//looking into ASCII code and convert them into given alphabets
			else
				System.out.print((char)(char)(2*i-j+96)+" ");//
				System.out.println();
							}
			
			 for(int i=n-1;i>=1;i--)
				{
			for (j=1;j<=(n+1)-i;j++)
			   System.out.print(" ");
			for(j=1;j<=2*i-1;j++)//here it will take the value and jumps into the next line		
			   if(j<=i)
			      System.out.print((char)(char)(j+96)+" ");
						else
					
							System.out.print((char)(char)(2*i-j+96)+" ");
						System.out.println();
							
				}	
		}	 
	}
	
