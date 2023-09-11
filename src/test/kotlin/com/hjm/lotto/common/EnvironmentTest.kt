package com.hjm.lotto.common

import io.kotest.core.spec.style.StringSpec
import io.kotest.extensions.system.withEnvironment
import io.kotest.matchers.booleans.shouldBeFalse
import io.kotest.matchers.booleans.shouldBeTrue
import io.kotest.matchers.equals.shouldBeEqual
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.DisplayName

@DisplayName("ServerNameTest 테스트")
class EnvironmentTest : StringSpec() {
    private val environment: String = "ENVIRONMENT"

    init {
        "value" {
            Environment.LOCAL.toString() shouldBeEqual  "LOCAL"
            Environment.DEVELOPMENT.toString() shouldBeEqual "DEVELOPMENT"
            Environment.QA.toString() shouldBeEqual "QA"
            Environment.STAGING.toString() shouldBeEqual "STAGING"
            Environment.PRODUCTION.toString() shouldBeEqual "PRODUCTION"
        }

        "size" {
            Environment.values().size shouldBeEqual 5
        }

        "fun isEqual" {
            withEnvironment(mapOf(environment to Environment.LOCAL.toString())) {
                Environment.LOCAL.isEqual().shouldBeTrue()
                Environment.DEVELOPMENT.isEqual().shouldBeFalse()
                Environment.QA.isEqual().shouldBeFalse()
                Environment.STAGING.isEqual().shouldBeFalse()
                Environment.PRODUCTION.isEqual().shouldBeFalse()
            }
            withEnvironment(mapOf(environment to Environment.DEVELOPMENT.toString())) {
                Environment.LOCAL.isEqual().shouldBeFalse()
                Environment.DEVELOPMENT.isEqual().shouldBeTrue()
                Environment.QA.isEqual().shouldBeFalse()
                Environment.STAGING.isEqual().shouldBeFalse()
                Environment.PRODUCTION.isEqual().shouldBeFalse()
            }
            withEnvironment(mapOf(environment to Environment.QA.toString())) {
                Environment.LOCAL.isEqual().shouldBeFalse()
                Environment.DEVELOPMENT.isEqual().shouldBeFalse()
                Environment.QA.isEqual().shouldBeTrue()
                Environment.STAGING.isEqual().shouldBeFalse()
                Environment.PRODUCTION.isEqual().shouldBeFalse()
            }
            withEnvironment(mapOf(environment to Environment.STAGING.toString())) {
                Environment.LOCAL.isEqual().shouldBeFalse()
                Environment.DEVELOPMENT.isEqual().shouldBeFalse()
                Environment.QA.isEqual().shouldBeFalse()
                Environment.STAGING.isEqual().shouldBeTrue()
                Environment.PRODUCTION.isEqual().shouldBeFalse()
            }
            withEnvironment(mapOf(environment to Environment.PRODUCTION.toString())) {
                Environment.LOCAL.isEqual().shouldBeFalse()
                Environment.DEVELOPMENT.isEqual().shouldBeFalse()
                Environment.QA.isEqual().shouldBeFalse()
                Environment.STAGING.isEqual().shouldBeFalse()
                Environment.PRODUCTION.isEqual().shouldBeTrue()
            }
        }
    }
}