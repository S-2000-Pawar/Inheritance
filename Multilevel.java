//Multi-level inheritance,the class inheritas the feature of another derived class(sub class).


class GF
{
  public void DetailGF()
  {
     System.out.println("GF Code");
  }
}
class F extends GF
{
   public void DetailF()
  {
     System.out.println("F Code");
  }

}
class S extends F         //both base and derived class
{
  public void DetailS()
  {
     System.out.println("S Code");
  }
}
class Multilevel
{
   public static void main(String[] args)
   {
     S s=new S();
     s.DetailGF();
     s.DetailF();
     s.DetailS();
    /*relationship bet GF and F
     F f=new F();
     s.DetailGF();
     s.DetailF();
    relationship bet F and S
     S a=new S();
     a.DetailGF();
     a.DetailF();
     a.DetailS();*/
   }
}
     

    
 
   



