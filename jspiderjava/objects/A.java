class A
{
    int i;
    public static void main(String args[])
    {
        A a1=new A();
        a1.i=10;
        A a2=new A();
        a2.i=20;
        A a3=new A();
        System.out.println(a1.i);
        System.out.println(a2.i);
        System.out.println(a3.i);
        a2=a1;
        a3=a2;
        a1=a3;
        System.out.println(a1.i);
        System.out.println(a2.i);
        System.out.println(a3.i);
    }
}