import java.util.Scanner;
class Mountain{
public static void main(String args[]){
Scanner scn=new Scanner(System.in);
System.out.println("Enter a number");
 int n=scn.nextInt();
 for(int i=1;i<=n;i++)
 {
  for(int j=1;j<=i;j++)
   {System.out.print("*");
   for(int k=1;k<=(n*2)-(i*2);k++)
   {System.out.print(" ");
    for(int l=1;l<=i;l++)
	{System.out.print("*");
	}
}
}
	}
	System.out.println();
	}
	}
	
