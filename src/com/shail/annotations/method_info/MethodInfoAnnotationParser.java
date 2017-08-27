package com.shail.annotations.method_info;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.shail.annotations.copyright.MyCopyright;
import com.shail.annotations.copyright.MyCopyrightAnnotated;

public class MethodInfoAnnotationParser {

	public static void test() {
		ClassLoader classLoader = MethodInfo.class.getClassLoader();
		String name = "com.shail.annotations.method_info.MethodInfo";
		try {
			Class methodInfoClass = classLoader.loadClass(name);
			final Method[] methods = methodInfoClass.getMethods();
			for (Method method : methods) {
				// System.out.println("[" + method + "]");
				Annotation[] annotations = method.getDeclaredAnnotations();
				for (Annotation annotation : annotations) {
					if (annotation instanceof MethodInfoAnnotation) {
						MethodInfoAnnotation anInfo = (MethodInfoAnnotation) annotation;
						if (1.0 == anInfo.revision()) {
							System.out.println("Method with revision 1 found \n"
									+ method);
						}
					}
				}
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
