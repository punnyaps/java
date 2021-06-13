import java.util.Scanner;
class Persons
{
    String name;
    String gender;
    int age;
    String address;
    Persons()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the name:");
        name=sc.next();
        System.out.println("enter the gender:");
        gender=sc.next();
        System.out.println("age:");
        age=sc.nextInt();
        System.out.println("address:");
        address=sc.next();

    }

}
class Employees extends Persons
{
    int empid;
    String company;
    String qualification;
    int salary;
    Employees()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the empid:");
        empid=sc.nextInt();
        System.out.println("enter the company:");
        company=sc.next();
        System.out.println("enter the qualification:");
        qualification=sc.next();
        System.out.println("enter the salary:");
        salary=sc.nextInt();
    }

}
class Teachers extends Employees
{
    int teacherid;
    String department;
    String subject;
  Teachers()
  {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the teacher id:");
      teacherid=sc.nextInt();
      System.out.println("enter the department:");
      department=sc.next();
      System.out.println("subject:");
      subject=sc.next();

  }
  void display()
  {
      System.out.println("name:"+super.name);
      System.out.println("gender"+super.gender);
      System.out.println("age"+super.age);
      System.out.println("address:"+super.address);
      System.out.println("employe id:"+super.empid);
      System.out.println("company:"+super.company);
      System.out.println("qualification"+super.qualification);
      System.out.println("salary:"+super.salary);
      System.out.println("teacher id:"+teacherid);
      System.out.println("department:"+department);
      System.out.println("subject:"+subject);

  }
}
public class Multileveldemo
{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enetr number of objects:");
        n=sc.nextInt();
        Teachers ob[]=new Teachers[n];
        for(int i=0;i<n;i++)
        {
          ob[i]=new Teachers();
        }
        for(int i=0;i<n;i++)
        {
            ob[i].display();
        }
    }

}