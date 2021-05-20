package aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
public class TransactionAspect {

    @Order(1)
    @Around("execution(* aopanno.Bank.transfer(int,int,double))")
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
