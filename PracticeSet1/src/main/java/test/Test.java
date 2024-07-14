package test;

class Derived 
{
     void getDetails()
    {
        System.out.println("Derived class");
    }
}
  
public class Test extends Derived
{
    protected final void getDetails()
    {
        System.out.println("Test class");
    }
    public static void main(String[] args)
    {
        Derived obj = new Derived();
        obj.getDetails();
    }
}
