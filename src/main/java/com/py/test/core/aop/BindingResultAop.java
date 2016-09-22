package com.py.test.core.aop;


import com.py.test.core.aop.log.MWLog;
import com.py.test.util.LoggerUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

//值越小优先级越高
@Order(1)
@Component
@Aspect
public class BindingResultAop {

    @Pointcut("@annotation(com.py.test.core.aop.log.MWLog)")
    public void controllerAspect() {
    }

    @Before("controllerAspect()")
    public void doBefore(JoinPoint joinPoint) {
        LoggerUtils.info(BindingResultAop.class, "=====SysLogAspect前置通知开始=====");
        handleLog(joinPoint, null);
    }

    @AfterReturning(pointcut = "controllerAspect()")
    public void doAfter(JoinPoint joinPoint) {
        LoggerUtils.info(BindingResultAop.class, "=====SysLogAspect后置通知开始=====");
        handleLog(joinPoint, null);
    }

    @AfterThrowing(value = "controllerAspect()", throwing = "e")
    public void doAfter(JoinPoint joinPoint, Exception e) {
        LoggerUtils.info(BindingResultAop.class, "=====SysLogAspect异常通知开始=====");
        handleLog(joinPoint, e);
    }

    private void handleLog(JoinPoint joinPoint, Exception e) {
        try {
            //获得注解
            MWLog logger = giveController(joinPoint);
            if (logger == null) {
                return;
            }

            String signature = joinPoint.getSignature().toString(); // 获取目标方法签名
            String methodName = signature.substring(signature.lastIndexOf(".") + 1, signature.indexOf("("));
            String classType = joinPoint.getTarget().getClass().getName();
            Class<?> clazz = Class.forName(classType);
            Method[] methods = clazz.getDeclaredMethods();
            LoggerUtils.info(BindingResultAop.class, "methodName: " + methodName);
            for (Method method : methods) {
                if (method.isAnnotationPresent(MWLog.class)
                        && method.getName().equals(methodName)) {
                    String annId = logger.id();
                    MWLog.OpType type = logger.type();
                    String clazzName = clazz.getName();
                    LoggerUtils.info(BindingResultAop.class, "clazzName: " + clazzName + ", methodName: " + methodName + ", annId: " + annId + ", type: " + type.toString());
                }
            }

        } catch (Exception exp) {
            LoggerUtils.error(BindingResultAop.class, "异常信息:{}" + exp.getMessage());
            exp.printStackTrace();
        }
    }

    private static MWLog giveController(JoinPoint joinPoint) throws Exception {
        Signature signature = joinPoint.getSignature();
        MethodSignature methodSignature = (MethodSignature) signature;
        Method method = methodSignature.getMethod();

        if (method != null) {
            return method.getAnnotation(MWLog.class);
        }
        return null;
    }

    public void insertLogSuccess(JoinPoint jp, MWLog logger) {
    }

    public void writeLogInfo(JoinPoint joinPoint, MWLog opLogger)
            throws Exception, IllegalAccessException {
        /**
         *
         * 此处可用来被调用写日志文件
         *
         */
    }
}
