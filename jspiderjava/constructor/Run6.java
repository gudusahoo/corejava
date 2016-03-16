class Book
{
    String title;
    double price;
    int pages;
    
    Book(String t,double p,int pg)
    {
        title=t;
        price=p;
        pages=pg;
    }
}
class BookUtility
{
static void display(Book b)
{
     System.out.println("title:"+b.title);
     System.out.println("price:"+b.price+"rs");
     System.out.println("pages:"+b.pages);
}
}
class Run6
{
    public static void main(String args[])
    {
        Book b1=new Book("c",200,450);
        Book b2=new Book("c++",220,450);
        Book b3=new Book("java",250.50,450);
        BookUtility.display(b1);
        BookUtility.display(b2);
        BookUtility.display(b3);
        
    }
}