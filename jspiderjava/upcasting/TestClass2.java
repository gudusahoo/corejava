class D
{
static void t1()
{
    System.out.println("t1() in D");
}
}
class E extends D
{
    static void t1()
    {
        System.out.println("t1() in E");
    }
}
class F extends D
{
    static void t1()
    {
        System.out.println("t1() in F");
    }
}

class TestClass2
{
    public static void main(String args[])
    {
        D a1=new E();
        
        a1.t1();
        a1=new F();
        a1.t1();
    }
}