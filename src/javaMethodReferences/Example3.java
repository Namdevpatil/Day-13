package javaMethodReferences;

public class Example3 {

	public static void main(String[] args) {
		
		A1 a1 = Test2::add;//static method reference		
		System.out.println(a1.sum(200, 70));

	}

}
