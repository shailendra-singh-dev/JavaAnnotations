package com.shail.annotations.method_info;

import java.awt.List;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MethodInfo {

	@Override
	@MethodInfoAnnotation(author = "Author", comments = "toString() implentation", revision = 1.0)
	public String toString() {
		return MethodInfo.class.getSimpleName();
	}
	
	@Deprecated
	@MethodInfoAnnotation(author = "Author", comments = "oldMethod() implentation", revision = 2.0)
	public void oldMethod(){
		System.out.println("oldMethod()");
	}
	

	@SuppressWarnings(value={"unchecked","deprecation"})
	@MethodInfoAnnotation(author = "Author", comments = "testGenerics() implentation", revision = 2.0)
	public void testGenerics() throws FileNotFoundException{
		ArrayList list=new ArrayList();
		list.add("test");
		oldMethod();
	}
}
