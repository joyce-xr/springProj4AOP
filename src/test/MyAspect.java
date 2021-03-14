package test;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

    public void check(){
        System.out.println("权限校验");
    }

    public void log(Object res){
        System.out.println("记录日志:" + res);
    }

    public Object handleTrancation(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("开启事务");
        Object proceed = joinPoint.proceed();
        System.out.println("提交事务");
        return proceed;
    }

    public void exceptionNotice(Throwable ex){
        System.out.println("通知：抛出异常---" +ex);
    }

    public void finallyNotice(){
        System.out.println("哦！终于结束了！");
    }
}
