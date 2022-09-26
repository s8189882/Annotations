package com.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * @Documented - whether to put the annotation in Javadocs
 * @Retentin - when the annotation is needed
 * @Target? - places the annotation can go
 * @Inherited - wjether subclasses get the annotation
 */

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodInfo {

	String author() default "Priya";
	String date();
	int revision() default 1;
	String comments();
}