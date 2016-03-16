class E
{
    static int i;
    int j;
    
}
class Run2
{
        public static void main(String args[])
    {
        System.out.println("execution starts");
          E.i=10;
        E e1=new E();
         e1.j=20;        
        E e2=new E();
        e2.j=30;
        
    }
}