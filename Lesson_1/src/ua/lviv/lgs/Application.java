package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {

// Завдання 1
		
		byte a = 1 ;
		short b = 2;		
		int c = 3;
		long d = 4;
		char e = 5;
		float f = 6;
		double g = 7;
		boolean i = true;

// Завдання 2
	
// Мінімальне значення
		
	System.out.println("Byte = " + Byte.MIN_VALUE);
	System.out.println("Short = " + Short.MIN_VALUE);
	System.out.println("Integer = " + Integer.MIN_VALUE);
	System.out.println("Long = " + Long.MIN_VALUE);
	System.out.println("Character = " + Character.MIN_VALUE);
	System.out.println("Float = " + Float.MIN_VALUE);
	System.out.println("Double = " + Double.MIN_VALUE);

// Максимальне значення
	
	System.out.println("Byte = " + Byte.MAX_VALUE);
	System.out.println("Short = " + Short.MAX_VALUE);
	System.out.println("Integer = " + Integer.MAX_VALUE);
	System.out.println("Long = " + Long.MAX_VALUE);
	System.out.println("Character = " + Character.MAX_VALUE);
	System.out.println("Float = " + Float.MAX_VALUE);
	System.out.println("Double = " + Double.MAX_VALUE);

// Завдання 3


	int [ ] k = new int[10];
	for (int j = 0; j < 10; j++)
	k[j] = j;

	int min = k[0];
	for(int j = 0; j < k.length; j++){
	    if(min>k[j])
	        min = k[j];
	}
	System.out.println(min);
	
	int max = k[9];
	for(int j = 9; j < k.length; j++){
	    if(max>k[j])
	    	max = k[j];
	}
	System.out.println(max);
	}
	
}

	//first commit to github