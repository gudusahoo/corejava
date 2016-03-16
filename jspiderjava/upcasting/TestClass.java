class A
{
void t1()
{
    System.out.println("t1() in A");
}
}
class B extends A
{
    void t1()
    {
        System.out.println("t1() in B");
    }
}
class C extends A
{
  void t1()
  {
      System.out.println("t1() in C");
  }
}
class TestClass 
{
    public static void main(String args[])
    {
        A a1=new A();
        a1.t1();
         a1=new B();
        a1.t1();
         a1=new C();
        a1.t1();
    }
}