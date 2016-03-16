class Bird
{
    void fly()
    {
        System.out.println("bird fly");
    }
}
class Dove extends Bird
{
    void fly()
    {
      System.out.println("Dove fly");
    }
}
class TestClass2
{
    public static void main(String args[])
    {
        Bird b=new Bird();
        m1(b);
    }
    static void m1(Bird b)
    {
        System.out.println("m1(Bird) executes");
        b.fly();
    }
    static void m1(Dove d)
    {
        System.out.println("m1(Dove) executes");
        d.fly();
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        