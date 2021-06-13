import java.util.Scanner;
class Employee
{
    int empid;
    String empname;
    int salary;
    String address;
}
class Teacher extends Employee
{
    String department;
    String subject;
    Teacher()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the employee id:");
        super.empid=sc.nextInt();
        System.out.println("enter the employee name:");
        super.empname=sc.next();
        System.out.println("enter the employee salary:");
        super.salary=sc.nextInt();
        System.out.println("enter the employee address");
        super.address=sc.next();
        System.out.println("enter department:");
        department=sc.next();
        System.out.println("enter the subject");
        subject=sc.next();
    }
    void display()
    {
        System.out.println("employee id:"+super.empid);
        System.out.println("name:"+super.empname);
        System.out.println("salary:"+super.salary);
        System.out.println("address:"+super.address);
        System.out.println("department:"+department);
        System.out.println("subject:"+subject);
        System.out.println("--------------------------------------");
    }

}
public class Teacherdemo
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of object array");
        n=sc.nextInt();
        Teacher ob[]=new Teacher[n];
        for(int i=0;i<n;i++)
        {
            ob[i] = new Teacher();
        }
        for(int i=0;i<ob.length;i++)
        {
            ob[i].display();
        }

    }
}