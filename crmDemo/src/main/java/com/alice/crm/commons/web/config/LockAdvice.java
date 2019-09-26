package com.alice.crm.commons.web.config;

import org.mp4parser.aspectj.lang.ProceedingJoinPoint;
import org.mp4parser.aspectj.lang.annotation.Around;
import org.mp4parser.aspectj.lang.annotation.Aspect;
import org.mp4parser.aspectj.lang.annotation.Pointcut;
import org.mp4parser.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.DefaultParameterNameDiscoverer;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/**
 * aop加redis锁
 */
@Aspect
@Component
public class LockAdvice {
//    private static Logger logger = LoggerFactory.getLogger(LockAdvice.class);
//
//    private BatTemplate batTemplate;
//
//    private BatLockFactory batLockFactory;
//
//    @Autowired
//    public LockAdvice(BatTemplate batTemplate) {
//        this.batTemplate = batTemplate;
//        this.batLockFactory = new BatLockFactory(batTemplate, "ulm-api");
//    }
//
//    @Pointcut("@annotation(com.pdd.service.ulm.common.annotation.RedisLock)")
//    private void lockPoint() {
//
//    }
//
//    @Around("lockPoint()")
//    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
//        if (!LeoManager.isUserLockEnable()) return joinPoint.proceed();
//
//        Method method = ((MethodSignature) joinPoint.getSignature()).getMethod();
//
//        RedisLock redisLock = method.getAnnotation(RedisLock.class);
//        String key = redisLock.value().trim();
//        long timeout = redisLock.timeout();
//        if (StringUtils.isEmpty(key)) {
//            return joinPoint.proceed();
//        } else if (key.startsWith("#")) {
//            String argName = key.substring(1);
//            String[] parameterNames = new DefaultParameterNameDiscoverer().getParameterNames(method);
//
//            for (int i = 0; i < parameterNames.length; i++) {
//                if (parameterNames[i].equals(argName)) {
//                    Object argValue = joinPoint.getArgs()[i];
//                    key = JsonUtils.toJson(argValue);
//                    break;
//                } else if (i + 1 == parameterNames.length) {
//                    return joinPoint.proceed();
//                }
//            }
//        }
//
//        key = "lock-" + key;
//
//        Object result;
//        final long LOCK_INTERNAL_MILLIS = 60L, LOCK_EXPIRE_SECONDS = 30 * 1000L;
//        BatLock lock = batLockFactory.build(key);
//        try {
//            logger.info("{} need lock ({}.{})", key, method.getClass().getName(), method.getName());
//            lock.setInterval(LOCK_INTERNAL_MILLIS, TimeUnit.MILLISECONDS);
//            lock.lock(timeout, LOCK_EXPIRE_SECONDS, TimeUnit.MILLISECONDS);
//            Assert.isTrue(lock.isLocked(), ErrorEnum.USER_REQUEST_TIMEOUT_ERROR);
//
//            result = joinPoint.proceed();
//        } catch (BatLockTimeoutException e) {
//            logger.error("{} get lock fail, cause by timeout", key, e);
//            throw new UlmBusinessException(ErrorEnum.USER_REQUEST_TIMEOUT_ERROR);
//        } finally {
//            lock.unlock();
//            logger.info("{} unlocked", key);
//        }
//        return result;
//    }
}
