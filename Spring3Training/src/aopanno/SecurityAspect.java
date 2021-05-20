package aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
public class SecurityAspect {

    @Order(0)
    @Before("execution(* aopanno.Bank.*(int,..))")
    public void performCheck() {
        System.out.println("ORDER 0 SecurityAspect Authorization done");
    }
}
