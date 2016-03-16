class X
{   
    int i;
    public static void main(String args[])
    {
        X x1=new X();
        x1.i=10;
        X x2=x1;
        System.out.println(x1.i);
        System.out.println(x2.i);
        x1=null;
        x2=null;
        System.out.println(x1.i);
        System.out.println(x2.i);
    }
}