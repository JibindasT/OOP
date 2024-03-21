class Shapes{
//Area of square
int area (int l)
{
return l*l;
}

//Area of Rectangle
int area(int l,int b)
{
return l*b;
}

//Area of Cuboid
int area(int l,int b,int h)
{
return ((2*l*b) + (2*l*h) + (2*h*b));
}
public static void main (String[] args)
{
Shapes s = new Shapes();
System.out.println("Area of Square   : " + s.area(4));
System.out.println("Area of Rctangle : " + s.area(2,4));
System.out.println("Area of Cuboid   : " + s.area(1,3,5));
}
}
