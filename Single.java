//single inheritance is nothing but it have only one base class and only one derived class


class Animal      //base class
{
  public void Name(String name)
  {
    System.out.println("Name of Animal"   +name+ "name.");
  }
}
class Dog extends Animal     //Derived Class
{
   public void Breed(String breedName)
   {
     System.out.println("Breed Name of the "  +breedName+ "breedName.");
    }
}
class Single
{
  public static void main(String[] args)   
  {
     Dog d=new Dog();
     d.Name("Dog");
     d.Breed("Puppy");
  }
} 
  

 
   