package pkg1;

import java.lang.reflect.Parameter;

import com.sun.java.util.jar.pack.Package.Class.Method;

public class Home {
	
	public static void main(String[] args) {
		Test t = new Test();
		Class clazz=t.getClass();
		System.out.println(clazz.getSimpleName());
		java.lang.reflect.Method[] arrayOfMethods=clazz.getDeclaredMethods();
		for(java.lang.reflect.Method m:arrayOfMethods) {
			System.out.println("Method Name is --->"+m.getName()+"  Return type is ---->"+m.getReturnType());
			Parameter[] params=m.getParameters();
			for(Parameter param:params) {
				System.out.println(param.getName());
			}
		}
	}

}
