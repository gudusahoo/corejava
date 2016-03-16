class Demo2
{
public static void main(String args[])
{
int i=m1();
    System.out.println("i="+i);
    m1();
    System.out.println(m1());
    int j=m1()*2;
    System.out.println("j="+j);
    }
    static int m1()
    {
        System.out.println("executing m1()");
        return 10;
    }
    
 }