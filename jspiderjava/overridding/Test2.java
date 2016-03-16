class Phone
{
    int height;
    int width;
    int length;
    Phone(int h,int w, int l)
    {
        height=h;
        width=w;
        length=l;
    }

    void display()
    {
        System.out.println("height:" +height);
        System.out.println("width:" +width);
        System.out.println("length:" +length);
    
    }
}
    class CameraPhone extends Phone
    {
        int pixels;
        CameraPhone(int h,int w,int l, int p)
        {
            super(h,w,l);
            pixels=p;
        }
        void display()
        {
            super.display();
            System.out.println("pixels:" +pixels);
        }
    }
    class Test2
    {
        public static void main(String args[])
        {
            CameraPhone c1=new CameraPhone(5,6,8,10);
            c1.display();
        }
    }