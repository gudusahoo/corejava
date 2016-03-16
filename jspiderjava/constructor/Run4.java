class Box
{
    int length;
    int breath;
    int height;


    Box()
    {
    }
    Box(int l,int b,int h)
    {
        height=h;
        breath=b;
        height=h;
    }
    Box(int n)
    {
        height=length=breath=n;
    }
    
    void display()
    {
        System.out.println("["+length+","+breath+","+height+"]");
    }
}
    class Run4
    {
        public static void main(String args[])
        {
            Box b1=new Box();
            Box b2=new Box(10,12,13);
            Box b3=new Box(6);
            b1.display();
            b2.display();
            b3.display();
        }
    }