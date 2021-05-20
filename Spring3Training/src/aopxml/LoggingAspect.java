package aopxml;

import java.util.Arrays;
import java.util.Date;
import org.aspectj.lang.JoinPoint;

public class LoggingAspect {

    public void logBefore(JoinPoint jp) {
        System.out.println("[INFO] " + jp.getKind() + " " + jp.getTarget().getClass()
                + " " + jp.getSignature() + " is going to get called at " + new Date());
    }

    public void logAfter(JoinPoint jp) {
        System.out.println("AFTER[INFO] " + jp.getKind() + " " + jp.getTarget().getClass()
                + " " + jp.getSignature() + " ends at " + new Date());
    }

    public void logAfterReturning(JoinPoint jp, Object result) {
        System.out.println("AFTER RETURNING[INFO] " + jp.getKind() + " " + jp.getTarget().getClass()
                + " " + jp.getSignature() + " ends at " + new Date() + " with result " + result);
    }

    public void logAfterThrowing(JoinPoint jp, Exception e) {
        System.out.println("IllegalArgumentException " + Arrays.toString(jp.getArgs()));
    }
}
