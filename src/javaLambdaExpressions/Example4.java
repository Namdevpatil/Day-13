package javaLambdaExpressions;

public class Example4 {

	public static void main(String[] args) {
		
		A3 a3 = (x, y) ->  {
			return x*y;
		};
		System.out.println(a3.calculate(10, 20));
		
		System.out.println("=========================");
		
		A3 a4 = (x, y) ->  {
			return x*y;
		};
		System.out.println(a4.calculate(109, 20));
		
	}

}
