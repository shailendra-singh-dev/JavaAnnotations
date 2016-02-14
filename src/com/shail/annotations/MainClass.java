package com.shail.annotations;

import java.lang.reflect.Method;

public class MainClass {

  public static void main(String[] args) {
    System.out.println("\n testing Annotation");
    MyCopyrightAnnotatedTest.testAnnotationWithParams(MyCopyrightAnnotated.class);
    MyCopyrightAnnotatedTest.testAnnotationWithoutParams(MyCopyrightAnnotated.class);
    MyCopyrightAnnotatedTest.testAnnotationRunner();
  }

}
