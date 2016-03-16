abstract class Car
{
    abstract void start();
    abstract void move();
    abstract void stop();
}
class Audi extends Car
{
    void start()
    {
        System.out.println("Audi starts");
    }
    void move()
    {
        System.out.println("Audi moves");
    }
    void stop()
    {
        System.out.println("Audi stops");
    }
}
class Benz extends Car
{
    void start()
    {
        System.out.println("Benz starts");
    }
    void move()
    {
        System.out.println("Benz moves");
    }
    void stop()
    {
        System.out.println("Benz stops");
    }
}

class Driver
{
    void drive(Car c)
    {
        c.start();
        c.move();
        c.stop();
    }
}
class TestClass
{
    public static void main(String args[])
    {
        Driver d=new Driver();
        d.drive(new Audi());
        d.drive(new Benz());
    }
}

































        
        
        
        
        
        
        
        
        
        
        
        
        