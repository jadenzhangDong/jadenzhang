package com.jadenzhang.springboottest.test.redisLock.utils;

import com.jadenzhang.springboottest.test.redisLock.config.SpringContextHolder;
import com.jadenzhang.springboottest.test.redisLock.lock.DistributedLocker;
import org.redisson.api.RCountDownLatch;
import org.redisson.api.RLock;
import org.redisson.api.RSemaphore;

import java.util.concurrent.TimeUnit;

/**
 * 分布式锁帮助类
 */
public class ReidsLockUtils {
    private static DistributedLocker distributedLocker = SpringContextHolder.getBean(DistributedLocker.class);

    /**
     * 加锁
     * @param lockKey
     * @return
     */
    public static RLock lock(String lockKey){
        return distributedLocker.lock(lockKey);
    }

    /**
     * 释放锁
     * @param lockKey
     */
    public static void unLock(String lockKey){
        distributedLocker.unlock(lockKey);
    }

    /**
     * 释放锁
     * @param rLock
     */
    public static void unLock(RLock rLock){
        distributedLocker.unlock(rLock);
    }

    /**
     * 带超时的锁
     * @param lockKey
     * @param timeout
     * @return
     */
    public static RLock lock(String lockKey, int timeout){
        return distributedLocker.lock(lockKey, timeout);
    }

    /**
     * 带超时的锁
     * @param lockKey
     * @param timeout
     * @param timeUnit
     * @return
     */
    public static RLock lock(String lockKey, int timeout, TimeUnit timeUnit){
        return distributedLocker.lock(lockKey, timeout, timeUnit);
    }

    /**
     * 尝试获取锁
     * @param lockKey
     * @param waitTime 最多等待时间
     * @param leaseTime 上锁后自动释放锁时间
     * @return
     */
    public static boolean tryLock(String lockKey, int waitTime, int leaseTime){
        return distributedLocker.tryLock(lockKey, TimeUnit.SECONDS, waitTime, leaseTime);
    }

    /**
     * 获取计数器
     * @param name
     * @return
     */
    public static RCountDownLatch getCountDownLatch(String name){
        return null;//distributedLocker.
    }

    /**
     * 获取信号量
     * @param name
     * @return
     */
    public static RSemaphore getSemaphore(String name){
        return null;//distributedLocker;
    }
}
