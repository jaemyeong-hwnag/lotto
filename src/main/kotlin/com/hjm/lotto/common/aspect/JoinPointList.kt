package com.hjm.lotto.common.aspect

import org.aspectj.lang.annotation.Pointcut


class JoinPointList {
    @Pointcut("execution(public * com.hjm.lotto.*.controller.*.*(..))")
    fun allRequestPoint() {}
}