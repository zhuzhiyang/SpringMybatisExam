package com.hand.Util;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class afterLog implements AfterReturningAdvice{

	   
	/**
	 * @param arg0 ����ֵ
	 * @param arg1 �����÷�������
	 * @param arg2 �����÷�������
	 * @param arg3 �����÷�����Ŀ�����
	 */
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println(arg3.getClass().getName()+"��"+arg1.getName()+"��ִ��"+"����ֵ��"+arg0);
		
	}

}
