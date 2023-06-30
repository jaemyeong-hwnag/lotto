package com.hjm.lotto.common.aspect

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.json.JSONObject
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.core.annotation.Order
import org.springframework.stereotype.Component
import org.springframework.web.context.request.RequestContextHolder
import org.springframework.web.context.request.ServletRequestAttributes

@Aspect
@Component
@Order(1)
class LoggingAspect {
    val logger: Logger = LoggerFactory.getLogger(LoggingAspect::class.java)

    @Before("JoinPointList.allRequestPoint()")
    fun logRequest(joinPoint: JoinPoint) {
        val className = joinPoint.signature.declaringTypeName
        val methodName = joinPoint.signature.name

        val requestAttributes = RequestContextHolder.currentRequestAttributes() as ServletRequestAttributes
        val request = requestAttributes.request
        val requestURI = request.requestURI
        val httpMethod = request.method
        val requestId = request.requestId
        val requestBody = JSONObject(request.parameterMap).toString()

        logger.info(
            "[{}] Request received - Controller: {}, Method: {}, RequestURI: {}, HttpMethod: {} Body: {}",

            requestId,
            className,
            methodName,
            requestURI,
            httpMethod,
            requestBody,
        )
    }
}