class Overload
{
    void calculate(int n,char ch)
    {
        if(ch=='s')
           System.out.println("area of square:"+(n*n));
        else
            System.out.println("area of cube:"+(n*n*n));
    }
   void  calculate(int n,int m,char ch) {
       if (ch == 'p')
           System.out.println("product of no:" + (n * m));
       else
           System.out.println("sum of no:" + (n + m));
   }
    void calculate(String str1,String str2)
    {
        if(str1==str2)
            System.out.println("string equal");
        else
            System.out.println("string not equal");

    }
}

public class Overloaddemo
{
    public static void main(String args[])
    {
        Overload ob=new Overload();
        ob.calculate(5,'s');
        ob.calculate(8,'p');
        ob.calculate("punnya","punnya");

    }
}