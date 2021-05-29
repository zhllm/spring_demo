package com.be.self.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogCut {
    /**
     * 切入点
     *  定义拦截的方法，匹配的规则
     *  表达式定义
     *      限定符(public\private\protect) 包名.类名.方法名(参数名)
     *      例
     *      1. 所有的公共方法 execution(public *(..))
     *      2. 执行任意set方法 execution(public set*(..))
     *      3. 指定包(com.be.self.service)下的任意方法 execution(* com.be.self.service.*.*(..))
     *      4. 设置指定包及子包下的任意方法(指定包) execution(* com.be.self.service..*.*(..))
     */
    @Pointcut("execution(* com.be.self.service..*.*(..))")
    public void cut() {
        System.out.println("cut");
    }

    /**
     * 目标类执行之前执行该通知
     */
    @Before(value = "cut()")
    public void before() {
        System.out.println("前置通知");
    }

    /**
     * 目标类方法在无异常执行后，执行该通知
     */
    @AfterReturning(value = "cut()")
    public void afterReturn() {
        System.out.println("返回通知");
    }

    /**
     * 最终通知 不管有无异常
     */
    @After(value = "cut()")
    public void after() {
        System.out.println("最终通知");
    }

    @AfterThrowing(value = "cut()")
    public void afterThrow() {
        System.out.println("异常通知");
    }

    /**
     * 声明环绕通知，并将通知应用到指定切入点上
     *          目标类的方法执行前后都可通过环绕通知处理
     *          需要显示的调用方法，否则无法继续执行 php.proceed
     * @param pjp
     * @return
     */
    @Around(value = "cut()")
    public Object around(ProceedingJoinPoint pjp) {
        System.out.println("环绕通知");
        Object object = null;
        try {
            object = pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return object;
    }
}
