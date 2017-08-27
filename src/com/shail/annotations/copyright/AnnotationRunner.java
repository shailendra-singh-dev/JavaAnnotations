package com.shail.annotations.copyright;

public class AnnotationRunner {
  public void method1() {
    System.out.println("method1");
  }

  @RuntimeCheckMethod
  public void method2() {
    System.out.println("method2");
  }

  public void method3() {
    System.out.println("method3");
  }

  @RuntimeCheckMethod
  public void method5() {
    System.out.println("method4");
  }

}
