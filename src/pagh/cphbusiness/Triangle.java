package pagh.cphbusiness;

public class Triangle
{
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA()
    {
        return a;
    }

    public void setA(int a)
    {
        this.a = a;
    }

    public int getB()
    {
        return b;
    }

    public void setB(int b)
    {
        this.b = b;
    }

    public int getC()
    {
        return c;
    }

    public void setC(int c)
    {
        this.c = c;
    }

    public String getType()
    {
        if (a <= 0 || b <= 0 || c <= 0)
        {
            return "not a triangle!";
        }
        if (a == b && b == c)
        {
            return "equilateral";
        }
        if (a == b || b == c || c == a)
        {
            return "isosceles";
        }
        if (a != c && b != a && c != b)
        {
            return "scalene triangle";
        }
        return null;
    }
}
