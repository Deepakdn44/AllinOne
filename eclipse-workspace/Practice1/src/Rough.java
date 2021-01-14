
public class Rough {
	
	

	public static void main(String[] args) {
		byte byteVariable = 127;
		System.out.println(byteVariable);
		
		short s = (short) 400000;
		System.out.println(s);
		
		long l = 1000000000000000l;
		System.out.println(l);
		
		float f = 10.111111111111f;
		System.out.println(f);
		
		// Ternary operator
		
		boolean b = true;
		String str = (b==true?"True":"False");
		System.out.println(str);
		
		System.out.println((int)(Math.random()*100));
	
		int $ = 067;
		
		// \u000d System.out.println($);
		
		//Count of a char at the given string
		int count = 0;
		String strg = "Pankaj sir academy";
		for(int i=0;i<strg.length();i++) {
			if(strg.charAt(i)=='a') {
				count++;
			}
		}
		System.out.println(count);
		
		//Reverse a string
		for(int i =strg.length()-1;i>=0;i--) {
			System.out.println(strg.charAt(i));
		}
		
		int i = 5&9;
		System.out.println(i);
		
		
		
		
	}
	

}