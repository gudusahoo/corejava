class StaticTest
{
    public static void main(String args[])
    {
        display(1);
    }
    
    static void display(int i)
    {
        System.out.println(i);
        if(i==3)
            return;
        display(++i);
        return;
    }
}