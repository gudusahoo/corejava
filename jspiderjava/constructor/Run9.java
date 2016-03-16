class C
{
    C()
    {
    System.out.println("default ctt");
    }
    C(int i)
    {
        this();
        System.out.println("1 parameterized ctt");
    }
    C(int i,int j)
    {
        this(10);
        System.out.println("2 parameterized ctt");
    }
}

class Run9
{
    public static void main(String args[])
    {
        C c=new C(10,20);
    }
}