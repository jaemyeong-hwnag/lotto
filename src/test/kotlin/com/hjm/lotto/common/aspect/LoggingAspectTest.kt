package com.hjm.lotto.common.aspect

import io.kotest.core.spec.style.FreeSpec
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

class LoggingAspectTest(@Autowired val mockMvc: MockMvc) : FreeSpec() {
    init {
        mockMvc.get("/") {
            contentType = MediaType.APPLICATION_JSON
            accept = MediaType.APPLICATION_JSON
        }.andExpect {
            status { MockMvcResultMatchers.status().isOk }
            content { contentType(MediaType.APPLICATION_JSON) }
        }
    }
}