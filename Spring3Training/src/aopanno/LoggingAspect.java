package aopanno;

import java.util.Arrays;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
public class LoggingAspect {

    @Order(2)
    @Before("execution(* aopanno.Bank.*(..))")
    public void logBefore(JoinPoint jp) {
        System.out.println("BEFORE[INFO] " + jp.getKind() + " " + jp.getTarget().getClass()
                + " " + jp.getSignature() + " is going to get called at " + new Date());
    }

    @Order(2)
    @After("execution(* aopanno.Bank.*(..))")
    public void logAfter(JoinPoint jp) {
        System.out.println("AFTER[INFO] " + jp.getKind() + " " + jp.getTarget().getClass()
                + " " + jp.getSignature() + " ends at " + new Date());
    }

    @Order(2)
    @AfterReturning(pointcut = "execution(* aopanno.Bank.*(int))", returning = "result")
    public void logAfterReturning(JoinPoint jp, Object result) {
        System.out.println("AFTER RETURNING[INFO] " + jp.getKind() + " " + jp.getTarget().getClass()
                + " " + jp.getSignature() + " ends at " + new Date() + " with result " + result);
    }

    @Order(2)
    @AfterThrowing(pointcut = "execution(* aopanno.Bank.*(int))", throwing = "e")
    public void logAfterThrowing(JoinPoint jp, Exception e) {
        System.out.println("IllegalArgumentException " + Arrays.toString(jp.getArgs()));
    }
}
