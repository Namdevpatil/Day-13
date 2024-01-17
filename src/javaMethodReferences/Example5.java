package javaMethodReferences;

public class Example5 {

	public static void main(String[] args) {
		
		A3 a3 = Test3::new;//constructor reference
		a3.product(34, 10);

	}

}
