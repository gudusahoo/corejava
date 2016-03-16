class Fibonaci
{
public static void main(String args[])
{
java.util.Scanner scn=new java.util.Scanner(System.in);
    System.out.println("Enter a number");
    int a=scn.nextInt();
    int n1=0;int n2=1;int n3=0;
    for(int i=1;i<=a;i++)
    {
        n3=n1+n2;
        System.out.println(n3);
        n1=n2;
        n2=n3;
    }

}
}