package oops;

class Test extends Test1{
    public void show()
    {
        System.out.println("Hi am vikas yadav");
    }
    
    
}

class Test1{
     public void show()
    {
        System.out.println("Hi am vikas");
    }
     public static void main(String[]args)
     {
         Test t=(Test) new Test1();
         t.show();      }
   
    
}
