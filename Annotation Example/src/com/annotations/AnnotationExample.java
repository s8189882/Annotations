package com.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationExample {
	
	@Override
	@MethodInfo(author = "Priya", comments = "Main method", date = "September 26, 2022", revision = 1)
	public String toString() {
		return "Overridden toString method";
	}
	
	public static void main(String[] args) {
		try {
			for(Method method : AnnotationExample.class.getMethods()) {
				if(method.isAnnotationPresent(MethodInfo.class)) {
					try {
						for (Annotation anno : method.getDeclaredAnnotations()) {
							System.out.println("Annotation in Method " + method + "' : " + anno);
						}
						MethodInfo methodAnno = method.getAnnotation(MethodInfo.class);
						if (methodAnno.revision() == 1) {
							System.out.println("Method with revision number 1 = " + method);
						}
						
					} catch (Throwable ex){
						ex.printStackTrace();
					}
				}
			
			} 
		}catch (SecurityException e){
			e.printStackTrace();
		}
	}
}
