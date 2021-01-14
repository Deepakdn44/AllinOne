package ReflectionExample;

import java.lang.reflect.Parameter;

public class Home {

	public static void main(String[] args) {
		Test t = new Test();
		Class clazz=t.getClass();
		System.out.println(clazz.getSimpleName());
		java.lang.reflect.Method[] arrayOfMethods=clazz.getDeclaredMethods();
		System.out.println(arrayOfMethods.length);
		
		for(java.lang.reflect.Method m:arrayOfMethods) {
			System.out.println(m.getName()+"  Return type is ----->"+m.getReturnType());
			Parameter[] param = m.getParameters();
			for(Parameter params:param) {
				System.out.println(params.getModifiers());
			}
		}
		
		
	}

}
