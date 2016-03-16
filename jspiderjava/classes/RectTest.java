class Rect
{
    int length;
    int breath;
    void init(int length,int breath)
    {
        this.length=length;
        this.breath=breath;
               
    }
    void display()
    {
        System.out.println("["+length+","+breath+"]");
    }
}


class RectTest
{
    public static void main(String args[])
    {
        Rect r1=new Rect();
        r1.init(10,20);
        r1.display();
    }
    
}
