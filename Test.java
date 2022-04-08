package abstract_class;

public abstract class Test {

	public static void main(String[] args)
	{
	//	Test t=new Test();  //----->we should not create object of abstract class

	}
	
	public static void demo()    //complete method
	{
		System.out.println("hi i am ststic demo method from abstract class");
	}
	public  void demo1()    //complete method
	{
		System.out.println("hi i am demo1 method from abstract class");
	}
	public void demo2()        //complete method
	{
		
	}
	//public void demo();   incomplete method
	
	public abstract void demo3();  //abstract method
	
	

}
