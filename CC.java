package abstract_class;



public class CC extends Test{           //concrete class

	public static void main(String[] args)
	{
		CC v=new CC();  // create object of concrete class
		v.demo1();
		v.demo2();   //hollow method
		v.demo3();  //abstract method
		v.demo4();
        
	//	Test c=new Test ();  //we can not create of object abstract class in concrete class
        
        
	}
	
	public void demo4()
	{
		System.out.println("I am concrete class method");
	}

	@Override
	public void demo3()       //complete the  method in concrete class which incompleted in abstract class 
	{
		// TODO Auto-generated method stub
		
	}

}
