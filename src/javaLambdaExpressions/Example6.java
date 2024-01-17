package javaLambdaExpressions;


public class Example6{

	public static void main(String[] args) 
	{

		Runnable runnable = () -> System.out.println(Thread.currentThread());
		
		Thread thread = new Thread(runnable);
		
		thread.start();
		
	}

}
