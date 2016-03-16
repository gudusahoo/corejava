class Run1
{
    static 
    {
    System.out.println("executing static block1");
    }
    public static void main(String args[])
    {
        System.out.println("main starts");
    }
    static 
    {
        System.out.println("executing static block2");
    }
}