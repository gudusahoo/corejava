class B
{
    int i;
    void display()
    {
        System.out.println("display starts");
         System.out.println(i);
         System.out.println("display ends");
    }
}
class Demo5
{
    public static void main(String args[])
    {
        B b1=new B();
        b1.display();
        b1.i=10;
        b1.display();
    }
}
