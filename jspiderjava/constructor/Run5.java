

class B
{
    int i;
    int j;
    
    B(int i,int j)
    {
        this.i=i;
        this.j=j;
    }
}
class A
{
    void m1(B b1)
    {
        System.out.println(b1.i);
        System.out.println(b1.j);
    }
    
}


class Run5
{
    public static void main(String args[])
    {
        A a1=new A();
        B b1=new B(10,20);
    
        a1.m1(b1);
        a1.m1(new B(50,60));
    }
}