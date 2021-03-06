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
        else if (a == b && b == c)
        {
            return "equilateral";
        }
        else if (a == b || b == c || c == a)
        {
            return "isosceles";
        }
        else
        {
            //a != b && b != c && c != a Er altid sandt, hvis de ovenstående ikke er sande!
            //Det skyldes at der kun er tre typer trekanter (ud fra sider i hvertfald
            System.out.println("common git");

            return "scalene triangle";
        }

    }
}
