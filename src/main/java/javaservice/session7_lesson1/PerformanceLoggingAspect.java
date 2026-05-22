package javaservice.session7_lesson1;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceLoggingAspect {

    @Around("execution(* javaservice.session7_lesson1..*(..))")
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();

        Object result = joinPoint.proceed();

        long endTime = System.currentTimeMillis();
        String methodName = joinPoint.getSignature().toShortString();
        System.out.println("LOG: " + methodName + " chạy trong " + (endTime - startTime) + "ms");

        return result;
    }
}
