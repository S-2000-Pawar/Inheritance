
class Animal             //parent class
{
   int legs=4;
   public void walking()
   {
     System.out.println("animal walk on " +legs+" legs.");
   }
}
class Cat extends Animal            //child class
{
   String sound= "meow";
   public void sound()
   {
      System.out.println("Cat create a sound "  +sound+" sound.");
    }
}
public class Test
{
   public static void main(String[] args)
   {
      Cat c=new Cat();
      c.walking();
      c.sound();
    }
}
      