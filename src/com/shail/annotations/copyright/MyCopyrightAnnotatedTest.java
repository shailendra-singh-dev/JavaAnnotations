package com.shail.annotations.copyright;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyCopyrightAnnotatedTest {

  public static final void testAnnotationWithParams(final Class clazz) {
    if (null != clazz) {
      final Method[] methods = clazz.getMethods();
      for (final Method method : methods) {
        if (null != method) {
          if (method.isAnnotationPresent(MyCopyright.class)) {
            try {
              String args = "Sample Params";
              MyCopyrightAnnotated obj = new MyCopyrightAnnotated();
              method.invoke(MyCopyrightAnnotated.class.newInstance(), args);
            } catch (IllegalAccessException e) {
              e.printStackTrace();
            } catch (IllegalArgumentException e) {
              e.printStackTrace();
            } catch (InvocationTargetException e) {
              e.printStackTrace();
            } catch (InstantiationException e) {
              e.printStackTrace();
            }
          }
        }
      }
    }
    
    
    
  }



  public static final void testAnnotationWithoutParams(final Class clazz) {
    if (null != clazz) {
      final Method[] methods = clazz.getMethods();
      for (final Method method : methods) {
        if (null != method) {
          MyCopyright myCopyright = method.getAnnotation(MyCopyright.class);
          if (null != myCopyright) {
            MyCopyrightAnnotated obj = new MyCopyrightAnnotated();
            try {
              method.invoke(obj);
            } catch (IllegalAccessException e) {
              e.printStackTrace();
            } catch (IllegalArgumentException e) {
              e.printStackTrace();
            } catch (InvocationTargetException e) {
              e.printStackTrace();
            }
          }
        }
      }
    }
  }

  public static final void accessAnnotationFields(final Class clazz) {
    if (null != clazz) {
      final Method[] methods = clazz.getMethods();
      for (final Method method : methods) {
        if (null != method) {
          if (method.isAnnotationPresent(MyCopyright.class)) {
            MyCopyright myCopyright = method.getAnnotation(MyCopyright.class);
            if (null != myCopyright) {
              final String copyrightInfo = myCopyright.copyrightInfo();
              final double copyrightVersion = myCopyright.copyrightVersion();
              System.out.println("\n accessAnnotationFields ,copyrightInfo:" + copyrightInfo
                  + ",copyrightVersion:" + copyrightVersion);
            }
          }
        }
      }
    }
  }


  public static void testAnnotationRunner() {
    AnnotationRunner runner = new AnnotationRunner();
    Method[] methods = runner.getClass().getMethods();

    for (Method method : methods) {
      RuntimeCheckMethod annos = method.getAnnotation(RuntimeCheckMethod.class);
      if (annos != null) {
        try {
          method.invoke(runner);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    }
  }


}
