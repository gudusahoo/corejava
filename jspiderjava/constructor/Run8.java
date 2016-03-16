class Rect
{
    int length;
    int breath;
    Rect()
    {
    }
    Rect(int l,int b)
    {
        length=l;
        breath=b;
    }
    Rect(Rect r)
    {
        length=r.length;
        breath=r.breath;
    }
    void display()
    {
        System.out.println("["+length+","+breath+"]");
    }
}
class Run8
{
    public static void main(String args[])
    {
        Rect r1=new Rect();
        Rect r2=new Rect(10,20);
        Rect r3=new Rect(r1);
        Rect r4=new Rect(r2);
        
        r1.display();
        r2.display();
        r3.display();
        r4.display();
    }
}
        
        
        
        
        