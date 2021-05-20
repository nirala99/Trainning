package aopxml;

import java.util.Date;
import org.aspectj.lang.JoinPoint;

public class ApplyInterestRate {

    public void fixedDeposit(JoinPoint jp) {
        System.out.println("AFTERDOSIT[INFO] " + jp.getKind() + " " + jp.getTarget().getClass()
                + " " + jp.getSignature() + " new interest rate apply on date " + new Date());
    }
}
