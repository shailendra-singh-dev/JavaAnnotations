package com.shail.annotations;

import java.lang.reflect.Method;

import com.shail.annotations.copyright.MyCopyrightAnnotated;
import com.shail.annotations.copyright.MyCopyrightAnnotatedTest;
import com.shail.annotations.method_info.MethodInfoAnnotationParser;

public class MainClass {

	public static void main(String[] args) {
		MainClass main=new MainClass();
//		main.testCopyrightAnnotations();
		main.testMethodInfoAnnotation();
	}
	
	public void testMethodInfoAnnotation(){
		MethodInfoAnnotationParser.test();
	}

	public void testCopyrightAnnotations() {
		System.out.println("\n testing Annotation");
		MyCopyrightAnnotatedTest
				.testAnnotationWithParams(MyCopyrightAnnotated.class);
		MyCopyrightAnnotatedTest
				.testAnnotationWithoutParams(MyCopyrightAnnotated.class);
		MyCopyrightAnnotatedTest.testAnnotationRunner();
	}
}
