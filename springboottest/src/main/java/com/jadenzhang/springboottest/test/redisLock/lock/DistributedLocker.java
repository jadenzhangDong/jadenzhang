package com.jadenzhang.springboottest.test.redisLock.lock;

import org.redisson.api.RLock;

import java.util.concurrent.TimeUnit;

public interface DistributedLocker {
    RLock lock(String lockKey);
    RLock lock(String lockKey, int timeout);
    RLock lock(String lockKey, int timeout, TimeUnit timeUnit);
    boolean tryLock(String lockKey, TimeUnit timeUnit, int waitTime, int leaseTime);
    void unlock(String lockKey);
    void unlock(RLock rLock);
}


