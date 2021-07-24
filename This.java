//this keyword

class Student
{
  int rollno;
  String name;
  Float fee;
  Student(int rollno,String name,Float fee)
  {
    this.rollno=rollno;
    this.name=name;
    this.fee=fee;
  }
 void display()
 {
   System.out.println(rollno+ " " +name+ " " +fee);
 }
class TestThis1
{
  public static void main(String[] args)
  {
    Student s1=new Student(111,"Ankit",50000f);
    Student s2=new Student(112,"Sumit",70000f);
    s1.display();
    s2.display();
 }
}
}

   