package com.shail.annotations.copyright;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyCopyright {
	String copyrightInfo() default "";

	double copyrightVersion() default 1.00;
}
