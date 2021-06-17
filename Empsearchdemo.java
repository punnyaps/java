import java.io.*;
import java.util.Scanner;
class Emp
{
    int emp_no;
    String emp_name;
    int emp_salary;
    Emp()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the employee no");
        emp_no=sc.nextInt();
        System.out.println("enter the employee name");
        emp_name=sc.next();
        System.out.println("enter the employee salary");
        emp_salary=sc.nextInt();
    }
    void display()
    {
        System.out.println("empoly no:"+emp_no);
        System.out.println("employ name:"+emp_name);
        System.out.println("employ salary"+emp_salary);

    }

}
public class Empsearchdemo
{
    public static void main(String args[])
    {
        int n;
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter employee size");
        n = sc.nextInt();
        Emp ob[] = new Emp[n];
        for (int i = 0; i < n; i++)
        {
            ob[i] = new Emp();
        }
        System.out.println("enter employee_no for search:");
        no = sc.nextInt();
        for(int i = 0; i < ob.length; i++)
        {
            if (ob[i].emp_no == no)
            {
                ob[i].display();
            }
        }
    }

}