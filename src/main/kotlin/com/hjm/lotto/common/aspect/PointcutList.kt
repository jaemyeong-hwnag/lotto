package com.hjm.lotto.common.aspect

import org.aspectj.lang.annotation.Pointcut


class PointcutList {
    @Pointcut("execution(public * com.marketboro.marketbom.*.controller.*.*(..)))\"")
    fun allController() {
    }

    @Pointcut("@annotation(org.springframework.scheduling.annotation.Scheduled)")
    fun allScheduler() {
    }
}