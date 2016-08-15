package com.hand.Util;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class afterLog implements AfterReturningAdvice{

	   
	/**
	 * @param arg0 返回值
	 * @param arg1 被调用方法对象
	 * @param arg2 被调用方法参数
	 * @param arg3 被调用方法的目标对象
	 */
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println(arg3.getClass().getName()+"的"+arg1.getName()+"被执行"+"返回值是"+arg0);
		
	}

}
