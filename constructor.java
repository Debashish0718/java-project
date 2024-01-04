import java.util.*;
 class cylinder
 {
    private double radius;
    private double height;

    public cylinder()
    {
        radius=1;
        height=1;
    }
    public cylinder(double r,double h)
    {
        radius=r;
        height=h;
    }
    public double lead_area()
    {
        return Math.PI*radius*radius;
    }
    public double total_surfaceArea()
    {
        return 2*lead_area()+circumference()*height;
    }
    public double circumference()
    {
        return 2*Math.PI*radius;
    }
    public double volume()
    {
        return lead_area()*height;
    }
 }
 class constructor
 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius and height");
       /*  double l=sc.nextDouble();*/
       /*  double h=sc.nextDouble();*/
        cylinder c1=new cylinder();
        System.out.println("lead area="+c1.lead_area());
        System.out.println("total surface area is"+c1.total_surfaceArea());
        System.out.println("volume="+c1.volume());


    }
 }
