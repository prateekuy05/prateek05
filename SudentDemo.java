class Student
{
String name;
int regno;
Student() 
{
name="raju";
regno=1234;
}
Student(String n, int r)
{
name=n;
regno=r;
}
Student(Student s)
{
name=s.name;
regno=s.regno;
}
void display()
{
System.out.println(name:+"1t"+regno);
}
} 
class StudentDemo
{
public static void main(String args[])
{
student.s1=new student();
student.s2=new student("ravi",1489);
student.s3=new student(s1)
s1.display();
s2.display();
s3.display();
}
}
