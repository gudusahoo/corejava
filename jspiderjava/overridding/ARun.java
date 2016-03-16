class A
{
    int i=10;
}
class B extends A
{
    int i=20;
    void m1()
    {
        
        System.out.println(super.i);
        System.out.println(this.i);
    }
}
class ARun
{
    public static void main(String args[])
    {
        B b1=new B();
        b1.m1();
    }
}
