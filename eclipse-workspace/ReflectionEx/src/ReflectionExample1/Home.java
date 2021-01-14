package ReflectionExample1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class Home {
	
	public static void main(String[] args) {
		
		Test t = new Test();
		Class clazz = t.getClass();
		System.out.println(clazz.getSimpleName());
		Method[] arrayOfMethods = clazz.getDeclaredMethods();
		System.out.println(arrayOfMethods.length);
		
		for(Method m:arrayOfMethods) {
			System.out.println(m.getName()+"---Return type is--"+m.getReturnType());
			Parameter[] params = m.getParameters();
			for(Parameter param:params) {
				System.out.println(param.getName());
			}
		}
		Constructor[] cons = clazz.getDeclaredConstructors();
		System.out.println(cons.length);
		
		for(Constructor con:cons) {
			System.out.println(con.getName());
		}
	}

}
