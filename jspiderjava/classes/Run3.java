class F
{
static int a;
int b;
void increment()
{
    ++a;
    ++b;
}
    void display()
    {
        System.out.println(a);
        System.out.println(b);
    }
}
    
    class Run3
    {
        public static void main(String args[])
        {
            F f1=new F();
            F f2=new F();
            
            f1.increment();
            f2.increment();
            f1.display();
            f2.display();
        }
    }
    