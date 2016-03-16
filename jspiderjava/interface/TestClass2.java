interface Animal
{
    void move();
    void makeSound();
}
class Dog implements Animal
{
    public void makeSound()
    {
        System.out.println("bow bow");
    }
    public void move()
    {
        System.out.println("dog is running");
    }
}
class Cat implements Animal
{
    public void makeSound()
    {
        System.out.println("meow meow");
    }
    public void move()
    {
        System.out.println("cat is running");
    }
}
class AnimalFac
{
    static Animal getAnimal(String s)
    {
        Animal a=null;
        if(s.equals("dog"))
        {
            a=new Dog();
        }
        if(s.equals("cat"))
        {
            a=new Cat();
        }
        return a;
    }
}
class TestClass2
{
    public static void main(String args[])
    {
        java.util.Scanner scn=new java.util.Scanner(System.in);
        System.out.println("type animal name");
          String animalName=scn.next();
      Animal a =AnimalFac.getAnimal(animalName);
             a.makeSound();
             a.move();
    }
}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
        
        
        
        
        
        
        
        
        