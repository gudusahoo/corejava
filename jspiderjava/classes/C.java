class C
{
static int i;
int j;
    public static void main(String args[])
    {
        System.out.println("main starts");
       C.i=10;
        C c1=new C();
        c1.j=20;
        C c2=new C();
        c2.j=30;
 System.out.println(i);
        System.out.println(c1.j);
    }
}