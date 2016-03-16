class C
{
    int i=10;
}
class Test3
{
    public static void main(String args[])
    {
        final C c1=new C();
        System.out.println(c1.i);
        c1.i=20;
        System.out.println(c1.i);
       // c1=new C(); ce
    }
}
