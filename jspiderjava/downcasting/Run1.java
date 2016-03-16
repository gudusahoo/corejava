class A
{}
class B extends A
{}
class C extends A
{}
class Run1
{
    public static void main(String args[])
    {
        A a1=new B();
        
        if(a1 instanceof B)
        {
            B b1=(B)a1;
            System.out.println("downcasted to B");
        }
        if(a1 instanceof C)
        {
            C c1=(C)a1;
            System.out.println("downcasted to C");
        }
    }
}