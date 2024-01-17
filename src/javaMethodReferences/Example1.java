package javaMethodReferences;

public class Example1 {

	public static void main(String[] args) {
		
		Test test = new Test();
		
		A1 a1 = test::add;
		
		System.out.println(a1.sum(20, 70));

	}

}
