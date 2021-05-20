package aopanno;

import java.util.Date;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
public class ApplyInterestRate {
    @Order(3)
    @After("execution(* aopanno.Bank.fixedDeposit(int,double))")
    public void fixedDeposit(JoinPoint jp) {
        System.out.println("AFTERDOSIT[INFO] " + jp.getKind() + " " + jp.getTarget().getClass()
                + " " + jp.getSignature() + " new interest rate apply on date " + new Date());
    }
}
