class X
{
    int i;
    X(int i)
    {
        this.i=i;
    }
    void display(X x)
    {
        System.out.println(i);
        System.out.println(x.i);
        System.out.println("----------");
    }
}
class Run7
{
    public static void main(String args[])
    {
        X x1=new X(10);
        X x2=new X(5);
        x1.display(x2);
        x2.display(x1);
        x2.display(x2);
        x1.display(new X(50));
    }
}