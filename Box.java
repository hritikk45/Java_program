class Box{
{
    // this code basically use for adding of array
double width;
double height;
double depth;
Box(double w,double h,double d){
width = w;
height = h;
depth = d;
}
volume(){
return width*height*depth;
}
}

class BoxDemo{
public static void main(String args[])
{
mybox1 = new box(10,20,15);
Box mybox2 = newbox(3,6,9);
double vol;

mybox1 volume();
System.out.println("volume is"+ vol);
mybox2 volume();
System.out.println("volume is"+ vol);
}
}
