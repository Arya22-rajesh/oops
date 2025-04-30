package Graphics;
public class Triangle
{
    double base, heigth;
    public Triangle(double base,double heigth)
    {
        this.base=base;
        this.heigth=heigth;
    }
    public double calculateArea()
    {
        return 0.5*base*heigth;
    }
}