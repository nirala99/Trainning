package aopxml;

import org.aspectj.lang.ProceedingJoinPoint;

public class TransactionAspect {

    public Object transferTransaction(ProceedingJoinPoint pjd) {
        System.out.println("Transaction starts");
        Object result = null;
        try {
            result = pjd.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("Transaction rolls back.");
            return result;
        }
        System.out.println("commit transaction");
        return result;
    }
}
