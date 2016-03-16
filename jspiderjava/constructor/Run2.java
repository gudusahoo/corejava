class Emp
{
    String name;
    int id;
    double sal;
    Emp(String name,int id,double sal)
    {
        this.name=name;
        this.sal=sal;
        this.id=id;
    }
    void display()
    {
        System.out.println("["+name+","+id+","+sal+"]");
  
    }
    
   
}

class Run2
{
    public static void main(String args[])
    {
        Emp e1=new Emp("raju",101,23456.78);
        e1.display();
    }
}