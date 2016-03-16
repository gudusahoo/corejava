class AA{
    int i;
}

class Run3
{
    public static void main(String args[])
    {
        AA a1=new AA();
        a1.i=10;
        AA a2=a1;
        System.out.println(a2.i);
        a2=new AA();
        System.out.println(a2.i);
    }
}
        