package com.hjm.lotto.application.dto

import com.hjm.lotto.common.UseYn
import java.util.*

data class UserDto(
    val userId: Long,
    val name: String,
    val account: String,
    val useYn: UseYn,
    val createAt: Date,
    val updateAt: Date?,
)