class XX
{
int i;
void display()
{
int i=1;
System.out.println(i);
System.out.println(this.i);
}
}
class ThisTest
{
public static void main(String args[])
{
XX x1=new XX();
x1.i=10;
x1.display();

XX x2=new XX();
x2.i=20;
x2.display();
}
}