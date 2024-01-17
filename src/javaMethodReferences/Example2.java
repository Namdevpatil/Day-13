package javaMethodReferences;

public class Example2 {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new ThreadObject()::getMessage);
		thread.start();

	}

}
