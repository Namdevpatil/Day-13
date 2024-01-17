package javaMethodReferences;

public class Example4 {

	public static void main(String[] args) {
		
		Thread thread = new Thread(ThreadObject2::getMessage);
		thread.start();

	}

}
