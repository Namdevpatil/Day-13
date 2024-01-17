package javaLambdaExpressions;

public class Example3 {

	public static void main(String[] args) {
		
		
		//anonymous inner class/name-less
		A2 a2 = new A2()
		{

			@Override
			public void hello()
			{
				System.out.println("Hello");
				
			}
			
		};
		
		a2.hello();
		
		System.out.println("--------------------");
		
		A2 a1 = () -> System.out.println("Hello...!");
		
		a1.hello();

	}

}
