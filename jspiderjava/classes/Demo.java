class Demo
{
    static int i;
    int j;
    void display()
    {
        System.out.println(i);
        System.out.println(j);
    }
    
    public static void main(String args[])
    {
        Demo.i=10;
        Demo d1=new Demo();
         d1.j=20;        
        Demo d2=new Demo();
        d2.j=30;
        d1.display();
        d2.display();
    }
}