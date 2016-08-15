package com.hand.Util;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.MethodBeforeAdvice;

import com.sun.prism.impl.Disposer.Target;

public class Log {
//	@Before("execution(* com.hand.ServiceImpl.CustomerServiceImpl.addCustomer(..))")
    public void before()
    {
    	System.out.println("Before Insert Customer Data");
    }
//	@After("execution(* com.hand.ServiceImpl.CustomerServiceImpl.addCustomer(..))")
    public void after(){
    	System.out.println("After Insert Customer Data");
    }
    }
