package com.example.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SomeAspect {
    @Before("@annotation(some)")
    public void isOk(final Some some){
        System.out.println("aaaaaaaaaaaaaaaaaaaaaa");
    }

}
