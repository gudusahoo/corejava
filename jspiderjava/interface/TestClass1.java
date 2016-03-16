interface Washable
{
}
class Washer
{
    void wash(Object arg0)
    {
        if(arg0 instanceof Washable)
        {
            System.out.println("object is washed");
        }
        else
            System.out.println("object is not washable");
    }
}
class Car implements Washable
{
}
class Phone
{
}
class TestClass1
{
    public static void main(String args[])
    {
        Car c1=new Car();
        Phone phn=new Phone();
        Washer w=new Washer();
        w.wash(c1);
        w.wash(phn);
    }
}