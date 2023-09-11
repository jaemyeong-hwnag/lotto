package com.hjm.lotto.domain.repository

import com.hjm.lotto.application.dto.UserDto

interface UserRepositoryCustom {
    fun updateNameById(userDto: UserDto)
}