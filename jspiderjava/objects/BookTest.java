class Book
{
    String title;
    void setTitle(String t)
    {
        title=t;
    }
    
    void display()
    {
        System.out.println("Title:"+title);
    }
}
class BookTest
{
    public static void main(String args[])
    {
        Book b1=new Book();
        b1.setTitle("java");
        b1.display();
    }
}