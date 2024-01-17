package javaFunctionalInterface;

@FunctionalInterface
public interface A1 {

	//only one abstract method/SAM
	public int sum(int a, int b);
	
	//static methods
	public static void getData1()
	{
		System.out.println("static method");
	}
	
	public static void getData2()
	{
		System.out.println("static method");
	}

	//no non-static methods but we have default methods
	
	public default void getMessage1()
	{
		
	}
	
	public default void getMessage2()
	{
		
	}
	
}
