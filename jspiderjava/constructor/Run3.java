class B
{
    B()
    {
        System.out.println("default ctt");
    }
    B(int i)
    {
        System.out.println("ctt with one int arg");
    }
}

class Run3
{
    public static void main(String args[])
    {
        new B();
        new B(10);
    }
}