package com.shail.annotations.copyright;

public class MyCopyrightAnnotated {

  @MyCopyright(copyrightInfo = "Copyright", copyrightVersion = 1.00)
  public void methodAnnotationWithParams(final String param) {
    System.out.println("\n methodAnnotationWithParams " + param);
  }

  public void methodWithoutAnnotation(final String param) {
    System.out.println("\n methodWithoutAnnotation param:" + param);
  }

  public void methodWithoutParams() {
    System.out.println("\n methodWithoutAnnotation param:");
  }
  
  @MyCopyright(copyrightInfo = "Copyright", copyrightVersion = 1.00)
  public void methodAnnotationWithoutParams() {
    System.out.println("\n methodAnnotationWithoutParams");
  }

}
