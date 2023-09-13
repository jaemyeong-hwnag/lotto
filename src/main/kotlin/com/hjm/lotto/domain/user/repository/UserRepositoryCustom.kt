package com.hjm.lotto.domain.user.repository

import com.hjm.lotto.domain.user.dto.UserDto

interface UserRepositoryCustom {
    fun updateNameById(userDto: UserDto)
}