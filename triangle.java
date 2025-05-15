import java.util.*;
public class Triangle_2
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three sides of a Triangle:");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if ((a+b>c)&&(b+c>a)&&(c+a>b))
        {
            System.out.println("Triangle is possible");
            
                if ((a==b)&&(a==c)&&(b==c))
                System.out.println("Eqilateral Triangle");
                else if((a==b)||(a==c)||(b==c))
                System.out.println("Isosceles Triangle");
                else if ((a!=b)&&(a!=c)&&(b!=c))
                System.out.println("Scalene Triangle");
            
            else
            System.out.println("Triangle is not possible");
        }
    }
}