//Aggregation


class Student
{
  int rollno;
  String Address;
  public void printdata(int roll, String add)
  {
    System.out.println("student roll" +rollno +"Address" +add);
  }
}
class Address
{
   int flatno;
   String roadName;
   String City;
   String state;
   int pincode;
   public Address(int flatno,String roadName,String City,String state,int pincode)
   {
       this.flatno=flatno;
       this.roadName=roadName;
       this.City=City;
       this.state=state;
       this.pincode=pincode;
  }
}
public class Aggregation 
{
   public static void main(String[] args)
   {
     Address add=new Address(101,"Disney","Hollywood","NY",456897);
     Student stu=new Student();
     stu.printdata(int,add);
     //stu.printdata(add);
   }
}
