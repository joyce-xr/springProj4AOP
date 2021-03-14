package test;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect4Annotation {

    @Before(value="execution(* aopDemo1.GoodsDaoImpl.*(..))")
    public void log(){
        System.out.println("打印日志");
    }
}
