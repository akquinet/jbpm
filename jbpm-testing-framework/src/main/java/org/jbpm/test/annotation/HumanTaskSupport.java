package org.jbpm.test.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.jbpm.test.TaskServerType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface HumanTaskSupport {

	String[] users() default {};
	String[] groups() default {};
	String persistenceUnit();
	TaskServerType type() default TaskServerType.MINA_ASYNC; 
	
	String host() default "localhost";
	int port() default 9123;
}
