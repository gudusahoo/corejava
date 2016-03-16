class Phone
{
    int height;
    int width;
    int length;
    Phone()
    {
    }
    Phone(int h,int w,int l)
    {
        height=h;
        width=w;
        length=l;
    }
}
class CameraPhone extends Phone
{
    int pixels;
    CameraPhone()
    {
    }
    CameraPhone(int l,int w,int h,int p)
    {
        super(h,l,w);
        pixels=p;
    }
}