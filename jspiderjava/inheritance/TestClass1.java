class C
{
    C()
    {
        System.out.println("c ctt");
    }
}
class D extends C
{
    D()
    {
        System.out.println("D ctt");
    }
}
class E extends D
{
    E()
    {
        System.out.println("E ctt");
    }
}

class TestClass1
{
    public static void main(String args[])
    {
        new E();
    }
}